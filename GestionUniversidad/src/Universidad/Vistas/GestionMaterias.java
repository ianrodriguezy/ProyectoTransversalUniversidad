/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Universidad.Vistas;

import Universidad.AccesoaDatos.AlumnoData;
import static Universidad.AccesoaDatos.AlumnoData.mostrarMensaje;
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
public class GestionMaterias extends javax.swing.JFrame {
    
    
    public GestionMaterias() {
        super("Materia");
        initComponents();
        this.setLocationRelativeTo(null);
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

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/materias.png"))); // NOI18N
        jLabel1.setText("MATERIAS");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Estado");

        jtCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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

        jtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jtAnio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAnioKeyTyped(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jbEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel5))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jcbEstado)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(jbBuscar)))))
                        .addGap(15, 15, 15)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jcbEstado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        if (jtCodigo.getText().isEmpty() || jtNombre.getText().isEmpty() || jtAnio.getText().isEmpty()) {
            
            mostrarMensaje("Todos o alguno de los campos se encuentran vacios, por favor rellene todos.", "Error al crear Materia", "error");

        } else {
            if (MateriaData.buscarMateria(Integer.parseInt(jtCodigo.getText()), 1) != null) {
                mostrarMensaje("La materia que desea agregar ya existe.", "Error al crear Materia", "error");
            } else {
                ver = true;
                if (jcbEstado.isSelected()) {
                    aux = 1;
                } else {
                    aux = 0;
                }
                
                Materia materia = new Materia(jtNombre.getText(), Integer.parseInt(jtAnio.getText()), aux);
                MateriaData.guardarMateria(materia);

                limpiar();

            }
        }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        MenuPrincipal menu=new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       Materia mat = new Materia();
       
        if (jtCodigo.getText().isEmpty()) {
            mostrarMensaje("Ingrese un codigo para buscar la Materia.", "Error al buscar", "error");
        } else {
            
            boolean aux;
            if(MateriaData.buscarMateria(Integer.parseInt(jtCodigo.getText()), 0)!=null){
                mat=MateriaData.buscarMateria(Integer.parseInt(jtCodigo.getText()), 0);
                
                if (mat.getActivo() == 1 ) {
                aux = true;
            } else{
                aux = false;
            }
                jtCodigo.setText(mat.getIdMateria()+"");
                jtNombre.setText(mat.getNombre());
                jtAnio.setText(mat.getAnioMateria()+"");
                jcbEstado.setSelected(aux);
            
                
            if(!mat.getNombre().isEmpty()){
                jbEliminar.setEnabled(true);
                jbGuardar.setEnabled(true);
                jtCodigo.setEnabled(false);
            }
            }
            
            
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        MateriaData.eliminarMateria(Integer.parseInt(jtCodigo.getText()));
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jtCodigo.setEnabled(true);
        limpiar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int aux;
        
        if (jtCodigo.getText().isEmpty() || jtNombre.getText().isEmpty() ||  jtAnio.getText().isEmpty()) {
            mostrarMensaje("Todos o alguno de los campos se encuentran vacios, por favor rellene todos.", "Error al modificar Materia", "error");
        }else{
            if (jcbEstado.isSelected()) {
                aux = 1;
            } else {
                aux = 0;
            }

            Materia materia=new Materia(Integer.parseInt(jtCodigo.getText()), jtNombre.getText(),Integer.parseInt(jtAnio.getText()), aux);
            MateriaData.modificarMateria(materia);
            jbGuardar.setEnabled(false);
            jbEliminar.setEnabled(false);
            jtCodigo.setEnabled(true);
            limpiar();
        }     
    }//GEN-LAST:event_jbGuardarActionPerformed


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
