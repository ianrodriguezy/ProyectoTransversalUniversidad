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
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class ConsultaAlumnoPorMateria extends javax.swing.JFrame {

    List materias=new ArrayList<>();
    public ConsultaAlumnoPorMateria() {
         super("Consulta de Alumnos");
        initComponents();
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
        bg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumXmat = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/fondo_1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/lista.png"))); // NOI18N
        jLabel1.setText("ALUMNOS POR MATERIA");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione una materia");

        jcbMaterias.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jcbMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbMateriasItemStateChanged(evt);
            }
        });

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
        jScrollPane1.setViewportView(jtAlumXmat);

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
                .addGap(45, 45, 45)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240)
                .addComponent(jbSalir))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcbMaterias;
    private javax.swing.JTable jtAlumXmat;
    // End of variables declaration//GEN-END:variables
}
