package vista_controlador.admin;

import vista_controlador.login.vista_login;
import javax.swing.JOptionPane;
import Clases.Vendedor_Array;
import Clases.Vendedor;
import Auxiliares.Auxiliares;

public class crear_cuenta_admin extends javax.swing.JFrame {

    Vendedor_Array array1 = new Vendedor_Array();
    Auxiliares aux = new Auxiliares();

    public crear_cuenta_admin() {
        initComponents();
        array1.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j3 = new javax.swing.JPasswordField();
        j4 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        j2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        j1 = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        combo_DR = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 140, -1));

        j4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Crear Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, -1));

        j2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        j2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j2KeyPressed(evt);
            }
        });
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 140, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                                       Rol:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 250, 30));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("      DNI / RUC:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 180, -1));

        j1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        j1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j1KeyPressed(evt);
            }
        });
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 140, -1));

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente", "Vendedor" }));
        combobox.setSelectedIndex(1);
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 140, -1));

        combo_DR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        getContentPane().add(combo_DR, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 110, 30));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 250, 30));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id = array1.Correlativo();
        String nombre = j1.getText();
        String credential = j2.getText();
        String pre_cont = j4.getText();
        String contrasena = j3.getText();
        String rol = (String) combobox.getSelectedItem();
        rol = rol.toLowerCase();
        String combo_dr = (String) combo_DR.getSelectedItem();

        if (pre_cont.equals(contrasena) && !(aux.tf_are_empty(new Object[]{nombre, credential, pre_cont, contrasena}))) {
            switch (combo_dr) {
                case "DNI" -> {
                    if (credential.length() == 8) {
                        Vendedor vendedor1 = new Vendedor();
                        vendedor1.setCodigo(id);
                        vendedor1.setNombre(nombre);
                        vendedor1.setDni(credential);
                        vendedor1.setContrasena(contrasena);
                        vendedor1.setRol(rol);

                        array1.agregar(vendedor1);
                        array1.grabar_archivo(vendedor1);

                        vista_login v1 = new vista_login();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El DNI debe tener 8 digitos");
                        j2.setText("");
                    }
                }

                case "RUC" -> {
                    if (credential.length() == 11) {
                        Vendedor vendedor1 = new Vendedor();
                        vendedor1.setCodigo(id);
                        vendedor1.setNombre(nombre);
                        vendedor1.setDni(credential);
                        vendedor1.setContrasena(contrasena);
                        vendedor1.setRol(rol);

                        array1.agregar(vendedor1);
                        array1.grabar_archivo(vendedor1);

                        vista_login v1 = new vista_login();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El RUC debe tener 11 digitos");
                        j2.setText("");
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void j1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j1KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            j1.setEditable(false);
        } else {
            j1.setEditable(true);
        }
    }//GEN-LAST:event_j1KeyPressed

    private void j2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            j2.setEditable(false);
        } else {
            j2.setEditable(true);
        }
    }//GEN-LAST:event_j2KeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crear_cuenta_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_DR;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JPasswordField j3;
    private javax.swing.JPasswordField j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
