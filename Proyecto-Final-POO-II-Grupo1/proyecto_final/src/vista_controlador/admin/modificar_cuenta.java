package vista_controlador.admin;

import auxiliares.Auxiliares;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import proyecto_final.Cliente;
import proyecto_final.Trabajador;
import proyecto_final.Usuario;
import proyecto_final.cliente_Array;
import proyecto_final.trabajador_Array;
import proyecto_final.usuario_Array;

public class modificar_cuenta extends javax.swing.JFrame {

    usuario_Array array1 = new usuario_Array();
    trabajador_Array trabajador_a = new trabajador_Array();
    cliente_Array cliente_a = new cliente_Array();
    Auxiliares aux = new Auxiliares();

    public modificar_cuenta() {
        initComponents();
        array1.inicializar();
        cliente_a.inicializar();
        trabajador_a.inicializar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doc_ = new javax.swing.JTextField();
        b_buscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        b_exit = new javax.swing.JButton();
        b_mod = new javax.swing.JButton();
        codigo_ = new javax.swing.JLabel();
        documento_ = new javax.swing.JTextField();
        nombre_ = new javax.swing.JTextField();
        tf_escritura = new javax.swing.JTextField();
        sexo_ = new javax.swing.JComboBox<>();
        rol_ = new javax.swing.JLabel();
        email_ = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        distrito_ = new javax.swing.JTextField();
        provincia_ = new javax.swing.JTextField();
        direccion_ = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("modificar cuenta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 510, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI / RUC :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        doc_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        doc_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        doc_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                doc_KeyPressed(evt);
            }
        });
        getContentPane().add(doc_, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        b_buscar.setBackground(new java.awt.Color(255, 255, 255));
        b_buscar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buscar.setForeground(new java.awt.Color(0, 0, 0));
        b_buscar.setText("Buscar");
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CODIGO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Documento:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sexo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("direccion:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 110, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("rol:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 50, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("cancelar");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 200, -1));

        b_mod.setBackground(new java.awt.Color(255, 255, 255));
        b_mod.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_mod.setForeground(new java.awt.Color(0, 0, 0));
        b_mod.setText("modificar");
        b_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modActionPerformed(evt);
            }
        });
        getContentPane().add(b_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 200, -1));

        codigo_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        codigo_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(codigo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 100, 30));

        documento_.setBackground(new java.awt.Color(255, 255, 255));
        documento_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        documento_.setForeground(new java.awt.Color(0, 0, 0));
        documento_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                documento_KeyPressed(evt);
            }
        });
        getContentPane().add(documento_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 140, -1));

        nombre_.setBackground(new java.awt.Color(255, 255, 255));
        nombre_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        nombre_.setForeground(new java.awt.Color(0, 0, 0));
        nombre_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombre_KeyPressed(evt);
            }
        });
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 140, -1));

        tf_escritura.setBackground(new java.awt.Color(255, 255, 255));
        tf_escritura.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        tf_escritura.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(tf_escritura, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        sexo_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Femenino", "Otros" }));
        getContentPane().add(sexo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 140, -1));

        rol_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        rol_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rol_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 180, 20));

        email_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        email_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(email_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("distrito:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 90, -1));

        jLabel15.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("provincia:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 110, -1));

        jLabel17.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("email:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 60, -1));

        distrito_.setBackground(new java.awt.Color(255, 255, 255));
        distrito_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        distrito_.setForeground(new java.awt.Color(0, 0, 0));
        distrito_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                distrito_KeyPressed(evt);
            }
        });
        getContentPane().add(distrito_, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 130, -1));

        provincia_.setBackground(new java.awt.Color(255, 255, 255));
        provincia_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        provincia_.setForeground(new java.awt.Color(0, 0, 0));
        provincia_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                provincia_KeyPressed(evt);
            }
        });
        getContentPane().add(provincia_, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 130, -1));

        direccion_.setBackground(new java.awt.Color(255, 255, 255));
        direccion_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        direccion_.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(direccion_, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doc_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doc_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            doc_.setEditable(false);
        } else {
            doc_.setEditable(true);
        }
    }//GEN-LAST:event_doc_KeyPressed

    String documento;

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        documento = doc_.getText();

        Usuario user = array1.busqueda_credencial(documento);

        JTextField tfs[] = {direccion_, distrito_, doc_, documento_, nombre_, provincia_};

        if (documento.length() == 8 || documento.length() == 11) {
            if (!user.getCredencial().isEmpty()) {
                if ("Cliente".equals(user.getRol())) {
                    Cliente cliente1 = cliente_a.busqueda_credencial(documento);
                    if ("Masculino".equals(cliente1.getSexo())) {
                        sexo_.setSelectedIndex(1);
                    } else if ("Femenino".equals(cliente1.getSexo())) {
                        sexo_.setSelectedIndex(2);
                    } else if ("Otros".equals(cliente1.getSexo())) {
                        sexo_.setSelectedIndex(3);
                    }

                    codigo_.setText(String.valueOf(user.getId()));
                    nombre_.setText(cliente1.getNombre());
                    documento_.setText(cliente1.getDocumento());
                    email_.setText(cliente1.getEmail());
                    rol_.setText("Cliente");
                    direccion_.setText(cliente1.getDireccion());
                    distrito_.setText(cliente1.getD_distrito());
                    provincia_.setText(cliente1.getD_provincia());
                    doc_.setText("");

                } else if ("Administrador".equals(user.getRol())) {
                    Trabajador trabajador1 = trabajador_a.busqueda_credencial(documento);

                    if ("Masculino".equals(trabajador1.getSexo())) {
                        sexo_.setSelectedIndex(1);
                    } else if ("Femenino".equals(trabajador1.getSexo())) {
                        sexo_.setSelectedIndex(2);
                    } else if ("Otros".equals(trabajador1.getSexo())) {
                        sexo_.setSelectedIndex(3);
                    }

                    codigo_.setText(String.valueOf(user.getId()));
                    nombre_.setText(trabajador1.getNombre());
                    documento_.setText(trabajador1.getDni());
                    email_.setText(trabajador1.getEmail());
                    rol_.setText("Administrador");
                    direccion_.setText(trabajador1.getDireccion());
                    distrito_.setText(trabajador1.getD_distrito());
                    provincia_.setText(trabajador1.getD_provincia());
                    doc_.setText("");

                } else if ("Vendedor".equals(user.getRol())) {
                    Trabajador trabajador1 = trabajador_a.busqueda_credencial(documento);

                    if ("Masculino".equals(trabajador1.getSexo())) {
                        sexo_.setSelectedIndex(1);
                    } else if ("Femenino".equals(trabajador1.getSexo())) {
                        sexo_.setSelectedIndex(2);
                    } else if ("Otros".equals(trabajador1.getSexo())) {
                        sexo_.setSelectedIndex(3);
                    }

                    codigo_.setText(String.valueOf(user.getId()));
                    nombre_.setText(trabajador1.getNombre());
                    documento_.setText(trabajador1.getDni());
                    email_.setText(trabajador1.getEmail());
                    rol_.setText("Vendedor");
                    direccion_.setText(trabajador1.getDireccion());
                    distrito_.setText(trabajador1.getD_distrito());
                    provincia_.setText(trabajador1.getD_provincia());
                    doc_.setText("");

                }
            } else {
                codigo_.setText("");
                email_.setText("");
                sexo_.setSelectedIndex(0);
                rol_.setText("");
                aux.clean_tfs(tfs);
                JOptionPane.showMessageDialog(rootPane, "Documento no encontrado");
            }
        } else {
            codigo_.setText("");
            email_.setText("");
            sexo_.setSelectedIndex(0);
            rol_.setText("");
            aux.clean_tfs(tfs);
            JOptionPane.showMessageDialog(rootPane, "Ingresar un DNI (8 digitos) o RUC (11 digitos) valido");
        }
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        cuentas_1 c1 = new cuentas_1();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modActionPerformed
        Usuario user = array1.busqueda_credencial(documento);

        if (!user.getCredencial().isEmpty()) {
            if (documento_.getText().length() == 8 || documento_.getText().length() == 11) {
                if ("Cliente".equals(user.getRol())) {
                    Cliente cliente1 = cliente_a.busqueda_credencial(documento);

                    cliente1.setNombre(nombre_.getText());
                    cliente1.setDocumento(documento_.getText());
                    cliente1.setSexo((String) sexo_.getSelectedItem());
                    cliente1.setDireccion(direccion_.getText());
                    cliente1.setD_distrito(distrito_.getText());
                    cliente1.setD_provincia(provincia_.getText());

                    user.setCredencial(documento_.getText());

                    array1.grabarModificareliminar();
                    cliente_a.grabarModificareliminar();

                    JOptionPane.showMessageDialog(null, "Registro Modificado");

                    cuentas_1 c1 = new cuentas_1();
                    aux.change_jf(c1, this);

                } else if ("Administrador".equals(user.getRol()) && documento_.getText().length() == 8) {
                    Trabajador trabajador1 = trabajador_a.busqueda_credencial(documento);

                    trabajador1.setNombre(nombre_.getText());
                    trabajador1.setCredencial(documento_.getText());
                    trabajador1.setSexo((String) sexo_.getSelectedItem());
                    trabajador1.setDireccion(direccion_.getText());
                    trabajador1.setD_distrito(distrito_.getText());
                    trabajador1.setD_provincia(provincia_.getText());

                    user.setCredencial(documento_.getText());

                    array1.grabarModificareliminar();
                    trabajador_a.grabarModificareliminar();

                    JOptionPane.showMessageDialog(null, "Registro Modificado");

                    cuentas_1 c1 = new cuentas_1();
                    aux.change_jf(c1, this);

                } else if ("Vendedor".equals(user.getRol()) && documento_.getText().length() == 8) {
                    Trabajador trabajador1 = trabajador_a.busqueda_credencial(documento);

                    trabajador1.setNombre(nombre_.getText());
                    trabajador1.setCredencial(documento_.getText());
                    trabajador1.setSexo((String) sexo_.getSelectedItem());
                    trabajador1.setDireccion(direccion_.getText());
                    trabajador1.setD_distrito(distrito_.getText());
                    trabajador1.setD_provincia(provincia_.getText());

                    user.setCredencial(documento_.getText());

                    array1.grabarModificareliminar();
                    trabajador_a.grabarModificareliminar();

                    JOptionPane.showMessageDialog(null, "Registro Modificado");

                    cuentas_1 c1 = new cuentas_1();
                    aux.change_jf(c1, this);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ingresar un DNI (8 digitos) o RUC (11 digitos) valido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe código", "Error", JOptionPane.WARNING_MESSAGE);
        }
        /*String documento = documento_.getText();

        Vendedor v1 = array1.busqueda_dni(documento);

        if (documento != "") {
            v1.setNombre(nombre_.getText());
            v1.setDni(documento_.getText());
            v1.setSexo(sexo_.getSelectedItem().toString());
            v1.setRol(rol_.getSelectedItem().toString());
            v1.setNum_hijos((int) hijos_.getValue());

            array1.grabarModificareliminar();

            JOptionPane.showMessageDialog(null, "Registro Modificado");

            cuentas_1 c1 = new cuentas_1();
            c1.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No existe código", "Error", JOptionPane.WARNING_MESSAGE);

        }*/


    }//GEN-LAST:event_b_modActionPerformed

    private void nombre_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            nombre_.setEditable(false);
        } else {
            nombre_.setEditable(true);
        }
    }//GEN-LAST:event_nombre_KeyPressed

    private void documento_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documento_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            documento_.setEditable(false);
        } else {
            documento_.setEditable(true);
        }
    }//GEN-LAST:event_documento_KeyPressed

    private void distrito_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_distrito_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            distrito_.setEditable(false);
        } else {
            distrito_.setEditable(true);
        }
    }//GEN-LAST:event_distrito_KeyPressed

    private void provincia_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_provincia_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            provincia_.setEditable(false);
        } else {
            provincia_.setEditable(true);
        }
    }//GEN-LAST:event_provincia_KeyPressed

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
            java.util.logging.Logger.getLogger(modificar_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar_cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_mod;
    private javax.swing.JLabel codigo_;
    private javax.swing.JTextField direccion_;
    private javax.swing.JTextField distrito_;
    private javax.swing.JTextField doc_;
    private javax.swing.JTextField documento_;
    private javax.swing.JLabel email_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_;
    private javax.swing.JTextField provincia_;
    private javax.swing.JLabel rol_;
    private javax.swing.JComboBox<String> sexo_;
    private javax.swing.JTextField tf_escritura;
    // End of variables declaration//GEN-END:variables
}
