
package Universidad.Vistas;

import Universidad.AccesoaDatos.AlumnoData;
import static Universidad.AccesoaDatos.AlumnoData.mostrarMensaje;
import Universidad.AccesoaDatos.InscripcionData;
import Universidad.Entidades.Alumno;
import Universidad.Entidades.Inscripcion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class gestionNotas extends javax.swing.JFrame {

    List alumnos=new ArrayList<>();
    List inscripciones=new ArrayList<>();
    
    public gestionNotas() {
        super("Carga de notas");
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/contenido/icon.png")).getImage());
        this.setLocationRelativeTo(null);
        alumnos=AlumnoData.listarAlumno();
        cargarCombo();
        cargarModelo();
    }
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
           
        return c==2;
    }
    
    };

    private void cargarModelo() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jTablaNotas.setModel(modelo);

    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaNotas = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/NOTA.png"))); // NOI18N
        jLabel1.setText("CARGA DE NOTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Seleccione un Alumno");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 95, -1, -1));

        jcbAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnoItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 89, 185, -1));

        jTablaNotas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTablaNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaNotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTablaNotasKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaNotas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 121, 500, 254));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 387, -1, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 387, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/ventanaFondo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        MenuPrincipal menu=new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Alumno alumno = new Alumno();
        alumno=(Alumno)jcbAlumno.getSelectedItem();
        if(alumno==null){
            mostrarMensaje("No seleccionó ningún Alumno","Error","error");
        }else if(jTablaNotas.getSelectedRowCount()==0){
            mostrarMensaje("No seleccionó ninguna fila o la tabla se encuentra vacía","Error","error");
        }else{
            try {

                InscripcionData.actualizarNota(alumno.getIdAlumno(), Integer.parseInt(modelo.getValueAt(jTablaNotas.getSelectedRow(),0).toString()), Double.parseDouble(modelo.getValueAt(jTablaNotas.getSelectedRow(), 2).toString()));

            } catch (NumberFormatException e) {
                mostrarMensaje("Ingrese solamente numeros", "Error", "error");
            }
    }//GEN-LAST:event_jbGuardarActionPerformed
    }
    private void jTablaNotasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablaNotasKeyTyped

    }//GEN-LAST:event_jTablaNotasKeyTyped

    private void jcbAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnoItemStateChanged
        Alumno alumno=(Alumno)jcbAlumno.getSelectedItem();
        if(alumno==null){
            mostrarMensaje("No seleccionó ningún Alumno","Error","error");
            borrarFilas();
        }else{
            borrarFilas();
            for (Inscripcion insc : InscripcionData.obtenerInscripcionesPorAlumno(alumno.getIdAlumno())){
                modelo.addRow(new Object []{
                    insc.getMateria().getIdMateria(),
                    insc.getMateria().getNombre(),
                    insc.getNota()
                });
            }}
    }//GEN-LAST:event_jcbAlumnoItemStateChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaNotas;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {

        DefaultComboBoxModel<Alumno> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Alumno)null);
        for (Object alumno : alumnos) {
            modeloCombo.addElement((Alumno) alumno);
        }
        jcbAlumno.setModel(modeloCombo);

    }
    private void borrarFilas() {
        int f;
        int filas = jTablaNotas.getRowCount() - 1;

        for (f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}

