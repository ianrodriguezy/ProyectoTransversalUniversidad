
package Universidad.Entidades;

import java.time.LocalDate;

public class Alumno {
    private int idAlumno;
    private String nombre, apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private int activo;

    public Alumno(int idAlumno, String nombre, String apellido,int dni, LocalDate fechaNacimiento, int activo) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni= dni;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
    }

    public Alumno(String nombre, String apellido,int dni, LocalDate fechaNacimiento, int activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni=dni;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
    }

    public Alumno() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return dni + ", " + nombre + ", " + apellido ;
    }

    
}
