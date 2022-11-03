package vista_controlador.admin;

import auxiliares.Auxiliares;

public class clientes_1 extends javax.swing.JFrame {

    Auxiliares aux = new Auxiliares();

    public clientes_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        b_buscar = new javax.swing.JButton();
        b_eliminar = new javax.swing.JButton();
        b_listar = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 230, -1));

        b_buscar.setBackground(new java.awt.Color(255, 255, 255));
        b_buscar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buscar.setForeground(new java.awt.Color(0, 0, 0));
        b_buscar.setText("Buscar cliente");
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 200, -1));

        b_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        b_eliminar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        b_eliminar.setText("eliminar cliente");
        getContentPane().add(b_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 200, -1));

        b_listar.setBackground(new java.awt.Color(255, 255, 255));
        b_listar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_listar.setForeground(new java.awt.Color(0, 0, 0));
        b_listar.setText("listar clientes");
        b_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_listarActionPerformed(evt);
            }
        });
        getContentPane().add(b_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 200, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        buscar_cliente b1 = new buscar_cliente();
        aux.change_jf(b1, this);
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        admin_1 a1 = new admin_1();
        aux.change_jf(a1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_listarActionPerformed
        listado_cliente l1 = new listado_cliente();
        aux.change_jf(l1, this);
    }//GEN-LAST:event_b_listarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clientes_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_eliminar;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
