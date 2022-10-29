package vista_controlador.login;

import javax.swing.JOptionPane;
import Clases.Array_vendedor;
import auxiliares.Auxiliares;

public class crear_cuenta extends javax.swing.JFrame {

    Array_vendedor array1 = new Array_vendedor();
    Auxiliares aux = new Auxiliares();

    public crear_cuenta() {
        initComponents();
        array1.inicializar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_group = new javax.swing.ButtonGroup();
        pf_pass = new javax.swing.JPasswordField();
        pf_pre_pass = new javax.swing.JPasswordField();
        b_create = new javax.swing.JButton();
        tf_credencial = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        b_exit = new javax.swing.JButton();
        tf_nombre = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        l9 = new javax.swing.JLabel();
        rad_otro = new javax.swing.JRadioButton();
        Fecha = new com.toedter.calendar.JDateChooser();
        tf_email = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        tf_provincia = new javax.swing.JTextField();
        l11 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        tf_distrito = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        rad_femenino = new javax.swing.JRadioButton();
        rad_masculino = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pf_pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 140, -1));

        pf_pre_pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_pre_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, -1));

        b_create.setBackground(new java.awt.Color(255, 255, 255));
        b_create.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create.setForeground(new java.awt.Color(0, 0, 0));
        b_create.setText("Crear Cuenta");
        b_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createActionPerformed(evt);
            }
        });
        getContentPane().add(b_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, -1));

        tf_credencial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_credencial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_credencialKeyPressed(evt);
            }
        });
        getContentPane().add(tf_credencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 140, -1));

        l4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("Confirmar contraseña:");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 250, 30));

        l2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("credencial:");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("atras");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 180, -1));

        tf_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_nombreKeyPressed(evt);
            }
        });
        getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 140, -1));

        tf_apellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_apellidoKeyPressed(evt);
            }
        });
        getContentPane().add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 140, -1));

        tf_direccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(tf_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 140, -1));

        l9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));
        l9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l9.setText("direccion:");
        getContentPane().add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        b_group.add(rad_otro);
        rad_otro.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        rad_otro.setForeground(new java.awt.Color(255, 255, 255));
        rad_otro.setText("Otro");
        getContentPane().add(rad_otro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 200, -1, -1));
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 140, 30));

        tf_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 140, -1));

        l6.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l6.setText("email:");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        l8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l8.setText("Nacimiento:");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        tf_provincia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_provincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_provinciaKeyPressed(evt);
            }
        });
        getContentPane().add(tf_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 140, -1));

        l11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l11.setForeground(new java.awt.Color(255, 255, 255));
        l11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l11.setText("provincia:");
        getContentPane().add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        l10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l10.setForeground(new java.awt.Color(255, 255, 255));
        l10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l10.setText("distrito:");
        getContentPane().add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        tf_distrito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_distrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_distritoKeyPressed(evt);
            }
        });
        getContentPane().add(tf_distrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 140, -1));

        l5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("Apellido:");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, -1));

        l7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l7.setText("sexo:");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 70, -1));

        l3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Contraseña:");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        l1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Nombre:");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        b_group.add(rad_femenino);
        rad_femenino.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        rad_femenino.setForeground(new java.awt.Color(255, 255, 255));
        rad_femenino.setText("Femenino");
        getContentPane().add(rad_femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, -1, -1));

        b_group.add(rad_masculino);
        rad_masculino.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        rad_masculino.setForeground(new java.awt.Color(255, 255, 255));
        rad_masculino.setText("Masculino");
        getContentPane().add(rad_masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createActionPerformed
        int id = array1.Correlativo();
        String dni = tf_credencial.getText();
        String pre_cont = pf_pre_pass.getText();
        String contrasena = pf_pass.getText();
        String nombre = tf_nombre.getText();
        String apellido = tf_apellido.getText();
        String nacimiento = (String) Fecha.getDateFormatString();
        String sexo = b_group.getSelection().toString().toLowerCase();
        String email = tf_email.getText();
        String direccion = tf_direccion.getText();
        String distrito = tf_distrito.getText();
        String provincia = tf_provincia.getText();

        if (!aux.tf_are_empty(new Object[]{tf_credencial, pf_pre_pass, pf_pass, tf_nombre, tf_apellido, sexo, nacimiento, tf_email, tf_direccion, tf_distrito, tf_provincia})) {
            if (pre_cont.equals(contrasena)) {
                if (dni.length() == 8) {
                    /*Necesitar clases arregladas*/
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El DNI debe tener 8 digitos");
                    tf_credencial.setText("");
                    pf_pass.setText("");
                    pf_pre_pass.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Las contrasenas deben ser iguales y no vacias");
                pf_pass.setText("");
                pf_pre_pass.setText("");
            }
        }
    }//GEN-LAST:event_b_createActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void tf_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nombre.setEditable(false);
        } else {
            tf_nombre.setEditable(true);
        }
    }//GEN-LAST:event_tf_nombreKeyPressed

    private void tf_credencialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_credencialKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            tf_credencial.setEditable(false);
        } else {
            tf_credencial.setEditable(true);
        }
    }//GEN-LAST:event_tf_credencialKeyPressed

    private void tf_apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_apellidoKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nombre.setEditable(false);
        } else {
            tf_nombre.setEditable(true);
        }
    }//GEN-LAST:event_tf_apellidoKeyPressed

    private void tf_provinciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_provinciaKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nombre.setEditable(false);
        } else {
            tf_nombre.setEditable(true);
        }
    }//GEN-LAST:event_tf_provinciaKeyPressed

    private void tf_distritoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_distritoKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nombre.setEditable(false);
        } else {
            tf_nombre.setEditable(true);
        }
    }//GEN-LAST:event_tf_distritoKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crear_cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton b_create;
    private javax.swing.JButton b_exit;
    private javax.swing.ButtonGroup b_group;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPasswordField pf_pre_pass;
    private javax.swing.JRadioButton rad_femenino;
    private javax.swing.JRadioButton rad_masculino;
    private javax.swing.JRadioButton rad_otro;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_credencial;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_distrito;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_provincia;
    // End of variables declaration//GEN-END:variables
}
