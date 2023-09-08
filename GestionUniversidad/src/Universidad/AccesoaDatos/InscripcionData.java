/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad.AccesoaDatos;

import Universidad.Entidades.Alumno;
import Universidad.Entidades.Inscripcion;
import Universidad.Entidades.Materia;
import java.sql.Connection;
import java.util.List;


public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
    }
    
    public static void guardadInscripcion(Inscripcion insc){
        
    }
    
    public static List<Inscripcion> obtenerInscripciones(){
        return null;
    }
    public static List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        return null;
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
