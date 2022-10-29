package vista_controlador.cliente;

import vista_controlador.crear_cuenta;
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
        b_comprar = new javax.swing.JButton();
        b_buscar_prod = new javax.swing.JButton();
        b_listar = new javax.swing.JButton();
        b_buscar_bol_fact = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO CLIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 510, -1));

        b_comprar.setBackground(new java.awt.Color(255, 255, 255));
        b_comprar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_comprar.setForeground(new java.awt.Color(0, 0, 0));
        b_comprar.setText("Comprar");
        b_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_comprarActionPerformed(evt);
            }
        });
        getContentPane().add(b_comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 280, -1));

        b_buscar_prod.setBackground(new java.awt.Color(255, 255, 255));
        b_buscar_prod.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buscar_prod.setForeground(new java.awt.Color(0, 0, 0));
        b_buscar_prod.setText("buscar producto");
        getContentPane().add(b_buscar_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 280, -1));

        b_listar.setBackground(new java.awt.Color(255, 255, 255));
        b_listar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_listar.setForeground(new java.awt.Color(0, 0, 0));
        b_listar.setText("listar productos");
        getContentPane().add(b_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 280, -1));

        b_buscar_bol_fact.setBackground(new java.awt.Color(255, 255, 255));
        b_buscar_bol_fact.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buscar_bol_fact.setForeground(new java.awt.Color(0, 0, 0));
        b_buscar_bol_fact.setText("buscar boleta/factura");
        getContentPane().add(b_buscar_bol_fact, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 280, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 180, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_comprarActionPerformed
        crear_cuenta c1= new crear_cuenta();
        aux.change_jf(c1, this);
    }//GEN-LAST:event_b_comprarActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_b_exitActionPerformed

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
    private javax.swing.JButton b_buscar_bol_fact;
    private javax.swing.JButton b_buscar_prod;
    private javax.swing.JButton b_comprar;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_listar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
