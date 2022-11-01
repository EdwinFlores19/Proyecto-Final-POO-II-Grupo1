package vista_controlador;

import javax.swing.JOptionPane;
import proyecto_final.usuario_Array;
import auxiliares.Auxiliares;
import proyecto_final.Cliente;
import proyecto_final.Usuario;
import proyecto_final.cliente_Array;

public class crear_cuenta extends javax.swing.JFrame {

    usuario_Array usuario_a = new usuario_Array();
    Auxiliares aux = new Auxiliares();
    cliente_Array cliente_a = new cliente_Array();

    public crear_cuenta() {
        initComponents();
        usuario_a.inicializar();
        cliente_a.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password2_ = new javax.swing.JPasswordField();
        b_create = new javax.swing.JButton();
        credencial_ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        b_exit = new javax.swing.JButton();
        email_ = new javax.swing.JTextField();
        combo_cred = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sexo_ = new javax.swing.JComboBox<>();
        password_ = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fecha_ = new com.toedter.calendar.JDateChooser();
        direccion_ = new javax.swing.JTextField();
        distrito_ = new javax.swing.JTextField();
        nombre_ = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        provincia_ = new javax.swing.JTextField();
        apellido_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password2_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(password2_, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 140, -1));

        b_create.setBackground(new java.awt.Color(255, 255, 255));
        b_create.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create.setForeground(new java.awt.Color(0, 0, 0));
        b_create.setText("Crear Cuenta");
        b_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createActionPerformed(evt);
            }
        });
        getContentPane().add(b_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, -1, -1));

        credencial_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        credencial_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                credencial_KeyPressed(evt);
            }
        });
        getContentPane().add(credencial_, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 140, -1));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI / RUC:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, 180, -1));

        email_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(email_, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 140, -1));

        combo_cred.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        getContentPane().add(combo_cred, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 110, 30));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 250, 30));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 50, 30));

        sexo_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Femenino", "Otros" }));
        getContentPane().add(sexo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 140, -1));

        password_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 140, -1));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("email:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("direccion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("distrito:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 100, -1));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("fecha de nacimiento:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));
        getContentPane().add(fecha_, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 450, 140, 30));

        direccion_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(direccion_, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 260, 140, -1));

        distrito_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        distrito_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                distrito_KeyPressed(evt);
            }
        });
        getContentPane().add(distrito_, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 140, -1));

        nombre_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombre_KeyPressed(evt);
            }
        });
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 140, -1));

        jLabel14.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("provincia:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, -1, -1));

        provincia_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        provincia_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                provincia_KeyPressed(evt);
            }
        });
        getContentPane().add(provincia_, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, 140, -1));

        apellido_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        apellido_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                apellido_KeyPressed(evt);
            }
        });
        getContentPane().add(apellido_, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 140, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("crear cuenta cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 730, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void b_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createActionPerformed
        String documento = credencial_.getText();
        String nombre = nombre_.getText();
        String apellido = apellido_.getText();
        String f_nacimiento = fecha_.getDateFormatString();
        String sexo = (String) sexo_.getSelectedItem();
        String email = email_.getText();
        String direccion = direccion_.getText();
        String distrito = distrito_.getText();
        String provincia = provincia_.getText();
        String password = password_.getText();
        String password2 = password2_.getText();

        Usuario user1 = usuario_a.busqueda_credencial(documento);

        if (password.equals(password2) && !aux.tf_are_empty(new Object[]{credencial_, nombre_, apellido_, email_, direccion_, distrito_, provincia_, password_, password2_, sexo_})) {
            if (documento.length() == 8 || documento.length() == 11) {
                if (!user1.getCredencial().equals(documento)) {
                    Cliente cliente1 = new Cliente();
                    Usuario usuario1 = new Usuario();

                    cliente1.setDocumento(documento);
                    cliente1.setNombre(nombre);
                    cliente1.setApellido(apellido);
                    cliente1.setF_nacimiento(f_nacimiento);
                    cliente1.setSexo(sexo);
                    cliente1.setEmail(email);
                    cliente1.setDireccion(direccion);
                    cliente1.setD_distrito(distrito);
                    cliente1.setD_provincia(provincia);

                    usuario1.setId(usuario_a.Correlativo());
                    usuario1.setCredencial(documento);
                    usuario1.setPassword(password);
                    usuario1.setRol("Cliente");

                    usuario_a.agregar(usuario1);
                    usuario_a.grabar_archivo(usuario1);

                    cliente_a.agregar(cliente1);
                    cliente_a.grabar_archivo(cliente1);

                    JOptionPane.showMessageDialog(rootPane, "Cuenta creada satisfactoriamente");

                    vista_login v1 = new vista_login();
                    aux.change_jf(v1, this);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El documento ingresado ya se encuentra registrado");
                    aux.clear_tfs(new Object[]{credencial_, nombre_, apellido_, email_, direccion_, distrito_, provincia_});
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "El DNI (8 digitos) o RUC (11 digitos) ingresado es incorrecto");
                credencial_.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Las contraseñas deben ser iguales y no vacias");
            password2_.setText("");
            password_.setText("");
        }
    }//GEN-LAST:event_b_createActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void credencial_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_credencial_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            credencial_.setEditable(false);
        } else {
            credencial_.setEditable(true);
        }
    }//GEN-LAST:event_credencial_KeyPressed

    private void distrito_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distrito_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            credencial_.setEditable(false);
        } else {
            credencial_.setEditable(true);
        }
    }//GEN-LAST:event_distrito_KeyPressed

    private void nombre_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            credencial_.setEditable(false);
        } else {
            credencial_.setEditable(true);
        }
    }//GEN-LAST:event_nombre_KeyPressed

    private void provincia_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_provincia_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            credencial_.setEditable(false);
        } else {
            credencial_.setEditable(true);
        }
    }//GEN-LAST:event_provincia_KeyPressed

    private void apellido_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            credencial_.setEditable(false);
        } else {
            credencial_.setEditable(true);
        }
    }//GEN-LAST:event_apellido_KeyPressed

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
    private javax.swing.JTextField apellido_;
    private javax.swing.JButton b_create;
    private javax.swing.JButton b_exit;
    private javax.swing.JComboBox<String> combo_cred;
    private javax.swing.JTextField credencial_;
    private javax.swing.JTextField direccion_;
    private javax.swing.JTextField distrito_;
    private javax.swing.JTextField email_;
    private com.toedter.calendar.JDateChooser fecha_;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_;
    private javax.swing.JPasswordField password2_;
    private javax.swing.JPasswordField password_;
    private javax.swing.JTextField provincia_;
    private javax.swing.JComboBox<String> sexo_;
    // End of variables declaration//GEN-END:variables
}

/*if (!v2.getDni().equals(credential) && !"".equals(v2.getDni()) && pre_cont.equals(contrasena) && !(aux.tf_are_empty(new Object[]{nombre, credential, pre_cont, contrasena}))) {
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
        else{
            JOptionPane.showMessageDialog(rootPane, "El documento ingresado ya se encuentra registrado");
            j2.setText("");
            j1.setText("");
            j3.setText("");
            j4.setText("");
        }
 */
