/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Universidad.Vistas;

import Universidad.AccesoaDatos.AlumnoData;
import static Universidad.AccesoaDatos.AlumnoData.mostrarMensaje;
import Universidad.AccesoaDatos.Conectar;
import Universidad.Entidades.Alumno;
import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
        
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;



public class GestionAlumnos extends javax.swing.JFrame {

    public int auxId;
    
    public GestionAlumnos() {
        super("Alumnos");
        initComponents();
        this.setLocationRelativeTo(null);
          
    }

    public void limpiar(){
            jtDoc.setText("");
            jtApellido.setText("");
            jtNombre.setText("");
            jdFechaNac.setDate(null);
            jrbEstado.setSelected(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPgestion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDoc = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jrbEstado = new javax.swing.JCheckBox();

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/alum.png"))); // NOI18N
        jLabel1.setText("ALUMNO");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Documento");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Estado");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");

        jtDoc.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtDoc.setToolTipText("");
        jtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocActionPerformed(evt);
            }
        });
        jtDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDocKeyTyped(evt);
            }
        });

        jtApellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
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

        javax.swing.GroupLayout jPgestionLayout = new javax.swing.GroupLayout(jPgestion);
        jPgestion.setLayout(jPgestionLayout);
        jPgestionLayout.setHorizontalGroup(
            jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPgestionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(59, 59, 59)
                .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPgestionLayout.createSequentialGroup()
                        .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbEstado))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPgestionLayout.createSequentialGroup()
                        .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jtNombre)
                            .addComponent(jtApellido))
                        .addGap(34, 34, 34)
                        .addComponent(jbBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPgestionLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jbNuevo)
                .addGap(29, 29, 29)
                .addComponent(jbEliminar)
                .addGap(31, 31, 31)
                .addComponent(jbGuardar)
                .addGap(31, 31, 31)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPgestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPgestionLayout.setVerticalGroup(
            jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPgestionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPgestionLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPgestionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jrbEstado)
                        .addGap(24, 24, 24)))
                .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPgestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPgestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPgestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDocActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        Alumno al = new Alumno();
       
        if (jtDoc.getText().isEmpty()) {
            mostrarMensaje("Ingrese un dni para buscar el Alumno.", "Error al buscar", "error");
        } else {
            
            boolean aux;
            if(AlumnoData.buscarAlumnoPorDni(Integer.parseInt(jtDoc.getText()),0)!=null){
                al=AlumnoData.buscarAlumnoPorDni(Integer.parseInt(jtDoc.getText()),0);
                if (al.getActivo() == 1 ) {
                aux = true;
            } else{
                aux = false;
            }
            jtDoc.setText(al.getDni() + "");
            jtApellido.setText(al.getApellido());
            jtNombre.setText(al.getNombre());
            jdFechaNac.setDate(java.sql.Date.valueOf(al.getFechaNacimiento()));
            jrbEstado.setSelected(aux);
            if(!al.getApellido().isEmpty()){
                jbEliminar.setEnabled(true);
                jbGuardar.setEnabled(true);
                this.auxId=al.getIdAlumno();
            }
            }
            
            
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        int aux;

        if (jtDoc.getText().isEmpty() || jtApellido.getText().isEmpty() || jtNombre.getText().isEmpty() || jdFechaNac.getDate() == null) {
            mostrarMensaje("Todos o alguno de los campos se encuentran vacios, por favor rellene todos.", "Error al crear Alumno", "error");
        } else {
            if(AlumnoData.buscarAlumnoPorDni(Integer.parseInt(jtDoc.getText()),1)!=null){
                mostrarMensaje("El Alumno que desea agregar ya existe.", "Error al crear Alumno", "error");
            }else{
            
            if (jrbEstado.isSelected()) {
                aux = 1;
            } else {
                aux = 0;
            }
            LocalDate fecha = jdFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            java.sql.Date jdate = java.sql.Date.valueOf(fecha);
            Alumno alumno = new Alumno(jtNombre.getText(), jtApellido.getText(), Integer.parseInt(jtDoc.getText()), fecha, aux);
            AlumnoData.guardarAlumno(alumno);
            limpiar();
            jbEliminar.setEnabled(false);
            jbGuardar.setEnabled(false);
        }   }
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        MenuPrincipal menu=new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDocKeyReleased
        
    }//GEN-LAST:event_jtDocKeyReleased

    private void jtDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDocKeyTyped
        int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtDoc.getText().length()>=8){
           evt.consume();
       }
    }//GEN-LAST:event_jtDocKeyTyped

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        AlumnoData.eliminarAlumno(auxId);
        jbGuardar.setEnabled(false);
        jbEliminar.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int aux;
        
        if (jtDoc.getText().isEmpty() || jtApellido.getText().isEmpty() || jtNombre.getText().isEmpty() || jdFechaNac.getDate() == null) {
            mostrarMensaje("Todos o alguno de los campos se encuentran vacios, por favor rellene todos.", "Error al crear Alumno", "error");
        }else{
            if (jrbEstado.isSelected()) {
                aux = 1;
            } else {
                aux = 0;
            }

            Alumno alumno=new Alumno(auxId,jtNombre.getText(), jtApellido.getText(), Integer.parseInt(jtDoc.getText()), jdFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),aux);
            AlumnoData.modificarAlumno(alumno);
            jbGuardar.setEnabled(false);
            jbEliminar.setEnabled(false);
            limpiar();
        }     
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPgestion;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JCheckBox jrbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDoc;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
