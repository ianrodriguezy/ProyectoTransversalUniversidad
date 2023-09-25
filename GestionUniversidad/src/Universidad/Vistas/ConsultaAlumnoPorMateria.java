/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Universidad.Vistas;

import Universidad.AccesoaDatos.InscripcionData;
import Universidad.AccesoaDatos.MateriaData;
import Universidad.Entidades.Alumno;
import Universidad.Entidades.Inscripcion;
import Universidad.Entidades.Materia;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaAlumnoPorMateria extends javax.swing.JFrame {

    List materias=new ArrayList<>();
    public ConsultaAlumnoPorMateria() {
         super("Consulta de Alumnos");
        initComponents();
         setIconImage(new ImageIcon(getClass().getResource("/contenido/icon.png")).getImage());
        this.setLocationRelativeTo(null);
        materias=MateriaData.listarMaterias();
        cargarCombo();
        cargarModelo();
        cargarTabla();
    }
     private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private void cargarModelo (){
        modelo.addColumn("ID");
        modelo.addColumn("Dni");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jtAlumXmat.setModel(modelo);
        
    }
    private void cargarTabla(){
        Materia mat=new Materia();
       mat=(Materia)jcbMaterias.getSelectedItem();
       borrarFilas();
       for(Alumno alum : InscripcionData.obtenerAlumnoPorMateria(mat.getIdMateria())){
           modelo.addRow(new Object []{
               alum.getIdAlumno(),
               alum.getDni(),
               alum.getApellido(),
               alum.getNombre()
            });
       }   
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbMaterias = new javax.swing.JComboBox<>();
        scroll = new javax.swing.JScrollPane();
        jtAlumXmat = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/lista.png"))); // NOI18N
        jLabel1.setText("ALUMNOS POR MATERIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione una materia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jcbMaterias.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jcbMaterias.setBorder(null);
        jcbMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbMateriasItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 179, -1));

        scroll.setForeground(new java.awt.Color(255, 255, 0));

        jtAlumXmat.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtAlumXmat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scroll.setViewportView(jtAlumXmat);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 119, 510, 250));

        jbSalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setBorder(null);
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 65, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/fondoventana.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       MenuPrincipal menu=new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbMateriasItemStateChanged
       cargarTabla();
      
    }//GEN-LAST:event_jcbMateriasItemStateChanged

    private void cargarCombo() {

        DefaultComboBoxModel<Materia> modeloCombo = new DefaultComboBoxModel<>();

        for (Object mat : materias) {
            modeloCombo.addElement((Materia) mat);
        }
        jcbMaterias.setModel(modeloCombo);

    }
    private void borrarFilas() {
        int f;
        int filas = jtAlumXmat.getRowCount() - 1;

        for (f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcbMaterias;
    private javax.swing.JTable jtAlumXmat;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
