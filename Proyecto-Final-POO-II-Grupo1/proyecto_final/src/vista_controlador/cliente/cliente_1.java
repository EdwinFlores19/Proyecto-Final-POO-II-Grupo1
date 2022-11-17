package vista_controlador.cliente;

import vista_controlador.vista_login;
import auxiliares.Auxiliares;

public class cliente_1 extends javax.swing.JFrame {

    Auxiliares aux = new Auxiliares();

    public cliente_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        b_buy = new javax.swing.JButton();
        b_buscar = new javax.swing.JButton();
        b_listar = new javax.swing.JButton();
        b_buscar_recibo = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO CLIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 510, -1));

        b_buy.setBackground(new java.awt.Color(255, 255, 255));
        b_buy.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buy.setForeground(new java.awt.Color(0, 0, 0));
        b_buy.setText("Comprar");
        b_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buyActionPerformed(evt);
            }
        });
        getContentPane().add(b_buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 280, -1));

        b_buscar.setBackground(new java.awt.Color(255, 255, 255));
        b_buscar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buscar.setForeground(new java.awt.Color(0, 0, 0));
        b_buscar.setText("buscar producto");
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 280, -1));

        b_listar.setBackground(new java.awt.Color(255, 255, 255));
        b_listar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_listar.setForeground(new java.awt.Color(0, 0, 0));
        b_listar.setText("listar productos");
        b_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_listarActionPerformed(evt);
            }
        });
        getContentPane().add(b_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 280, -1));

        b_buscar_recibo.setBackground(new java.awt.Color(255, 255, 255));
        b_buscar_recibo.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buscar_recibo.setForeground(new java.awt.Color(0, 0, 0));
        b_buscar_recibo.setText("buscar boleta/factura");
        b_buscar_recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscar_reciboActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar_recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 280, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buyActionPerformed
        cliente_comprar c1 = new cliente_comprar();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_buyActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        cliente_buscar cbp1 = new cliente_buscar();
        aux.change_jf(cbp1, this);
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_listarActionPerformed
        cliente_listar cl1 = new cliente_listar();
        aux.change_jf(cl1, this);
    }//GEN-LAST:event_b_listarActionPerformed

    private void b_buscar_reciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscar_reciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_buscar_reciboActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cliente_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_buscar_recibo;
    private javax.swing.JButton b_buy;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
