
package Universidad.AccesoaDatos;

import Universidad.Entidades.Alumno;
import java.sql.Connection;
import java.util.List;


public class AlumnoData {
    private Connection con;

    public AlumnoData() {
    }
    
    public static void guardarAlumno(Alumno alumno){
        
    }
    
    public static Alumno buscarAlumno(int id){
        return null;
    }
    
    public static Alumno buscarAlumnoPorDni(int dni){
        return null;
    }
    
    public static List <Alumno> listarAlumno(){
        return null;
    }
    
    public static void modificarAlumno(Alumno alumno){
        
    }
    
    public static void eliminarAlumno(int id){
        
    }
}
