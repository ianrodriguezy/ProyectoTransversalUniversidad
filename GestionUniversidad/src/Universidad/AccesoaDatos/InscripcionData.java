/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad.AccesoaDatos;

import Universidad.Entidades.Alumno;
import Universidad.Entidades.Inscripcion;
import Universidad.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
                JOptionPane.showMessageDialog(null, "Inscripción registrada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion.");
        }
        
    }
    
    public static List<Inscripcion> obtenerInscripciones(){
        String sql="SELECT * FROM `inscripcion` INNER JOIN materia ON inscripcion.idMateria=materia.idMateria INNER JOIN alumno ON inscripcion.idAlumno=alumno.idAlumno";
        return null;
    }
    
    public static List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        List<Inscripcion> inscripciones=new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try{
            String sql= "SELECT inscripcion.idAlumno,inscripcion.idMateria,idInscripcion,nota FROM `inscripcion` INNER JOIN materia ON inscripcion.idMateria=materia.idMateria INNER JOIN alumno ON inscripcion.idAlumno=alumno.idAlumno WHERE inscripcion.idAlumno="+id;
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
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion);
            }
            ps.close();
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
            
        }
        return inscripciones;
       
    }
    public static List<Materia> obtenerMateriasCursadas(int id){
        return null;
    }
    
    public static List<Materia> obtenerMateriasNoCursadas(int id){
        return null;
    }
    
    public static void borrarInscripcionMateriaALumno(int idAlumno,int idMateria){
    }
    
    public static void actualizarNota(int idAlumno,int idMateria,double nota){
        
    }
    public static List<Alumno> obtenerAlumnoPorMateria(int idMateria){
        return null;
    }
   
}
