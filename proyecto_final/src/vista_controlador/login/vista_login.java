package vista_controlador.login;

import vista_controlador.cliente.cliente_1;
import vista_controlador.vendedor.vendedor_1;
import vista_controlador.admin.admin_1;
import javax.swing.JOptionPane;
import Clases.Cliente_Array;
import Clases.Cliente;
import Auxiliares.Auxiliares;
import Clases.Trabajador_Array;

public class vista_login extends javax.swing.JFrame {

    Cliente_Array array1 = new Cliente_Array();
    Auxiliares aux = new Auxiliares();
    Trabajador_Array array2= new Trabajador_Array();

    public vista_login() {
        initComponents();
        array1.cliente_ini();
        array2.trabajador_ini();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_create = new javax.swing.JButton();
        tf_user = new javax.swing.JTextField();
        pf_pass = new javax.swing.JPasswordField();
        iniciar_sesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_create.setBackground(new java.awt.Color(255, 255, 255));
        b_create.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        b_create.setForeground(new java.awt.Color(0, 0, 0));
        b_create.setText("Crear Cuenta");
        b_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createActionPerformed(evt);
            }
        });
        getContentPane().add(b_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 130, -1));

        tf_user.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_userKeyPressed(evt);
            }
        });
        getContentPane().add(tf_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 140, -1));

        pf_pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(pf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 140, -1));

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
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 130, 60));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("usuario:");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 130, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img1.jpg"))); // NOI18N
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createActionPerformed
        crear_cuenta c1 = new crear_cuenta();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_createActionPerformed

    private void iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesionActionPerformed
        String dni = tf_user.getText();
        String contrasena = pf_pass.getText();

        Cliente ven1 = array1.buscar_cliente_dni(dni);

        if (ven1.getUser_password().equals(contrasena)) {
            roles(ven1);
        } else if ("error".equals(ven1.getUser_password())) {
            JOptionPane.showMessageDialog(rootPane, "Dni y/o contrasena incorrectas");
            aux.clear_tfs(new Object[]{tf_user,pf_pass});
        }
    }//GEN-LAST:event_iniciar_sesionActionPerformed

    private void roles(Cliente vendedor1) {
        switch (vendedor1.getUser_rol()) {
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
    }
    private void tf_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_userKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            tf_user.setEditable(false);
        } else {
            tf_user.setEditable(true);
        }
    }//GEN-LAST:event_tf_userKeyPressed

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
    private javax.swing.JButton b_create;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton iniciar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
