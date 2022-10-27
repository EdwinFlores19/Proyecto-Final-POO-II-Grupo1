package vista_controlador.login;

import javax.swing.JOptionPane;
import Clases.Vendedor_Array;
import Clases.Vendedor;
import Auxiliares.Auxiliares;

public class crear_cuenta extends javax.swing.JFrame {

    Vendedor_Array array1 = new Vendedor_Array();
    Auxiliares aux = new Auxiliares();

    public crear_cuenta() {
        initComponents();
        array1.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pf_pass = new javax.swing.JPasswordField();
        tf_email = new javax.swing.JPasswordField();
        tf_credencial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nom = new javax.swing.JTextField();
        tf_ape = new javax.swing.JTextField();
        pf_pre_pass = new javax.swing.JPasswordField();
        tf_sexo = new javax.swing.JPasswordField();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        tf_dir = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        tf_dir_dist = new javax.swing.JPasswordField();
        tf_dir_prov = new javax.swing.JPasswordField();
        b_create_acc = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        cb_sel_creds = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pf_pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 140, -1));

        tf_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, 140, -1));

        tf_credencial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_credencial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_credencialKeyPressed(evt);
            }
        });
        getContentPane().add(tf_credencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 140, -1));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        tf_nom.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_nomKeyPressed(evt);
            }
        });
        getContentPane().add(tf_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 140, -1));
        getContentPane().add(tf_ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 140, 30));

        pf_pre_pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_pre_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 140, -1));

        tf_sexo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(tf_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, 140, -1));
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 140, 30));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("direccion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, -1, -1));

        tf_dir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(tf_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, 140, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("provincia:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, -1, -1));

        tf_dir_dist.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(tf_dir_dist, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 140, -1));

        tf_dir_prov.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(tf_dir_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 440, 140, -1));

        b_create_acc.setBackground(new java.awt.Color(255, 255, 255));
        b_create_acc.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create_acc.setForeground(new java.awt.Color(0, 0, 0));
        b_create_acc.setText("Crear Cuenta");
        b_create_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_create_accActionPerformed(evt);
            }
        });
        getContentPane().add(b_create_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, -1, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 180, -1));

        cb_sel_creds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        getContentPane().add(cb_sel_creds, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 90, 30));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("distrito:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("email:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("sexo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("DNI / ruc :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Confirmar contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 250, 30));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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

    private void b_create_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_create_accActionPerformed
        int id = array1.Correlativo();
        String nombre = tf_nom.getText();
        String credential = tf_credencial.getText();
        String pre_cont = pf_pre_pass.getText();
        String contrasena = pf_pass.getText();
        String combo_dr = (String) cb_sel_creds.getSelectedItem();

        if (pre_cont.equals(contrasena) && !(aux.tf_are_empty(new Object[]{nombre, credential, pre_cont, contrasena}))) {
            switch (combo_dr) {
                case "DNI" -> {
                    if (credential.length() == 8) {
                        Vendedor vendedor1 = new Vendedor();
                        vendedor1.setCodigo(id);
                        vendedor1.setNombre(nombre);
                        vendedor1.setDni(credential);
                        vendedor1.setContrasena(contrasena);
                        vendedor1.setRol("Cliente");

                        array1.agregar(vendedor1);
                        array1.grabar_archivo(vendedor1);

                        vista_login v1 = new vista_login();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El DNI debe tener 8 digitos");
                        tf_credencial.setText("");
                    }
                }

                case "RUC" -> {
                    if (credential.length() == 11) {
                        Vendedor vendedor1 = new Vendedor();
                        vendedor1.setCodigo(id);
                        vendedor1.setNombre(nombre);
                        vendedor1.setDni(credential);
                        vendedor1.setContrasena(contrasena);
                        vendedor1.setRol("Cliente");

                        array1.agregar(vendedor1);
                        array1.grabar_archivo(vendedor1);

                        vista_login v1 = new vista_login();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El RUC debe tener 11 digitos");
                        tf_credencial.setText("");
                    }
                }
            }
        }
    }//GEN-LAST:event_b_create_accActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        vista_login vlog = new vista_login();
        aux.change_jf(vlog, this);
    }//GEN-LAST:event_b_exitActionPerformed

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crear_cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton b_create_acc;
    private javax.swing.JButton b_exit;
    private javax.swing.JComboBox<String> cb_sel_creds;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPasswordField pf_pre_pass;
    private javax.swing.JTextField tf_ape;
    private javax.swing.JTextField tf_credencial;
    private javax.swing.JPasswordField tf_dir;
    private javax.swing.JPasswordField tf_dir_dist;
    private javax.swing.JPasswordField tf_dir_prov;
    private javax.swing.JPasswordField tf_email;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JPasswordField tf_sexo;
    // End of variables declaration//GEN-END:variables
}
