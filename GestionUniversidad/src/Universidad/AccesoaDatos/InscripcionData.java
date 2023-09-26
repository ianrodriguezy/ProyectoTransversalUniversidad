/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad.AccesoaDatos;

import static Universidad.AccesoaDatos.AlumnoData.mostrarMensaje;
import Universidad.Entidades.Alumno;
import Universidad.Entidades.Inscripcion;
import Universidad.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.mariadb.jdbc.Statement;


public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
    }
    
    public static void guardarInscripcion(Inscripcion insc){
        Connection con = null;
        con=Conectar.getConectar();
        String sql= "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                
                insc.setIdInscripcion(rs.getInt(1));
                mostrarMensaje("Inscripción registrada.","Nueva inscripción","info");
            }
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inscripción, "+ex.getMessage(),"Error al conectar","error");
        }
        
    }
    
    public static List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones=new ArrayList<>();
        String sql="SELECT * FROM `inscripcion`";
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
       
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion inscripcion=new Inscripcion();
                Materia materia=new Materia();
                Alumno alumno = new Alumno();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getInt("nota"));
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                materia.setIdMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inscripción, "+ex.getMessage(),"Error al conectar","error");
            
        }
        return inscripciones;
    }
    
    public static List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        List<Inscripcion> inscripciones=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT inscripcion.idAlumno,inscripcion.idMateria,idInscripcion,nota,materia.nombre FROM `inscripcion` INNER JOIN materia ON inscripcion.idMateria=materia.idMateria INNER JOIN alumno ON inscripcion.idAlumno=alumno.idAlumno WHERE inscripcion.idAlumno="+id;
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Inscripcion inscripcion=new Inscripcion();
                Materia materia=new Materia();
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                materia.setIdMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                inscripcion.setNota(rs.getInt("nota"));
                materia.setNombre(rs.getString("nombre"));
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion);
            }
            ps.close();
        }catch(SQLException ex) {
           mostrarMensaje("Error al acceder a la tabla Materia, "+ex.getMessage(),"Error al conectar","error");
            
        }
        return inscripciones;
       
    }
    public static List<Materia> obtenerMateriasCursadas(int id){
        List <Materia> materiasCursadas= new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT inscripcion.idMateria, nombre, año FROM `inscripcion`, `materia` WHERE inscripcion.idMateria=materia.idMateria AND inscripcion.idAlumno="+id;
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materiasCursadas.add(materia);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inscripción, "+ex.getMessage(),"Error al conectar","error");
            
        }
        return materiasCursadas;
        
    }
    
    public static List<Materia> obtenerMateriasNoCursadas(int id){
        List <Materia> materiasNoCursadas= new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT * FROM materia WHERE estado=1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno="+id+")";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(1);
                materiasNoCursadas.add(materia);
            }
            ps.close();
        }catch(SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inscripción, "+ex.getMessage(),"Error al conectar","error");
            
        }
        return materiasNoCursadas;
    }
    
    public static void borrarInscripcionMateriaALumno(int idAlumno,int idMateria){
        Connection con = null;
        con=Conectar.getConectar();
        String sql= "DELETE FROM `inscripcion` WHERE idAlumno="+idAlumno+" AND idMateria="+idMateria;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            int filas=ps.executeUpdate();
            if(filas>0){
                mostrarMensaje("Inscripción eliminada.","Modificación","info");
            }
            
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inscripción, "+ex.getMessage(),"Error al conectar","error");
        }
        
    }
    
    public static void actualizarNota(int idAlumno,int idMateria,double nota){
        Connection con = null;
        con=Conectar.getConectar();
        String sql= "UPDATE `inscripcion` SET `nota`="+nota+" WHERE idAlumno="+idAlumno+" AND idMateria=" +idMateria;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            int filas=ps.executeUpdate();
            if(filas>0){
                mostrarMensaje("Nota actualizada.","Modificación","info");
            }
   
            ps.close();
        } catch (SQLException ex) {
            mostrarMensaje("Error al acceder a la tabla Inscripción, "+ex.getMessage(),"Error al conectar","error");
        }
        
                
                
    }
    public static List<Alumno> obtenerAlumnoPorMateria(int idMateria){
        List <Alumno> alumnos= new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT * FROM `alumno` WHERE idAlumno IN(SELECT idAlumno FROM inscripcion WHERE idMateria="+idMateria+")";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno=new Alumno();
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
            mostrarMensaje("Error al acceder a la tabla Inscripción y Alumno, "+ex.getMessage(),"Error al conectar","error");
            
        }
        return alumnos;
    }
   
}
