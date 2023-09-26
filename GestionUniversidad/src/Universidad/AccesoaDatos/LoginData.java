/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad.AccesoaDatos;

import static Universidad.AccesoaDatos.AlumnoData.mostrarMensaje;
import Universidad.Vistas.MenuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginData {
    
    public static boolean ingresar(String user, String pass){
        String sql = "SELECT usuario, contraseña FROM usuarios";
        PreparedStatement ps = null;
        String usuario=null;
        String contrasenia=null;
        boolean ingreso=false;
        try {
            Connection con = null;
            
            con = Conectar.getConectar();
            ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario=rs.getString(1);
                contrasenia=rs.getString(2);
                
            }
            if(user.equals(usuario)&& pass.equals(contrasenia)){
                    mostrarMensaje("Bienvenido " + usuario, "Ingreso", "info");
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);
                    ingreso=true;
                }
            else if(!user.equals(usuario)|| pass.equals(contrasenia)){
                mostrarMensaje("Usuario o contraseña incorrectos.","Error al ingresar","error");
                
                ps.close();
            }
        }catch (SQLException ex) {
                        mostrarMensaje("Error al acceder a la tabla usuarios, " + ex.getMessage(),"Error de conexión","error");
                    }
        return ingreso;
 
    }
}
