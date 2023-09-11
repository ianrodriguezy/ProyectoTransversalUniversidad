
package Universidad.AccesoaDatos;

import Universidad.Entidades.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;


public class AlumnoData {
    private Connection con;

    public AlumnoData() {
    }
    
    public static void guardarAlumno(Alumno alumno){
     
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
        JOptionPane.showMessageDialog(null, "Alta exitosa");

    }
    
    
    public static Alumno buscarAlumno(int id){
        
        return null;
    }
    
    public static Alumno buscarAlumnoPorDni(int dni){
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni=? AND estado = 1";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            ps.setInt(1, dni);
            ps = con.prepareStatement(sql);
            
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(1);
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }

        return alumno;

    }
    
    public static List <Alumno> listarAlumno(){
        return null;
    }
    
    public static void modificarAlumno(Alumno alumno){
        
    }
    
    public static void eliminarAlumno(int id){
        
    }
}
