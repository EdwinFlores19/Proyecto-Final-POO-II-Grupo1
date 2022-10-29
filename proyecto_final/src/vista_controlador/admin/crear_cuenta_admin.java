package vista_controlador.admin;

import vista_controlador.login.vista_login;
import javax.swing.JOptionPane;
import Clases.Cliente;
import Clases.Cliente_Array;
import Clases.Trabajador;
import Clases.Trabajador_Array;
import Auxiliares.Auxiliares;

public class crear_cuenta_admin extends javax.swing.JFrame {

    Cliente_Array array1 = new Cliente_Array();
    Trabajador_Array arrayt = new Trabajador_Array();
    Auxiliares aux = new Auxiliares();

    public crear_cuenta_admin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crear_cta_cliente = new javax.swing.JFrame();
        tf_nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_ape = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_dir = new javax.swing.JTextField();
        tf_dir_dist = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_dir_prov = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_sexo = new javax.swing.JTextField();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        b_create = new javax.swing.JButton();
        b_exit_f = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();
        pf_pass = new javax.swing.JPasswordField();
        pf_pre_pass = new javax.swing.JPasswordField();
        b_next = new javax.swing.JButton();
        tf_credencial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_exit = new javax.swing.JButton();
        combo_rol = new javax.swing.JComboBox<>();
        combo_credencial = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        crear_cta_cliente.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        crear_cta_cliente.setSize(1280, 720);
        crear_cta_cliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_nom.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_nomKeyPressed(evt);
            }
        });
        crear_cta_cliente.getContentPane().add(tf_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 140, -1));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        crear_cta_cliente.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellido:");
        crear_cta_cliente.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        tf_ape.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_apeActionPerformed(evt);
            }
        });
        tf_ape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_apeKeyPressed(evt);
            }
        });
        crear_cta_cliente.getContentPane().add(tf_ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 140, 30));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("direccion:");
        crear_cta_cliente.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));

        tf_dir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        crear_cta_cliente.getContentPane().add(tf_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 140, 30));

        tf_dir_dist.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_dir_dist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_dir_distKeyPressed(evt);
            }
        });
        crear_cta_cliente.getContentPane().add(tf_dir_dist, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 140, 30));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("distrito:");
        crear_cta_cliente.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("provincia:");
        crear_cta_cliente.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        tf_dir_prov.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_dir_prov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_dir_provKeyPressed(evt);
            }
        });
        crear_cta_cliente.getContentPane().add(tf_dir_prov, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 140, 30));

        tf_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        crear_cta_cliente.getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 140, 30));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("email:");
        crear_cta_cliente.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("sexo:");
        crear_cta_cliente.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        tf_sexo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_sexoKeyPressed(evt);
            }
        });
        crear_cta_cliente.getContentPane().add(tf_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 140, 30));
        crear_cta_cliente.getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 140, 30));

        jLabel13.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Fecha de nacimiento:");
        crear_cta_cliente.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        b_create.setBackground(new java.awt.Color(255, 255, 255));
        b_create.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create.setForeground(new java.awt.Color(0, 0, 0));
        b_create.setText("Crear Cuenta");
        b_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createActionPerformed(evt);
            }
        });
        crear_cta_cliente.getContentPane().add(b_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 180, -1));

        b_exit_f.setBackground(new java.awt.Color(255, 255, 255));
        b_exit_f.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit_f.setForeground(new java.awt.Color(0, 0, 0));
        b_exit_f.setText("SALIR");
        b_exit_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exit_fActionPerformed(evt);
            }
        });
        crear_cta_cliente.getContentPane().add(b_exit_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, 180, -1));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.jpg"))); // NOI18N
        crear_cta_cliente.getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pf_pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pf_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf_passActionPerformed(evt);
            }
        });
        getContentPane().add(pf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 140, -1));

        pf_pre_pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_pre_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 140, -1));

        b_next.setBackground(new java.awt.Color(255, 255, 255));
        b_next.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_next.setForeground(new java.awt.Color(0, 0, 0));
        b_next.setText("SIGUIENTE");
        b_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nextActionPerformed(evt);
            }
        });
        getContentPane().add(b_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 180, -1));

        tf_credencial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_credencial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_credencialKeyPressed(evt);
            }
        });
        getContentPane().add(tf_credencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 140, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                                       Rol:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 250, 30));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("      DNI / RUC:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, 180, -1));

        combo_rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente", "Vendedor" }));
        combo_rol.setSelectedIndex(1);
        getContentPane().add(combo_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 140, 30));

        combo_credencial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        getContentPane().add(combo_credencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 110, 30));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 250, 30));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void b_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nextActionPerformed
        String combo_dr = (String) combo_credencial.getSelectedItem();
        String combo_r = (String) combo_rol.getSelectedItem();
        /*funcion q depende de los combos para pasar a la sgte ventana de cliente*/
        aux.change_jf(crear_cta_cliente, this);
    }//GEN-LAST:event_b_nextActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void tf_credencialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_credencialKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            tf_credencial.setEditable(false);
        } else {
            tf_credencial.setEditable(true);
        }
    }//GEN-LAST:event_tf_credencialKeyPressed

    private void b_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createActionPerformed
        int id = array1.Correlativo();
        String nombre = tf_nom.getText();
        String apellido = tf_ape.getText();
        String credential = tf_credencial.getText();
        String pre_cont = pf_pre_pass.getText();
        String contrasena = pf_pass.getText();
        String direccion = tf_dir.getText();
        String direccion_prov = tf_dir_prov.getText();
        String direccion_dist = tf_dir_dist.getText();
        String email = tf_email.getText();
        String sexo = tf_sexo.getText();
        String nacimiento = Fecha.getDateFormatString();
        String combo_dr = (String) combo_credencial.getSelectedItem();

        if (pre_cont.equals(contrasena) && !(aux.tf_are_empty(new Object[]{nombre, credential, pre_cont, contrasena}))) {
            if (combo_dr == "DNI" && credential.length() == 8) {
                if ("Cliente" == combo_rol.getSelectedItem()) {
                    Cliente clt = new Cliente();

                    clt.setCli_cod(id);
                    clt.setCli_nombre(nombre);
                    clt.setCli_apellido(apellido);
                    clt.setCli_sexo(sexo);
                    clt.setCli_nacimiento(nacimiento);
                    clt.setCli_dir(direccion);
                    clt.setCli_dir_distr(direccion_dist);
                    clt.setCli_dir_prov(direccion_prov);
                    clt.setUser_credencial(credential);
                    clt.setUser_password(contrasena);
                    clt.setUser_rol("Cliente");

                    array1.agregar(clt);
                    array1.grabar_arch_cliente(clt);

                    vista_login v1 = new vista_login();
                    aux.change_jf(v1, this);
                } else if (combo_rol.getSelectedItem() == "Vendedor") {
                    Trabajador tra = new Trabajador();
                    tra.setTrab_cod(id);
                    tra.setTrab_nombre(nombre);
                    tra.setTrab_apellido(apellido);
                    tra.setTrab_nacimiento(nacimiento);
                    tra.setTrab_sexo(sexo);
                    tra.setTrab_email(email);
                    tra.setTrab_dir(direccion);
                    tra.setTrab_dir_distr(direccion_dist);
                    tra.setTrab_dir_prov(direccion_prov);
                    tra.setTrab_seguro("Essalud");
                    tra.setTrab_sist_pen("AFP");
                    tra.setTrab_sueldo(1290.0);
                    tra.setTrab_hijos(2);
                    tra.setUser_credencial(credential);
                    tra.setUser_password(contrasena);
                    tra.setUser_rol("Vendedor");

                    arrayt.agregar(tra);
                    arrayt.grabar_arch_trabajador(tra);

                    vista_login v1 = new vista_login();
                    aux.change_jf(v1, this);
                } else if (combo_rol.getSelectedItem() == "Administrador") {

                    Trabajador tra = new Trabajador();
                    tra.setTrab_cod(id);
                    tra.setTrab_nombre(nombre);
                    tra.setTrab_apellido(apellido);
                    tra.setTrab_nacimiento(nacimiento);
                    tra.setTrab_sexo(sexo);
                    tra.setTrab_email(email);
                    tra.setTrab_dir(direccion);
                    tra.setTrab_dir_distr(direccion_dist);
                    tra.setTrab_dir_prov(direccion_prov);
                    tra.setTrab_seguro("Essalud");
                    tra.setTrab_sist_pen("AFP");
                    tra.setTrab_sueldo(1290.0);
                    tra.setTrab_hijos(2);
                    tra.setUser_credencial(credential);
                    tra.setUser_password(contrasena);
                    tra.setUser_rol("Administrador");

                    arrayt.agregar(tra);
                    arrayt.grabar_arch_trabajador(tra);

                    vista_login v1 = new vista_login();
                    aux.change_jf(v1, this);
                }

            } else if (combo_dr == "RUC") {

            }

            /*switch (combo_dr) {
                case "DNI" -> {
                    if (credential.length() == 8) {
                        Cliente clt = new Cliente(id,nombre,apellido,sexo,nacimiento,direccion,direccion_dist,direccion_prov,email,credential, contrasena, "Cliente");
                        
                        array1.agregar(clt);
                        array1.grabar_arch_cliente(clt);
                        
                        vista_login v1 = new vista_login();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El DNI debe tener 8 digitos");
                        tf_credencial.setText("");
                    }
                }

                case "RUC" -> {
                    if (credential.length() == 11) {
                        Cliente clt = new Cliente(id,nombre,apellido,sexo,nacimiento,direccion,direccion_dist,direccion_prov,email,credential, contrasena, "Cliente");
                        
                        array1.agregar(clt);
                        array1.grabar_arch_cliente(clt);

                        vista_login v1 = new vista_login();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El RUC debe tener 11 digitos");
                        tf_credencial.setText("");
                    }
                }*/
        }


    }//GEN-LAST:event_b_createActionPerformed

    private void b_exit_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exit_fActionPerformed
        admin_1 admin = new admin_1();
        aux.change_jf(admin, this);
    }//GEN-LAST:event_b_exit_fActionPerformed

    private void tf_nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nomKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nom.setEditable(false);
        } else {
            tf_nom.setEditable(true);
        }
    }//GEN-LAST:event_tf_nomKeyPressed

    private void tf_dir_distKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dir_distKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nom.setEditable(false);
        } else {
            tf_nom.setEditable(true);
        }
    }//GEN-LAST:event_tf_dir_distKeyPressed

    private void tf_dir_provKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_dir_provKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nom.setEditable(false);
        } else {
            tf_nom.setEditable(true);
        }
    }//GEN-LAST:event_tf_dir_provKeyPressed

    private void tf_sexoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_sexoKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nom.setEditable(false);
        } else {
            tf_nom.setEditable(true);
        }
    }//GEN-LAST:event_tf_sexoKeyPressed

    private void tf_apeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_apeKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tf_nom.setEditable(false);
        } else {
            tf_nom.setEditable(true);
        }
    }//GEN-LAST:event_tf_apeKeyPressed

    private void tf_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_apeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_apeActionPerformed

    private void pf_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf_passActionPerformed

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
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JButton b_create;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_exit_f;
    private javax.swing.JButton b_next;
    private javax.swing.JComboBox<String> combo_credencial;
    private javax.swing.JComboBox<String> combo_rol;
    private javax.swing.JFrame crear_cta_cliente;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField tf_dir;
    private javax.swing.JTextField tf_dir_dist;
    private javax.swing.JTextField tf_dir_prov;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nom;
    private javax.swing.JTextField tf_sexo;
    // End of variables declaration//GEN-END:variables
}
