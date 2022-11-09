package vista_controlador.admin;

import auxiliares.Auxiliares;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyecto_final.Trabajador;
import proyecto_final.Usuario;
import proyecto_final.trabajador_Array;
import proyecto_final.usuario_Array;

public class crear_cuenta_trabajador extends javax.swing.JFrame {

    Auxiliares aux = new Auxiliares();
    trabajador_Array trabajador_a = new trabajador_Array();
    usuario_Array usuario_a = new usuario_Array();

    public crear_cuenta_trabajador() {
        initComponents();
        trabajador_a.inicializar();
        usuario_a.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        fecha_ingreso = new com.toedter.calendar.JDateChooser();
        email_ = new javax.swing.JTextField();
        direccion_ = new javax.swing.JTextField();
        provincia_ = new javax.swing.JTextField();
        distrito_ = new javax.swing.JTextField();
        nombre_ = new javax.swing.JTextField();
        dni_ = new javax.swing.JTextField();
        rol_ = new javax.swing.JComboBox<>();
        sexo_ = new javax.swing.JComboBox<>();
        b_create = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        hijos_ = new javax.swing.JSpinner();
        salud_ = new javax.swing.JComboBox<>();
        sueldo_ = new javax.swing.JSpinner();
        pensiones_ = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        password_ = new javax.swing.JTextField();
        password2_ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("crear cuenta trabajador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 730, -1));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("fecha de nacimiento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("sexo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("email:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("direccion:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("distrito:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("provincia:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("sueldo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("sistema de pensiones:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("fecha de ingreso:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("numero de hijos:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contraseña:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 140, -1));

        jLabel15.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("rol:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        jLabel16.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("DNi:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));
        getContentPane().add(fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 140, 30));
        getContentPane().add(fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 140, 30));

        email_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(email_, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 140, 30));

        direccion_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(direccion_, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 140, 30));

        provincia_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        provincia_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                provincia_KeyPressed(evt);
            }
        });
        getContentPane().add(provincia_, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 140, 30));

        distrito_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        distrito_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                distrito_KeyPressed(evt);
            }
        });
        getContentPane().add(distrito_, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 140, -1));

        nombre_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombre_KeyPressed(evt);
            }
        });
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 140, 30));

        dni_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dni_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dni_KeyPressed(evt);
            }
        });
        getContentPane().add(dni_, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 140, 30));

        rol_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Administrador", "Vendedor" }));
        getContentPane().add(rol_, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 140, 30));

        sexo_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Femenino", "Otros" }));
        getContentPane().add(sexo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 140, -1));

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
        getContentPane().add(hijos_, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 140, 30));

        salud_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Essalud", "Seguro Privado", "Otro" }));
        getContentPane().add(salud_, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, 140, -1));
        getContentPane().add(sueldo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 140, 30));

        pensiones_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "AFP", "ONP" }));
        getContentPane().add(pensiones_, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 140, -1));

        jLabel17.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("confirmar contraseña:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 250, -1));

        jLabel18.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("seguro de salud:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 190, -1));

        password_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(password_, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 140, -1));

        password2_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(password2_, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void provincia_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_provincia_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            provincia_.setEditable(false);
        } else {
            provincia_.setEditable(true);
        }
    }//GEN-LAST:event_provincia_KeyPressed

    private void distrito_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distrito_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            distrito_.setEditable(false);
        } else {
            distrito_.setEditable(true);
        }
    }//GEN-LAST:event_distrito_KeyPressed

    private void nombre_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            nombre_.setEditable(false);
        } else {
            nombre_.setEditable(true);
        }
    }//GEN-LAST:event_nombre_KeyPressed

    private void dni_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dni_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            dni_.setEditable(false);
        } else {
            dni_.setEditable(true);
        }
    }//GEN-LAST:event_dni_KeyPressed

    private void b_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createActionPerformed
        String dni = dni_.getText();
        String nombre = nombre_.getText();
        String nacimiento = fecha_nacimiento.getDateFormatString();
        String sexo = (String) sexo_.getSelectedItem();
        String email = email_.getText();
        String direccion = direccion_.getText();
        String distrito = distrito_.getText();
        String provincia = provincia_.getText();
        double sueldo = sueldo_.getComponentCount();
        String sist_pensiones = (String) pensiones_.getSelectedItem();
        String ingreso = fecha_ingreso.getDateFormatString();
        int n_hijos = hijos_.getComponentCount();
        String s_salud = (String) salud_.getSelectedItem();
        String rol = (String) rol_.getSelectedItem();

        String password = password_.getText();
        String password2 = password2_.getText();

        String strs[] = {dni, nombre, nacimiento, sexo, email, direccion, distrito, provincia, sist_pensiones, ingreso, s_salud, rol, password, password2};
        JTextField tfs[] = {dni_, nombre_, email_, direccion_, distrito_, provincia_, password2_, password_};

        Usuario user1 = usuario_a.busqueda_credencial(dni);

        if (password.equals(password2)) {
            if (!aux.are_strings_emtpy(strs) && sueldo >= 0 && n_hijos >= 0) {
                if (dni.length() == 8 || dni.length() == 11) {
                    if (!user1.getCredencial().equals(dni)) {
                        Trabajador trabajador1 = new Trabajador();
                        Usuario usuario1 = new Usuario();

                        trabajador1.setDni(dni);
                        trabajador1.setNombre(nombre);
                        trabajador1.setF_nacimiento(nacimiento);
                        trabajador1.setSexo(sexo);
                        trabajador1.setEmail(email);
                        trabajador1.setDireccion(direccion);
                        trabajador1.setD_distrito(distrito);
                        trabajador1.setD_provincia(provincia);
                        trabajador1.setSueldo(sueldo);
                        trabajador1.setSist_pensiones(sist_pensiones);
                        trabajador1.setF_ingreso(ingreso);
                        trabajador1.setN_hijos(n_hijos);
                        trabajador1.setS_salud(s_salud);
                        trabajador1.setRol(rol);

                        usuario1.setId(usuario_a.Correlativo());
                        usuario1.setCredencial(dni);
                        usuario1.setPassword(password);
                        usuario1.setRol(rol);

                        usuario_a.agregar(usuario1);
                        usuario_a.grabar_archivo(usuario1);

                        trabajador_a.agregar(trabajador1);
                        trabajador_a.grabar_archivo(trabajador1);

                        JOptionPane.showMessageDialog(rootPane, "Cuenta creada satisfactoriamente");

                        admin_1 v1 = new admin_1();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El documento ingresado ya se encuentra registrado");
                        aux.clean_tfs(tfs);
                        aux.clean_tfs(tfs);
                        rol_.setSelectedIndex(0);
                        sexo_.setSelectedIndex(0);
                        pensiones_.setSelectedIndex(0);
                        salud_.setSelectedIndex(0);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El DNI (8 digitos) o RUC (11 digitos) ingresado es incorrecto");
                    dni_.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "No puede dejar campos vacios ni invalidos");
                aux.clean_tfs(tfs);
                rol_.setSelectedIndex(0);
                sexo_.setSelectedIndex(0);
                pensiones_.setSelectedIndex(0);
                salud_.setSelectedIndex(0);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Las contraseñas deben ser iguales y no vacias");
            password2_.setText("");
            password_.setText("");
        }
    }//GEN-LAST:event_b_createActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        admin_1 v1 = new admin_1();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

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
            java.util.logging.Logger.getLogger(crear_cuenta_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_trabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crear_cuenta_trabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_create;
    private javax.swing.JButton b_exit;
    private javax.swing.JTextField direccion_;
    private javax.swing.JTextField distrito_;
    private javax.swing.JTextField dni_;
    private javax.swing.JTextField email_;
    private com.toedter.calendar.JDateChooser fecha_ingreso;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JSpinner hijos_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_;
    private javax.swing.JTextField password2_;
    private javax.swing.JTextField password_;
    private javax.swing.JComboBox<String> pensiones_;
    private javax.swing.JTextField provincia_;
    private javax.swing.JComboBox<String> rol_;
    private javax.swing.JComboBox<String> salud_;
    private javax.swing.JComboBox<String> sexo_;
    private javax.swing.JSpinner sueldo_;
    // End of variables declaration//GEN-END:variables
}
