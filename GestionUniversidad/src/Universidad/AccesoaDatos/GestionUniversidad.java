/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Universidad.AccesoaDatos;

import Universidad.Vistas.MenuPrincipal;

/**
 *
 * @author Ian
 */
public class GestionUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conectar.getConectar();
        MenuPrincipal miApp= new MenuPrincipal();
        
        //miApp.repaint();
        miApp.setVisible(true);
        //miApp.repaint();
    }
    
}
