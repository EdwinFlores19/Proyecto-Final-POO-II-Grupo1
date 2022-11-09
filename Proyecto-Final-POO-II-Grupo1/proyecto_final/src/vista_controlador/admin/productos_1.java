package vista_controlador.admin;

import auxiliares.Auxiliares;
import vista_controlador.productos.buscar_producto;
import vista_controlador.productos.eliminar_producto;
import vista_controlador.productos.listar_producto;
import vista_controlador.productos.modificar_producto;
import vista_controlador.productos.nuevo_producto;

public class productos_1 extends javax.swing.JFrame {

    Auxiliares aux = new Auxiliares();

    public productos_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        b_create = new javax.swing.JButton();
        b_modificar = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        b_eliminar = new javax.swing.JButton();
        b_buscar = new javax.swing.JButton();
        b_listar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 320, -1));

        b_create.setBackground(new java.awt.Color(255, 255, 255));
        b_create.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_create.setForeground(new java.awt.Color(0, 0, 0));
        b_create.setText("nuevo producto");
        b_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_createActionPerformed(evt);
            }
        });
        getContentPane().add(b_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 250, -1));

        b_modificar.setBackground(new java.awt.Color(255, 255, 255));
        b_modificar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_modificar.setForeground(new java.awt.Color(0, 0, 0));
        b_modificar.setText("Modificar producto");
        b_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(b_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 250, -1));

        b_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        b_eliminar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        b_eliminar.setText("eliminar producto");
        b_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(b_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 250, -1));

        b_buscar.setBackground(new java.awt.Color(255, 255, 255));
        b_buscar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buscar.setForeground(new java.awt.Color(0, 0, 0));
        b_buscar.setText("BUSCAR PRODUCTOS");
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 250, -1));

        b_listar.setBackground(new java.awt.Color(255, 255, 255));
        b_listar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_listar.setForeground(new java.awt.Color(0, 0, 0));
        b_listar.setText("LISTAR PRODUCTOS");
        b_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_listarActionPerformed(evt);
            }
        });
        getContentPane().add(b_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_createActionPerformed
        nuevo_producto n1 = new nuevo_producto();
        aux.change_jf(n1, this);
    }//GEN-LAST:event_b_createActionPerformed

    private void b_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_listarActionPerformed
        listar_producto l1 = new listar_producto();
        aux.change_jf(l1, this);
    }//GEN-LAST:event_b_listarActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        admin_1 a1 = new admin_1();
        aux.change_jf(a1, this);
    }//GEN-LAST:event_b_exitActionPerformed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        buscar_producto b1 = new buscar_producto();
        aux.change_jf(b1, this);
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
        modificar_producto m1 = new modificar_producto();
        aux.change_jf(m1, this);
    }//GEN-LAST:event_b_modificarActionPerformed

    private void b_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eliminarActionPerformed
        eliminar_producto e1 = new eliminar_producto();
        aux.change_jf(e1, this);
    }//GEN-LAST:event_b_eliminarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(productos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_create;
    private javax.swing.JButton b_eliminar;
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_listar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
