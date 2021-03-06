package vistas.Estudiante;

import vistas.*;
import FiveCodLogin.FormLogin;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Util.CambiaPanel;


public class frmPrincipal_estudiante extends javax.swing.JFrame implements KeyListener {

    //variables estaticas
    public frmPrincipal_estudiante() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setColor(btnBiblioteca);
        resetColor(new JPanel[]{btnCerrar});

        //ArrayList{
        new CambiaPanel(pnl_host, new vistas.biblioteca.frmBiblioteca());
        lbl_nav.setText("Bienvenido");

        lbl_nav2.setText("Estudiante");

        // keylistener
        addKeyListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        side_pane = new javax.swing.JPanel();
        btnBiblioteca = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnl_overlay = new javax.swing.JPanel();
        lbl_nav2 = new javax.swing.JLabel();
        lbl_nav = new javax.swing.JLabel();
        pnl_host = new javax.swing.JPanel();
        lblminimizar = new javax.swing.JLabel();
        lblcerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel4KeyPressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_pane.setBackground(new java.awt.Color(23, 35, 51));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBiblioteca.setBackground(new java.awt.Color(23, 35, 51));
        btnBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBibliotecaMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Biblioteca");

        javax.swing.GroupLayout btnBibliotecaLayout = new javax.swing.GroupLayout(btnBiblioteca);
        btnBiblioteca.setLayout(btnBibliotecaLayout);
        btnBibliotecaLayout.setHorizontalGroup(
            btnBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBibliotecaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        btnBibliotecaLayout.setVerticalGroup(
            btnBibliotecaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBibliotecaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btnBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 2));
        side_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("MSV");
        side_pane.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(23, 35, 51));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCerrarMouseReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cerrar sesi??n");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

        jPanel4.add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 620));

        pnl_overlay.setBackground(new java.awt.Color(255, 0, 0));
        pnl_overlay.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lbl_nav2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nav2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_nav2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nav2.setText("Estudiante");

        lbl_nav.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_nav.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nav.setText("Bienvenido");

        javax.swing.GroupLayout pnl_overlayLayout = new javax.swing.GroupLayout(pnl_overlay);
        pnl_overlay.setLayout(pnl_overlayLayout);
        pnl_overlayLayout.setHorizontalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overlayLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nav)
                    .addComponent(lbl_nav2))
                .addContainerGap(741, Short.MAX_VALUE))
        );
        pnl_overlayLayout.setVerticalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overlayLayout.createSequentialGroup()
                .addComponent(lbl_nav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_nav2)
                .addGap(16, 16, 16))
        );

        jPanel4.add(pnl_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 910, 90));

        pnl_host.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(pnl_host, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 910, 490));

        lblminimizar.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblminimizar.setText("-");
        lblminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblminimizarMousePressed(evt);
            }
        });
        jPanel4.add(lblminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 20, 30));

        lblcerrar.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        lblcerrar.setText("x");
        lblcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblcerrarMousePressed(evt);
            }
        });
        jPanel4.add(lblcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 20, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBibliotecaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBibliotecaMousePressed

        setColor(btnBiblioteca);
        resetColor(new JPanel[]{btnCerrar});
        
        lbl_nav2.setText("Biblioteca");
        new CambiaPanel(pnl_host, new vistas.biblioteca.frmBiblioteca());
    }//GEN-LAST:event_btnBibliotecaMousePressed

    private void lblminimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMousePressed

    }//GEN-LAST:event_lblminimizarMousePressed

    private void lblcerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcerrarMousePressed

        System.exit(0);
    }//GEN-LAST:event_lblcerrarMousePressed

    private void lblminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizarMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminimizarMouseClicked

    private void jPanel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel4KeyPressed

    }//GEN-LAST:event_jPanel4KeyPressed

    private void btnCerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseReleased
        setColor(btnCerrar);
        resetColor(new JPanel[]{btnBiblioteca});
        vistas.FormLogin login = new vistas.FormLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarMouseReleased

    public static void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    public static void resetColor(JPanel[] pane) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(23, 35, 51));

        }

    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel btnBiblioteca;
    public static javax.swing.JPanel btnCerrar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lbl_nav;
    public static javax.swing.JLabel lbl_nav2;
    private javax.swing.JLabel lblcerrar;
    private javax.swing.JLabel lblminimizar;
    public static javax.swing.JPanel pnl_host;
    private javax.swing.JPanel pnl_overlay;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        //nada bro
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        try {

        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        //nada bro
    }
}
