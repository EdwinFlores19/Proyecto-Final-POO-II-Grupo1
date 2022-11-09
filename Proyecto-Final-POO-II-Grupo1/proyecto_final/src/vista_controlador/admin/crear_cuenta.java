package vista_controlador.admin;

import auxiliares.Auxiliares;

public class crear_cuenta extends javax.swing.JFrame {

    Auxiliares aux = new Auxiliares();

    public crear_cuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_create_admin = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        b_create_vendedor = new javax.swing.JButton();
        b_create_proveedor = new javax.swing.JButton();
        b_create_cliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_create_admin.setBackground(new java.awt.Color(255, 255, 255));
        b_create_admin.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create_admin.setForeground(new java.awt.Color(0, 0, 0));
        b_create_admin.setText("administrador");
        b_create_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_create_adminActionPerformed(evt);
            }
        });
        getContentPane().add(b_create_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 220, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 180, -1));

        b_create_vendedor.setBackground(new java.awt.Color(255, 255, 255));
        b_create_vendedor.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create_vendedor.setForeground(new java.awt.Color(0, 0, 0));
        b_create_vendedor.setText("vendedor");
        b_create_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_create_vendedorActionPerformed(evt);
            }
        });
        getContentPane().add(b_create_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 220, -1));

        b_create_proveedor.setBackground(new java.awt.Color(255, 255, 255));
        b_create_proveedor.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create_proveedor.setForeground(new java.awt.Color(0, 0, 0));
        b_create_proveedor.setText("proveedor");
        b_create_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_create_proveedorActionPerformed(evt);
            }
        });
        getContentPane().add(b_create_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 220, -1));

        b_create_cliente.setBackground(new java.awt.Color(255, 255, 255));
        b_create_cliente.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create_cliente.setForeground(new java.awt.Color(0, 0, 0));
        b_create_cliente.setText("cliente");
        b_create_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_create_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(b_create_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 220, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("crear cuenta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 480, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void b_create_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_create_adminActionPerformed
        crear_cuenta_trabajador c2 = new crear_cuenta_trabajador();
        aux.change_jf(c2, this);
    }//GEN-LAST:event_b_create_adminActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        admin_1 v1 = new admin_1();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_create_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_create_vendedorActionPerformed
        crear_cuenta_trabajador c2 = new crear_cuenta_trabajador();
        aux.change_jf(c2, this);
    }//GEN-LAST:event_b_create_vendedorActionPerformed

    private void b_create_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_create_proveedorActionPerformed
        crear_cuenta_proveedor p1 = new crear_cuenta_proveedor();
        aux.change_jf(p1, this);
    }//GEN-LAST:event_b_create_proveedorActionPerformed

    private void b_create_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_create_clienteActionPerformed
        crear_cuenta_cliente c1 = new crear_cuenta_cliente();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_create_clienteActionPerformed

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
    private javax.swing.JButton b_create_admin;
    private javax.swing.JButton b_create_cliente;
    private javax.swing.JButton b_create_proveedor;
    private javax.swing.JButton b_create_vendedor;
    private javax.swing.JButton b_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
