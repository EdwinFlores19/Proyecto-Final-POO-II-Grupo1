package vista_controlador.login;

import javax.swing.JOptionPane;
/*import proyecto_final.Array_vendedor;
import proyecto_final.Vendedor;*/
import auxiliares.Auxiliares;

public class vista_login extends javax.swing.JFrame {

    /*Array_vendedor array1 = new Array_vendedor();*/
    Auxiliares aux = new Auxiliares();
    
    public vista_login() {
        initComponents();
        //array1.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_create_acc = new javax.swing.JButton();
        tf_credencial = new javax.swing.JTextField();
        pf_contrasena = new javax.swing.JPasswordField();
        b_iniciar_sesion = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jlabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_create_acc.setBackground(new java.awt.Color(255, 255, 255));
        b_create_acc.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        b_create_acc.setForeground(new java.awt.Color(0, 0, 0));
        b_create_acc.setText("Crear Cuenta");
        b_create_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_create_accActionPerformed(evt);
            }
        });
        getContentPane().add(b_create_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, -1, -1));

        tf_credencial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_credencial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_credencialKeyPressed(evt);
            }
        });
        getContentPane().add(tf_credencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 140, -1));

        pf_contrasena.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 140, -1));

        b_iniciar_sesion.setBackground(new java.awt.Color(255, 255, 255));
        b_iniciar_sesion.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_iniciar_sesion.setForeground(new java.awt.Color(0, 0, 0));
        b_iniciar_sesion.setText("Iniciar Sesion");
        b_iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_iniciar_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(b_iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        l2.setBackground(java.awt.Color.white);
        l2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l2.setText("Contraseña:");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 130, 60));

        l1.setBackground(java.awt.Color.white);
        l1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l1.setText("credencial:");
        l1.setFocusable(false);
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 150, 50));

        jlabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        jlabelfondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jlabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_create_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_create_accActionPerformed
        crear_cuenta c1 = new crear_cuenta();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_create_accActionPerformed

    private void b_iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_iniciar_sesionActionPerformed
        String dni = tf_credencial.getText();
        String contrasena = pf_contrasena.getText();

        /*Clase

        if (ven1.getContrasena().equals(contrasena)) {
            JOptionPane.showMessageDialog(rootPane, "Bienvenido a nuestra plataforma!!!");
            interfazP i1 = new interfazP();
            aux.change_jf(i1, this);
        } else if ("error".equals(ven1.getContrasena())) {
            JOptionPane.showMessageDialog(rootPane, "Dni y/o contrasena incorrectas");
            tf_credencial.setText("");
            pf_contrasena.setText("");
        }*/
    }//GEN-LAST:event_b_iniciar_sesionActionPerformed

    private void tf_credencialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_credencialKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            tf_credencial.setEditable(false);
        } else {
            tf_credencial.setEditable(true);
        }
    }//GEN-LAST:event_tf_credencialKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_create_acc;
    private javax.swing.JButton b_iniciar_sesion;
    private javax.swing.JLabel jlabelfondo;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JPasswordField pf_contrasena;
    private javax.swing.JTextField tf_credencial;
    // End of variables declaration//GEN-END:variables
}
