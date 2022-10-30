package vista_controlador.admin;

import vista_controlador.vista_login;
import Clases.Trabajador_Array;
import javax.swing.JOptionPane;
import auxiliares.Auxiliares;

public class admin_crear_cuenta extends javax.swing.JFrame {

    Trabajador_Array array1 = new Trabajador_Array();
    Auxiliares aux = new Auxiliares();

    public admin_crear_cuenta() {
        initComponents();
        array1.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_cliente = new javax.swing.JFrame();
        pf_contra = new javax.swing.JPasswordField();
        pf_pre_contra = new javax.swing.JPasswordField();
        tf_credencial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_exit = new javax.swing.JButton();
        tf_nom = new javax.swing.JTextField();
        combo_rol = new javax.swing.JComboBox<>();
        combo_DR = new javax.swing.JComboBox<>();
        b_next = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pf_contra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 140, -1));

        pf_pre_contra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_pre_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 140, -1));

        tf_credencial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_credencial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_credencialKeyPressed(evt);
            }
        });
        getContentPane().add(tf_credencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 140, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("                                       Rol:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 250, 30));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("      credencial:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 180, -1));

        tf_nom.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_nomKeyPressed(evt);
            }
        });
        getContentPane().add(tf_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 140, -1));

        combo_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente", "Vendedor" }));
        combo_rol.setSelectedIndex(1);
        getContentPane().add(combo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 140, -1));

        combo_DR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        getContentPane().add(combo_DR, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 110, 30));

        b_next.setBackground(new java.awt.Color(255, 255, 255));
        b_next.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_next.setForeground(new java.awt.Color(0, 0, 0));
        b_next.setText("siguiente");
        b_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nextActionPerformed(evt);
            }
        });
        getContentPane().add(b_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 180, -1));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Confirmar contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 250, 30));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void tf_nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nomKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nom.setEditable(false);
        } else {
            tf_nom.setEditable(true);
        }
    }//GEN-LAST:event_tf_nomKeyPressed

    private void tf_credencialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_credencialKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            tf_credencial.setEditable(false);
        } else {
            tf_credencial.setEditable(true);
        }
    }//GEN-LAST:event_tf_credencialKeyPressed

    private void b_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nextActionPerformed
        aux.change_jf(frame_cliente, this);
    }//GEN-LAST:event_b_nextActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_crear_cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_next;
    private javax.swing.JComboBox<String> combo_DR;
    private javax.swing.JComboBox<String> combo_rol;
    private javax.swing.JLabel fondo;
    private javax.swing.JFrame frame_cliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField pf_contra;
    private javax.swing.JPasswordField pf_pre_contra;
    private javax.swing.JTextField tf_credencial;
    private javax.swing.JTextField tf_nom;
    // End of variables declaration//GEN-END:variables
}
