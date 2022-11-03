package vista_controlador.admin;

import javax.swing.JOptionPane;
import proyecto_final.Cliente;
import proyecto_final.Usuario;
import proyecto_final.cliente_Array;
import proyecto_final.usuario_Array;
import auxiliares.Auxiliares;

public class buscar_cliente extends javax.swing.JFrame {

    usuario_Array array1 = new usuario_Array();
    cliente_Array cliente_a = new cliente_Array();
    Auxiliares aux = new Auxiliares();

    public buscar_cliente() {
        initComponents();
        array1.inicializar();
        cliente_a.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        documento_ = new javax.swing.JTextField();
        b_search = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        direccion_ = new javax.swing.JLabel();
        email_ = new javax.swing.JLabel();
        sexo_ = new javax.swing.JLabel();
        nombre_ = new javax.swing.JLabel();
        codigo_ = new javax.swing.JLabel();
        documento2_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("buscar cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 420, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI / RUC :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        documento_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        documento_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        documento_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                documento_KeyPressed(evt);
            }
        });
        getContentPane().add(documento_, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        b_search.setBackground(new java.awt.Color(255, 255, 255));
        b_search.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_search.setForeground(new java.awt.Color(0, 0, 0));
        b_search.setText("Buscar");
        b_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_searchActionPerformed(evt);
            }
        });
        getContentPane().add(b_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("cancelar");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, 160, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Codigo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 90, -1));

        jLabel13.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Documento:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("email:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 60, -1));

        jLabel15.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("direccion:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 120, -1));

        jLabel16.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("sexo:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 50, -1));

        direccion_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        direccion_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(direccion_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, -1, -1));

        email_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        email_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(email_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));

        sexo_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        sexo_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(sexo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        nombre_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        nombre_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        codigo_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        codigo_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(codigo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        documento2_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        documento2_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(documento2_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void documento_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documento_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            documento_.setEditable(false);
        } else {
            documento_.setEditable(true);
        }
    }//GEN-LAST:event_documento_KeyPressed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        clientes_1 c1 = new clientes_1();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_searchActionPerformed
        String documento = documento_.getText();

        Usuario user1 = array1.busqueda_credencial(documento);
        Cliente cliente1 = cliente_a.busqueda_credencial(documento);
        if (documento.length() == 8 || documento.length() == 11) {
            switch (user1.getRol()) {
                case "Cliente":
                    direccion_.setText(cliente1.getDireccion());
                    nombre_.setText(cliente1.getNombre());
                    email_.setText(cliente1.getEmail());
                    sexo_.setText(cliente1.getSexo());
                    documento2_.setText(cliente1.getDocumento());
                    codigo_.setText(String.valueOf(user1.getId()));
                    documento_.setText("");
                    break;
                case "Administrador":
                case "Vendedor":
                    direccion_.setText("");
                    nombre_.setText("");
                    documento_.setText("");
                    email_.setText("");
                    sexo_.setText("");
                    documento2_.setText("");
                    codigo_.setText("");
                    JOptionPane.showMessageDialog(rootPane, "El codigo introducido no corresponde al de un cliente");
                    break;
                default:
                    direccion_.setText("");
                    nombre_.setText("");
                    documento_.setText("");
                    email_.setText("");
                    sexo_.setText("");
                    documento2_.setText("");
                    codigo_.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Codigo no encontrado");
                    break;
            }
        } else {
            direccion_.setText("");
            nombre_.setText("");
            documento_.setText("");
            email_.setText("");
            sexo_.setText("");
            documento2_.setText("");
            codigo_.setText("");
            JOptionPane.showMessageDialog(rootPane, "Ingresar un DNI (8 digitos) o RUC (11 digitos) valido");
        }
    }//GEN-LAST:event_b_searchActionPerformed

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
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_search;
    private javax.swing.JLabel codigo_;
    private javax.swing.JLabel direccion_;
    private javax.swing.JLabel documento2_;
    private javax.swing.JTextField documento_;
    private javax.swing.JLabel email_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nombre_;
    private javax.swing.JLabel sexo_;
    // End of variables declaration//GEN-END:variables
}
