package vista_controlador.admin;

import auxiliares.Auxiliares;

public class cuentas_1 extends javax.swing.JFrame {

    Auxiliares aux = new Auxiliares();

    public cuentas_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        b_modificar = new javax.swing.JButton();
        b_listar = new javax.swing.JButton();
        b_eliminar = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(this.getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("cuentas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 230, -1));

        b_modificar.setBackground(new java.awt.Color(255, 255, 255));
        b_modificar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_modificar.setForeground(new java.awt.Color(0, 0, 0));
        b_modificar.setText("Modificar cuenta");
        b_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(b_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 220, -1));

        b_listar.setBackground(new java.awt.Color(255, 255, 255));
        b_listar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_listar.setForeground(new java.awt.Color(0, 0, 0));
        b_listar.setText("Listado cuentas");
        b_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_listarActionPerformed(evt);
            }
        });
        getContentPane().add(b_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 220, -1));

        b_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        b_eliminar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        b_eliminar.setText("Eliminar cuenta");
        b_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(b_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 220, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
        modificar_cuenta m1 = new modificar_cuenta();
        aux.change_jf(m1, this);
    }//GEN-LAST:event_b_modificarActionPerformed

    private void b_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_listarActionPerformed
        listado_cuentas v1 = new listado_cuentas();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_listarActionPerformed

    private void b_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarActionPerformed
        eliminar_cuenta e1 = new eliminar_cuenta();
        aux.change_jf(e1, this);
    }//GEN-LAST:event_b_eliminarActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        admin_1 a1 = new admin_1();
        aux.change_jf(a1, this);
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
            java.util.logging.Logger.getLogger(cuentas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuentas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuentas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuentas_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuentas_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_eliminar;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_listar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
