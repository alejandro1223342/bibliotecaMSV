package vistas.docente;

import vistas.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mxrck.autocompleter.TextAutoCompleter;
import modelo.controllers.SubirLibroController;
import modelos.entidades.CategoriasModel;
import modelos.entidades.MateriasModel;


public class frmUsuarios_SubirLibros extends javax.swing.JPanel {

  private SubirLibroController sbc; 
  private TextAutoCompleter autoCompletarCategoria, autoCompletarMateria;

    public frmUsuarios_SubirLibros() {
        initComponents();
        // se inicializa el controller
        sbc = new SubirLibroController();
        
        // se carga lista con las categorias y materias
        ArrayList<CategoriasModel> listaCategorias = sbc.actionFindAllCategorias();
        ArrayList<MateriasModel> listaMaterias = sbc.actionFindAllMaterias();
       
        
        //se inicializa el AUTOCOMPLETAR EN LOS INPUTS txtcategoria y txtmateria
        autoCompletarCategoria = new TextAutoCompleter(txtcategoria);
        autoCompletarMateria = new TextAutoCompleter(txtmateria);
        
        //se carga la predicción de los autocompletadores con las listas categorias y materias
        sbc.llenarPrediccion(autoCompletarCategoria, autoCompletarMateria, listaCategorias, listaMaterias);
        
        
        
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblActividad = new javax.swing.JLabel();
        lblColaborador = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btncategoria = new javax.swing.JButton();
        btnmaterias = new javax.swing.JButton();
        btnSubirLibro = new javax.swing.JButton();
        pnlDatosLibro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtUrl = new javax.swing.JTextField();
        txtcategoria = new javax.swing.JTextField();
        txtmateria = new javax.swing.JTextField();
        btnborrarcat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcategorias = new javax.swing.JTable();
        btnborrarmat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblmaterias = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(252, 251, 251));

        lblActividad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblActividad.setText("Categoria");

        lblColaborador.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblColaborador.setText("Materias:");

        btncategoria.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btncategoria.setText("OK");
        btncategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoriaActionPerformed(evt);
            }
        });

        btnmaterias.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnmaterias.setText("OK");
        btnmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmateriasActionPerformed(evt);
            }
        });

        btnSubirLibro.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnSubirLibro.setText("Subir Libro");
        btnSubirLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirLibroActionPerformed(evt);
            }
        });

        pnlDatosLibro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Título:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("URL:");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        txtUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosLibroLayout = new javax.swing.GroupLayout(pnlDatosLibro);
        pnlDatosLibro.setLayout(pnlDatosLibroLayout);
        pnlDatosLibroLayout.setHorizontalGroup(
            pnlDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(pnlDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo)
                    .addComponent(txtDescripcion)
                    .addComponent(txtAutor)
                    .addComponent(txtUrl))
                .addContainerGap())
        );
        pnlDatosLibroLayout.setVerticalGroup(
            pnlDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLibroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDatosLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLibroLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDatosLibroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtUrl, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        txtcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcategoriaActionPerformed(evt);
            }
        });

        txtmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmateriaActionPerformed(evt);
            }
        });

        btnborrarcat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnborrarcat.setText("Borrar categorias");
        btnborrarcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarcatActionPerformed(evt);
            }
        });

        tblcategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORÍA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblcategorias);

        btnborrarmat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnborrarmat.setText("Borrar materias");
        btnborrarmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarmatActionPerformed(evt);
            }
        });

        tblmaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MATERIAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblmaterias);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblActividad)
                                .addGap(18, 18, 18)
                                .addComponent(txtcategoria)
                                .addGap(18, 18, 18)
                                .addComponent(btncategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btnborrarmat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblColaborador)
                                .addGap(18, 18, 18)
                                .addComponent(txtmateria))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnborrarcat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDatosLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubirLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(pnlDatosLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubirLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btncategoria)
                                .addGap(30, 30, 30)
                                .addComponent(btnborrarcat))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblActividad))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmaterias)
                            .addComponent(lblColaborador))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnborrarmat)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirLibroActionPerformed
     
        
    }//GEN-LAST:event_btnSubirLibroActionPerformed

    private void btnmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmateriasActionPerformed

    private void btncategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoriaActionPerformed

    }//GEN-LAST:event_btncategoriaActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUrlActionPerformed

    private void txtcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategoriaActionPerformed

    private void txtmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmateriaActionPerformed

    private void btnborrarcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnborrarcatActionPerformed

    private void btnborrarmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarmatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnborrarmatActionPerformed

   

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubirLibro;
    private javax.swing.JButton btnborrarcat;
    private javax.swing.JButton btnborrarmat;
    private javax.swing.JButton btncategoria;
    private javax.swing.JButton btnmaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblActividad;
    private javax.swing.JLabel lblColaborador;
    private javax.swing.JPanel pnlDatosLibro;
    private javax.swing.JTable tblcategorias;
    private javax.swing.JTable tblmaterias;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUrl;
    public static javax.swing.JTextField txtcategoria;
    public static javax.swing.JTextField txtmateria;
    // End of variables declaration//GEN-END:variables
}
