package vista_controlador.admin;

import vista_controlador.vista_login;
import auxiliares.Auxiliares;

public class admin_1 extends javax.swing.JFrame {

    Auxiliares aux = new Auxiliares();

    public admin_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_exit = new javax.swing.JButton();
        b_productos = new javax.swing.JButton();
        b_ventas = new javax.swing.JButton();
        b_clientes = new javax.swing.JButton();
        b_create = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        b_cuentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 600, 190, -1));

        b_productos.setBackground(new java.awt.Color(255, 255, 255));
        b_productos.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_productos.setForeground(new java.awt.Color(0, 0, 0));
        b_productos.setText("productos");
        b_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_productosActionPerformed(evt);
            }
        });
        getContentPane().add(b_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 190, -1));

        b_ventas.setBackground(new java.awt.Color(255, 255, 255));
        b_ventas.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_ventas.setForeground(new java.awt.Color(0, 0, 0));
        b_ventas.setText("ventas");
        b_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ventasActionPerformed(evt);
            }
        });
        getContentPane().add(b_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 190, -1));

        b_clientes.setBackground(new java.awt.Color(255, 255, 255));
        b_clientes.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_clientes.setForeground(new java.awt.Color(0, 0, 0));
        b_clientes.setText("clientes");
        b_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clientesActionPerformed(evt);
            }
        });
        getContentPane().add(b_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 190, -1));

        b_create.setBackground(new java.awt.Color(255, 255, 255));
        b_create.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create.setForeground(new java.awt.Color(0, 0, 0));
        b_create.setText("Crear Cuenta");
        b_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createActionPerformed(evt);
            }
        });
        getContentPane().add(b_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 190, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO ADMIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 500, -1));

        b_cuentas.setBackground(new java.awt.Color(255, 255, 255));
        b_cuentas.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_cuentas.setForeground(new java.awt.Color(0, 0, 0));
        b_cuentas.setText("CUENTAS");
        b_cuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cuentasActionPerformed(evt);
            }
        });
        getContentPane().add(b_cuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createActionPerformed
        crear_cuenta c1 = new crear_cuenta();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_createActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_productosActionPerformed
        productos_1 p1 = new productos_1();
        aux.change_jf(p1, this);
    }//GEN-LAST:event_b_productosActionPerformed

    private void b_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ventasActionPerformed
        ventas_1 v1 = new ventas_1();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_ventasActionPerformed

    private void b_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clientesActionPerformed
        clientes_1 c1 = new clientes_1();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_clientesActionPerformed

    private void b_cuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cuentasActionPerformed
        cuentas_1 c1 = new cuentas_1();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_cuentasActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_clientes;
    private javax.swing.JButton b_create;
    private javax.swing.JButton b_cuentas;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_productos;
    private javax.swing.JButton b_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
