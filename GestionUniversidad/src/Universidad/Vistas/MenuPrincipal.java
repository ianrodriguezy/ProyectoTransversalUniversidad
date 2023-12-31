
package Universidad.Vistas;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/contenido/icon.png")).getImage());
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Root = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemFormAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemGestionMaterias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemManejoInscripciones = new javax.swing.JMenuItem();
        itemManipulacionNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemConsultaAlumnoPorMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad de la Punta");
        setResizable(false);

        Root.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/fondoredu.png"))); // NOI18N
        Root.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jMenu1.setText("Alumno");

        itemFormAlumno.setText("Formulario de Alumno");
        itemFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFormAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(itemFormAlumno);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Materia");

        itemGestionMaterias.setText("Formulario de Materia");
        itemGestionMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGestionMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(itemGestionMaterias);

        jMenuBar.add(jMenu2);

        jMenu3.setText("Administracion");

        itemManejoInscripciones.setText("Manejo de Inscripciones");
        itemManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(itemManejoInscripciones);

        itemManipulacionNotas.setText("Manipulacion de Notas");
        itemManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemManipulacionNotasActionPerformed(evt);
            }
        });
        jMenu3.add(itemManipulacionNotas);

        jMenuBar.add(jMenu3);

        jMenu4.setText("Consultas");

        itemConsultaAlumnoPorMateria.setText("Alumnos por Materia");
        itemConsultaAlumnoPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaAlumnoPorMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(itemConsultaAlumnoPorMateria);

        jMenuBar.add(jMenu4);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar.add(jmSalir);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemManejoInscripcionesActionPerformed
       FormulariodeInscripciones fi = new FormulariodeInscripciones();
       fi.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_itemManejoInscripcionesActionPerformed

    private void itemFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFormAlumnoActionPerformed
       GestionAlumnos ga = new GestionAlumnos();
       ga.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_itemFormAlumnoActionPerformed

    private void itemGestionMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestionMateriasActionPerformed
       
       GestionMaterias gm = new GestionMaterias();
       gm.setVisible(true);
       this.setVisible(false);
      
    }//GEN-LAST:event_itemGestionMateriasActionPerformed

    private void itemManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemManipulacionNotasActionPerformed
       
       gestionNotas gn = new gestionNotas();
       gn.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_itemManipulacionNotasActionPerformed

    private void itemConsultaAlumnoPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaAlumnoPorMateriaActionPerformed

      
       ConsultaAlumnoPorMateria cam = new ConsultaAlumnoPorMateria();
       cam.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_itemConsultaAlumnoPorMateriaActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
       int opcion=JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?", "", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            // El usuario seleccionó "Sí", realiza la acción correspondiente
            System.exit(0);
        }   
    }//GEN-LAST:event_jmSalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Root;
    private javax.swing.JLabel bg;
    private javax.swing.JMenuItem itemConsultaAlumnoPorMateria;
    private javax.swing.JMenuItem itemFormAlumno;
    private javax.swing.JMenuItem itemGestionMaterias;
    private javax.swing.JMenuItem itemManejoInscripciones;
    private javax.swing.JMenuItem itemManipulacionNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
