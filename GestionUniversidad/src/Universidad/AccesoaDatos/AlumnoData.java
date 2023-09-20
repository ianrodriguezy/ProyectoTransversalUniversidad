package Universidad.AccesoaDatos;

import Universidad.Entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con=null;

    public AlumnoData() {
    }

    public static void guardarAlumno(Alumno alumno) {

        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO `alumno`(`dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) VALUES ('" + alumno.getDni() + "','" + alumno.getApellido() + "','" + alumno.getNombre() + "','" + alumno.getFechaNacimiento() + "','" + alumno.getActivo() + "')";
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException x) {
            System.out.println("Error " + x.getMessage());
        }
         mostrarMensaje("Alta exitosa.","Creacion de Alumno","info");
        

    }

    public static Alumno buscarAlumno(int id) throws SQLException {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        PreparedStatement ps = null;
        try {
            Connection con = null;
        
        con = Conectar.getConectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(1);

            } else {
                mostrarMensaje("No existe el Alumno ","Error al buscar","error");

                ps.close();
            }
        }catch (SQLException ex) {
                        mostrarMensaje("Error al acceder a la tabla Alumno, " + ex.getMessage(),"Error de conexión","error");

                    }
            return alumno;
    }
    

    public static Alumno buscarAlumnoPorDni(int dni, int nuevo) {
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento,estado FROM alumno WHERE dni=?";
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getInt("estado"));

            } else if (nuevo!=1){
                mostrarMensaje("No existe el Alumno ","Error al buscar","error");
            }
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Alumno, " + ex.getMessage(),"Error de conexión","error");
        }

        return alumno;

    }

    public static List<Alumno> listarAlumno() {
        List<Alumno> alumnos=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT * FROM `alumno` WHERE estado=1";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno= new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(rs.getInt("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Alumno, " + ex.getMessage(),"Error de conexión","error");
            
        }
        return alumnos;
    }

    public static void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, fechaNacimiento = ?, estado=? WHERE idAlumno="+alumno.getIdAlumno();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getActivo());
            ps.setInt(6, alumno.getIdAlumno());
            

            int exito = ps.executeUpdate();
            if (exito == 1) {
                mostrarMensaje("Modificado exitosamente.","Modificacion de Alumno","info");
            } else {
                mostrarMensaje("El alumno no existe","Error al eliminar","error");
            }
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Alumno, " + ex.getMessage(),"Error de conexión","error");
        }
    }

    public static void eliminarAlumno(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = "+id;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                mostrarMensaje("Se eliminó el alumno.","Borrado de Alumno","info");
            }
            ps.close();
        } catch (SQLException e) {
            mostrarMensaje("Error al acceder a la tabla Alumno","Error al conectar","error");
        }
    }
    
    public static void mostrarMensaje(String mensaje,String titulo,String tipo ){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog= optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
