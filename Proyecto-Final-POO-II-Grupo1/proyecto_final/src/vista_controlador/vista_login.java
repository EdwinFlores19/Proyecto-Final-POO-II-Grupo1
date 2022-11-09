package vista_controlador;

import vista_controlador.cliente.cliente_1;
import vista_controlador.vendedor.vendedor_1;
import vista_controlador.admin.admin_1;
import javax.swing.JOptionPane;
import proyecto_final.usuario_Array;
import auxiliares.Auxiliares;
import proyecto_final.Usuario;

public class vista_login extends javax.swing.JFrame {

    usuario_Array usuario_a = new usuario_Array();
    Auxiliares aux = new Auxiliares();

    public vista_login() {
        initComponents();
        usuario_a.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_create_account = new javax.swing.JButton();
        dni_ = new javax.swing.JTextField();
        contraseña_ = new javax.swing.JPasswordField();
        iniciar_sesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_create_account.setBackground(new java.awt.Color(255, 255, 255));
        b_create_account.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        b_create_account.setForeground(new java.awt.Color(0, 0, 0));
        b_create_account.setText("Crear Cuenta");
        b_create_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_create_accountActionPerformed(evt);
            }
        });
        getContentPane().add(b_create_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 130, -1));

        dni_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dni_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dni_KeyPressed(evt);
            }
        });
        getContentPane().add(dni_, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 140, -1));

        contraseña_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(contraseña_, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 140, -1));

        iniciar_sesion.setBackground(new java.awt.Color(255, 255, 255));
        iniciar_sesion.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        iniciar_sesion.setForeground(new java.awt.Color(0, 0, 0));
        iniciar_sesion.setText("Iniciar Sesion");
        iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 130, 60));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Documento:");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 130, 50));

        jlabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        jlabelfondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jlabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_create_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_create_accountActionPerformed
        crear_cuenta c1 = new crear_cuenta();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_create_accountActionPerformed

    private void iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesionActionPerformed
        String dni = dni_.getText();
        String contrasena = contraseña_.getText();

        Usuario user = usuario_a.busqueda_credencial(dni);

        if (user.getPassword().equals(contrasena)) {
            roles(user);
        } else if ("error".equals(user.getPassword())) {
            JOptionPane.showMessageDialog(rootPane, "Documento y/o contrasena incorrectas");
            dni_.setText("");
            contraseña_.setText("");
        }
    }//GEN-LAST:event_iniciar_sesionActionPerformed

    private void roles(Usuario user) {
        switch (user.getRol()) {
            case "Administrador":
                JOptionPane.showMessageDialog(rootPane, "Bienvenido a nuestra plataforma administrador!!!");
                admin_1 a1 = new admin_1();
                aux.change_jf(a1, this);
                break;
            case "Vendedor":
                JOptionPane.showMessageDialog(rootPane, "Bienvenido a nuestra plataforma vendedor!!!");
                vendedor_1 v1 = new vendedor_1();
                aux.change_jf(v1, this);
                break;
            case "Cliente":
                JOptionPane.showMessageDialog(rootPane, "Bienvenido a nuestra plataforma cliente!!!");
                cliente_1 c1 = new cliente_1();
                aux.change_jf(c1, this);
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Su rol no es admitido");
                this.setVisible(true);
                break;
        }
    }
    private void dni_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dni_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            dni_.setEditable(false);
        } else {
            dni_.setEditable(true);
        }
    }//GEN-LAST:event_dni_KeyPressed

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_create_account;
    private javax.swing.JPasswordField contraseña_;
    private javax.swing.JTextField dni_;
    private javax.swing.JButton iniciar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlabelfondo;
    // End of variables declaration//GEN-END:variables
}
/*
switch (vendedor1.getRol()) {
            case "administrador":
                JOptionPane.showMessageDialog(rootPane, "Bienvenido a nuestra plataforma administrador!!!");
                admin_1 a1 = new admin_1();
                aux.change_jf(a1, this);
                break;
            case "vendedor":
                JOptionPane.showMessageDialog(rootPane, "Bienvenido a nuestra plataforma vendedor!!!");
                vendedor_1 v1 = new vendedor_1();
                aux.change_jf(v1, this);
                break;
            case "cliente":
                JOptionPane.showMessageDialog(rootPane, "Bienvenido a nuestra plataforma cliente!!!");
                cliente_1 c1 = new cliente_1();
                aux.change_jf(c1, this);
            default:
                JOptionPane.showMessageDialog(rootPane, "Su rol no es admitido");
                break;
        }
 */
