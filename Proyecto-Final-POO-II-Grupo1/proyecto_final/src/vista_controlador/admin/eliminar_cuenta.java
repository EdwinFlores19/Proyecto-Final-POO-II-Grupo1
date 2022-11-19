package vista_controlador.admin;

import javax.swing.JOptionPane;
import proyecto_final.Cliente;
import proyecto_final.Trabajador;
import proyecto_final.Usuario;
import proyecto_final.cliente_Array;
import proyecto_final.trabajador_Array;
import proyecto_final.usuario_Array;
import auxiliares.Auxiliares;

public class eliminar_cuenta extends javax.swing.JFrame {

    usuario_Array array1 = new usuario_Array();
    trabajador_Array trabajador_a = new trabajador_Array();
    cliente_Array cliente_a = new cliente_Array();
    Auxiliares aux = new Auxiliares();

    public eliminar_cuenta() {
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
        b_create = new javax.swing.JButton();
        b_eliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        codigo_ = new javax.swing.JLabel();
        rol_ = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        email_ = new javax.swing.JLabel();
        sexo_ = new javax.swing.JLabel();
        nombre_ = new javax.swing.JLabel();
        direccion_ = new javax.swing.JLabel();
        distrito_ = new javax.swing.JLabel();
        provincia_ = new javax.swing.JLabel();
        documento_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("eliminar cuenta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 510, -1));

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

        b_create.setBackground(new java.awt.Color(255, 255, 255));
        b_create.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create.setForeground(new java.awt.Color(0, 0, 0));
        b_create.setText("salir");
        b_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createActionPerformed(evt);
            }
        });
        getContentPane().add(b_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, 220, -1));

        b_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        b_eliminar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        b_eliminar.setText("Eliminar cuenta");
        b_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(b_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 220, -1));

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
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 110, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("rol:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 50, -1));

        codigo_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        codigo_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(codigo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 100, 30));

        rol_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        rol_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rol_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 180, 20));

        jLabel14.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("distrito:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 90, -1));

        jLabel15.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("provincia:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 110, -1));

        jLabel17.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("email:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 60, -1));

        email_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        email_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(email_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 310, 20));

        sexo_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        sexo_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(sexo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 180, 20));

        nombre_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        nombre_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 180, 20));

        direccion_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        direccion_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(direccion_, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 180, 20));

        distrito_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        distrito_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(distrito_, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 180, 20));

        provincia_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        provincia_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(provincia_, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 180, 20));

        documento_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        documento_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(documento_, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 180, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doc_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doc_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            doc_.setEditable(false);
        } else {
            doc_.setEditable(true);
        }
    }//GEN-LAST:event_doc_KeyPressed


    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        String documento = doc_.getText();

        Usuario user = array1.busqueda_credencial(documento);
        if (documento.length() == 8 || documento.length() == 11) {
            if (!user.getCredencial().isEmpty()) {
                if ("Cliente".equals(user.getRol())) {
                    Cliente cliente1 = cliente_a.busqueda_credencial(documento);

                    codigo_.setText(String.valueOf(user.getId()));
                    nombre_.setText(cliente1.getNombre());
                    documento_.setText(cliente1.getDocumento());
                    email_.setText(cliente1.getEmail());
                    rol_.setText("Cliente");
                    direccion_.setText(cliente1.getDireccion());
                    distrito_.setText(cliente1.getD_distrito());
                    provincia_.setText(cliente1.getD_provincia());
                    sexo_.setText(cliente1.getSexo());
                    doc_.setText("");

                } else if ("Administrador".equals(user.getRol())) {
                    Trabajador trabajador1 = trabajador_a.busqueda_credencial(documento);

                    codigo_.setText(String.valueOf(user.getId()));
                    nombre_.setText(trabajador1.getNombre());
                    documento_.setText(trabajador1.getDni());
                    email_.setText(trabajador1.getEmail());
                    rol_.setText("Administrador");
                    direccion_.setText(trabajador1.getDireccion());
                    distrito_.setText(trabajador1.getD_distrito());
                    provincia_.setText(trabajador1.getD_provincia());
                    sexo_.setText(trabajador1.getSexo());
                    doc_.setText("");

                } else if ("Vendedor".equals(user.getRol())) {
                    Trabajador trabajador1 = trabajador_a.busqueda_credencial(documento);

                    codigo_.setText(String.valueOf(user.getId()));
                    nombre_.setText(trabajador1.getNombre());
                    documento_.setText(trabajador1.getDni());
                    email_.setText(trabajador1.getEmail());
                    rol_.setText("Vendedor");
                    direccion_.setText(trabajador1.getDireccion());
                    distrito_.setText(trabajador1.getD_distrito());
                    provincia_.setText(trabajador1.getD_provincia());
                    sexo_.setText(trabajador1.getSexo());
                    doc_.setText("");

                }
            } else {
                codigo_.setText("");
                nombre_.setText("");
                documento_.setText("");
                email_.setText("");
                sexo_.setText("");
                rol_.setText("");
                direccion_.setText("");
                distrito_.setText("");
                provincia_.setText("");
                documento_.setText("");
                JOptionPane.showMessageDialog(rootPane, "Documento no encontrado");
            }
        } else {
            codigo_.setText("");
            nombre_.setText("");
            documento_.setText("");
            email_.setText("");
            sexo_.setText("");
            rol_.setText("");
            direccion_.setText("");
            distrito_.setText("");
            provincia_.setText("");
            documento_.setText("");
            JOptionPane.showMessageDialog(rootPane, "Ingresar un DNI (8 digitos) o RUC (11 digitos) valido");
        }
        /*String documento = doc.getText();

        Vendedor v1 = array1.busqueda_dni(documento);
        if (documento.length() == 8 || documento.length() == 11) {
            codigo_.setText(String.valueOf(v1.getCodigo()));
            nombre_.setText(v1.getNombre());
            doc.setText(String.valueOf(v1.getDni()));
            sexo_.setText(v1.getSexo());
            hijos_.setText(String.valueOf(v1.getNum_hijos()));
            rol_.setText(v1.getRol());
            doc.setText("");
        } else {
            codigo_.setText("");
            nombre_.setText("");
            doc.setText("");
            sexo_.setText("");
            hijos_.setText("");
            rol_.setText("");
            doc.setText("");
            JOptionPane.showMessageDialog(rootPane, "Ingresar un DNI (8 digitos) o RUC (11 digitos) valido");
        }*/
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createActionPerformed
        cuentas_1 c1 = new cuentas_1();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_createActionPerformed

    private void b_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarActionPerformed
        String documento = documento_.getText();

        Usuario user = array1.busqueda_credencial(documento);
        if (user.getCredencial().isEmpty()) {
            if (documento_.getText().length() == 8 || documento_.getText().length() == 11) {
                if ("Cliente".equals(user.getRol())) {
                    Cliente cliente1 = cliente_a.busqueda_credencial(documento);

                    cliente_a.remove(cliente1);
                    array1.remove(user);

                    array1.grabarModificareliminar();
                    cliente_a.grabarModificareliminar();

                    JOptionPane.showMessageDialog(null, "Registro Modificado");

                    cuentas_1 c1 = new cuentas_1();
                    aux.change_jf(c1, this);

                } else if ("Administrador".equals(user.getRol()) && documento_.getText().length() == 8) {
                    Trabajador trabajador1 = trabajador_a.busqueda_credencial(documento);

                    trabajador_a.remove(trabajador1);
                    array1.remove(user);

                    array1.grabarModificareliminar();
                    trabajador_a.grabarModificareliminar();

                    JOptionPane.showMessageDialog(null, "Registro Modificado");

                    cuentas_1 c1 = new cuentas_1();
                    aux.change_jf(c1, this);

                } else if ("Vendedor".equals(user.getRol()) && documento_.getText().length() == 8) {
                    Trabajador trabajador1 = trabajador_a.busqueda_credencial(documento);

                    trabajador_a.remove(trabajador1);
                    array1.remove(user);

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

        /*Vendedor vr = array1.busqueda_dni(documento);
        if (doc_.getText() != "") {
            array1.remove(vr);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            array1.grabarModificareliminar();

            cuentas_1 c1 = new cuentas_1();
            c1.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No existe código", "Error", JOptionPane.WARNING_MESSAGE);
        }*/
    }//GEN-LAST:event_b_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(eliminar_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminar_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminar_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminar_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminar_cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_create;
    private javax.swing.JButton b_eliminar;
    private javax.swing.JLabel codigo_;
    private javax.swing.JLabel direccion_;
    private javax.swing.JLabel distrito_;
    private javax.swing.JTextField doc_;
    private javax.swing.JLabel documento_;
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
    private javax.swing.JLabel nombre_;
    private javax.swing.JLabel provincia_;
    private javax.swing.JLabel rol_;
    private javax.swing.JLabel sexo_;
    // End of variables declaration//GEN-END:variables
}
