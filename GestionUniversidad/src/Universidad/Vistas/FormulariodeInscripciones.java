
package Universidad.Vistas;

import Universidad.AccesoaDatos.AlumnoData;
import static Universidad.AccesoaDatos.AlumnoData.mostrarMensaje;
import Universidad.AccesoaDatos.InscripcionData;
import static Universidad.AccesoaDatos.InscripcionData.guardarInscripcion;
import Universidad.AccesoaDatos.MateriaData;
import Universidad.Entidades.Alumno;
import Universidad.Entidades.Inscripcion;
import Universidad.Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class FormulariodeInscripciones extends javax.swing.JFrame {
 
    List alumnos=new ArrayList<>();
    
    
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    
    
    private void cargarModelo (){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtablaMaterias.setModel(modelo);
        
    }
    
    
    
    public FormulariodeInscripciones() {
         super("Formulario de Inscripción");
        initComponents();
        this.setLocationRelativeTo(null);
        alumnos=AlumnoData.listarAlumno();
           cargarCombo();
           cargarModelo();
          
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
        jcbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablaMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnularInsc = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbInscriptas = new javax.swing.JCheckBox();
        jcbNoInscriptas = new javax.swing.JCheckBox();

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/inscripcion.png"))); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCIÓN");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Selecciona un Alumno");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        jcbAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbAlumnosItemStateChanged(evt);
            }
        });
        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jtablaMaterias.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtablaMaterias);

        jbInscribir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInsc.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbAnularInsc.setText("Anular Inscripción");
        jbAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcbInscriptas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jcbInscriptas.setText("Materias Inscriptas");
        jcbInscriptas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbInscriptasItemStateChanged(evt);
            }
        });
        jcbInscriptas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jcbInscriptasStateChanged(evt);
            }
        });
        jcbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbInscriptasActionPerformed(evt);
            }
        });

        jcbNoInscriptas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jcbNoInscriptas.setText("Materias no Inscriptas");
        jcbNoInscriptas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbNoInscriptasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbInscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAnularInsc)
                .addGap(86, 86, 86)
                .addComponent(jbSalir)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jcbInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbNoInscriptas)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbInscriptas)
                    .addComponent(jcbNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAnularInsc)
                    .addComponent(jbInscribir)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbNoInscriptasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbNoInscriptasItemStateChanged
        Alumno alumno=(Alumno)jcbAlumnos.getSelectedItem();
        if(evt.getStateChange()== java.awt.event.ItemEvent.DESELECTED){
            borrarFilas();

        }else if(alumno==null){
            mostrarMensaje("No seleccionó ningún Alumno","Error","error");
        }else{
            borrarFilas();
            jcbInscriptas.setSelected(false);
            jbAnularInsc.setEnabled(false);
            jbInscribir.setEnabled(true);
            for(Materia m : InscripcionData.obtenerMateriasNoCursadas(alumno.getIdAlumno())){
                modelo.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnioMateria()});}
    }//GEN-LAST:event_jcbNoInscriptasItemStateChanged

    private void jcbInscriptasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jcbInscriptasStateChanged
   //asd
    }//GEN-LAST:event_jcbInscriptasStateChanged

    private void jcbInscriptasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbInscriptasItemStateChanged

        Alumno alumno=(Alumno)jcbAlumnos.getSelectedItem();
        if(evt.getStateChange()== java.awt.event.ItemEvent.DESELECTED){
            borrarFilas();

        }else if(alumno==null){
            mostrarMensaje("No seleccionó ningún Alumno","Error","error");
        }else{
            borrarFilas();
            jcbNoInscriptas.setSelected(false);
            jbAnularInsc.setEnabled(true);
            jbInscribir.setEnabled(false);
            for(Materia m : InscripcionData.obtenerMateriasCursadas(alumno.getIdAlumno())){
                modelo.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnioMateria()});}
        }
    }//GEN-LAST:event_jcbInscriptasItemStateChanged

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        MenuPrincipal menu=new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscActionPerformed
        Alumno alumno= (Alumno) jcbAlumnos.getSelectedItem();

        if(jtablaMaterias.getSelectedRow()==-1){
            mostrarMensaje("Seleccione una materia para eliminar inscripción","Error","error");
        }else{
            Materia mat=new Materia();
            mat.setIdMateria((int)jtablaMaterias.getValueAt(jtablaMaterias.getSelectedRow(), 0));
            InscripcionData.borrarInscripcionMateriaALumno(alumno.getIdAlumno(), mat.getIdMateria());
            borrarFilas();
            jcbInscriptas.setSelected(true);
            jbAnularInsc.setEnabled(true);
            jbInscribir.setEnabled(false);
            for(Materia m : InscripcionData.obtenerMateriasCursadas(alumno.getIdAlumno())){
                modelo.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnioMateria()});}
        }

    }//GEN-LAST:event_jbAnularInscActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        Alumno alumno= (Alumno) jcbAlumnos.getSelectedItem();

        if(jtablaMaterias.getSelectedRow()==-1){
            mostrarMensaje("Seleccione una materia para inscribir","Error","error");
        }else{
            Materia mat=new Materia();
            mat.setIdMateria((int)jtablaMaterias.getValueAt(jtablaMaterias.getSelectedRow(), 0));
            Inscripcion insc= new Inscripcion(alumno,mat, 0);
            guardarInscripcion(insc);
            borrarFilas();
            jcbInscriptas.setSelected(false);
            jbAnularInsc.setEnabled(false);
            jbInscribir.setEnabled(true);
            for(Materia m : InscripcionData.obtenerMateriasNoCursadas(alumno.getIdAlumno())){
                modelo.addRow(new Object[]{
                    m.getIdMateria(),
                    m.getNombre(),
                    m.getAnioMateria()});}
        }

    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed

    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jcbAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbAlumnosItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.DESELECTED) {
            borrarFilas();
            jcbInscriptas.setSelected(false);
            jcbNoInscriptas.setSelected(false);
        }
    }//GEN-LAST:event_jcbAlumnosItemStateChanged

    private void jcbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbInscriptasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbInscriptasActionPerformed
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAnularInsc;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JCheckBox jcbInscriptas;
    private javax.swing.JCheckBox jcbNoInscriptas;
    private javax.swing.JTable jtablaMaterias;
    // End of variables declaration//GEN-END:variables

private void cargarCombo(){

DefaultComboBoxModel<Alumno> modeloCombo = new DefaultComboBoxModel<>();

 modeloCombo.addElement((Alumno) null);
for (Object alumno : alumnos) {
    modeloCombo.addElement((Alumno) alumno);
}

jcbAlumnos.setModel(modeloCombo);

}

private void borrarFilas() {
        int f;
        int filas = jtablaMaterias.getRowCount() - 1;

        for (f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}



