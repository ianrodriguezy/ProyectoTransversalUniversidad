/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Universidad.Vistas;

import Universidad.AccesoaDatos.AlumnoData;
import Universidad.AccesoaDatos.MateriaData;
import Universidad.Entidades.Alumno;
import Universidad.Entidades.Materia;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Ian
 */
public class GestionMaterias extends javax.swing.JInternalFrame {

    
    public GestionMaterias() {
        initComponents();
    }
    
    public void limpiar(){
        jtCodigo.setText("");
        jtAnio.setText("");
        jcbEstado.setSelected(false);
        jtNombre.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbEstado = new javax.swing.JCheckBox();

        jLabel1.setText("Materia");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jLabel5.setText("Estado");

        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });
        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigoKeyTyped(evt);
            }
        });

        jtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAnioKeyTyped(evt);
            }
        });

        jbBuscar.setText("Buscar");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                            .addComponent(jtNombre)
                                            .addComponent(jtAnio))
                                        .addGap(37, 37, 37)
                                        .addComponent(jbBuscar))
                                    .addComponent(jcbEstado)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jbEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbEstado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnioKeyTyped
       int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtAnio.getText().length()>=1){
           evt.consume();
       }
    }//GEN-LAST:event_jtAnioKeyTyped

    private void jtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyTyped
        int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtCodigo.getText().length()>=4){
           evt.consume();
       }
    }//GEN-LAST:event_jtCodigoKeyTyped

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        boolean ver = false;
        int aux;
       
        if (jtCodigo.getText().isEmpty() || jtNombre.getText().isEmpty() || jtAnio.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Todos o alguno de los campos se encuentran vacios, por favor rellene todos.");

        } else {
            if(MateriaData.buscarMateria(Integer.parseInt(jtCodigo.getText())).getIdMateria()==Integer.parseInt(jtCodigo.getText())){
                JOptionPane.showMessageDialog(null, "La materia que desea agregar ya existe.");
            }else{
            ver = true;
            if (jcbEstado.isSelected()) {
                aux = 1;
            } else {
                aux = 0;
            }
            Materia materia= new Materia(jtNombre.getText(), Integer.parseInt(jtAnio.getText()), aux);
            MateriaData.guardarMateria(materia);
            
            limpiar();
            
        }  }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
