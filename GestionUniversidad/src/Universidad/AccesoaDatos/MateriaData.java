/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad.AccesoaDatos;

import Universidad.Entidades.Alumno;
import Universidad.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;


public class MateriaData {
    private Connection con;

    public MateriaData() {
    }
    
    public static void guardarMateria(Materia materia){
        
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO `materia`( `nombre`, `año`, `estado`) VALUES ('"+materia.getNombre()+"','"+materia.getAnioMateria()+"','"+materia.getActivo()+"')";
        con = Conectar.getConectar();

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

        } catch (SQLException x) {
            System.out.println("Error " + x.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Materia creada exitosamente.");
    }
    
    public static Materia buscarMateria(int id, int nuevo){
        Materia materia = null;
        String sql = "SELECT `idMateria`, `nombre`, `año`, `estado` FROM `materia` WHERE idMateria ="+id;
        PreparedStatement ps = null;
        try {
            Connection con = null;
        
            con = Conectar.getConectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(rs.getInt("estado"));

            } else if(nuevo!=1){
                JOptionPane.showMessageDialog(null, "No existe la materia");

                ps.close();
            }
        }catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());

                    }
            return materia;
        }
    
    public static void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET `idMateria`=?,`nombre`=?,`año`=?,`estado`=? WHERE idMateria="+materia.getIdMateria();
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, materia.getIdMateria());
            ps.setString(2, materia.getNombre());
            ps.setInt(3, materia.getAnioMateria());
            ps.setInt(4,materia.getActivo());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }
    }
    
    public static void eliminarMateria(int id){ 
        Connection con = null;
        PreparedStatement ps = null;
        con = Conectar.getConectar();
        
        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = "+id;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");
        }
    }
    public static List<Materia> listarMaterias(){
     return null;   
    }
}
