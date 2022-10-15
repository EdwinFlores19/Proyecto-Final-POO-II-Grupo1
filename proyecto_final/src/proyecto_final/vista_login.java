/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final;

import java.awt.Dimension;
import javax.swing.JOptionPane;



/**
 *
 * @author WILLIAM
 */
public class vista_login extends javax.swing.JFrame {
Array_vendedor array1=new Array_vendedor();
    /**
     * Creates new form vista_login
     */
    public vista_login() {
        initComponents();
        array1.inicializar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        dni_ = new javax.swing.JTextField();
        contraseña_ = new javax.swing.JPasswordField();
        iniciar_sesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Felix Titling", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Crear Cuenta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, -1, -1));

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
        jLabel1.setText("      DNI:");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 110, 50));

        jlabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        jlabelfondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jlabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crear_cuenta c1= new crear_cuenta();
        c1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesionActionPerformed
        // TODO add your handling code here:
        String dni=dni_.getText();
        String contraseña=contraseña_.getText();
        
        Vendedor ven1=array1.busqueda_dni(dni);
        
        if(ven1.getContraseña().equals(contraseña)){
            JOptionPane.showMessageDialog(rootPane,"Bienvenido a nuestra plataforma!!!");
            interfazP i1= new interfazP();
            i1.setVisible(true);
            this.setVisible(false);
        }
        else if("error".equals(ven1.getContraseña())){
            JOptionPane.showMessageDialog(rootPane,"Dni y/o contraseña incorrectas");
            dni_.setText("");
            contraseña_.setText("");
        }
    }//GEN-LAST:event_iniciar_sesionActionPerformed

    private void dni_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dni_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            dni_.setEditable(false);
        } else {
            dni_.setEditable(true);
        }
    }//GEN-LAST:event_dni_KeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña_;
    private javax.swing.JTextField dni_;
    private javax.swing.JButton iniciar_sesion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlabelfondo;
    // End of variables declaration//GEN-END:variables
}
