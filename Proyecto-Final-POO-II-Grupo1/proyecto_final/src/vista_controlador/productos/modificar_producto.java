package vista_controlador.productos;

import javax.swing.JOptionPane;
import proyecto_final.productos_Array;
import proyecto_final.Productos;
import vista_controlador.admin.productos_1;
import auxiliares.Auxiliares;

public class modificar_producto extends javax.swing.JFrame {

    productos_Array array1 = new productos_Array();
    Auxiliares aux = new Auxiliares();

    public modificar_producto() {
        initComponents();
        array1.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigo_ = new javax.swing.JTextField();
        b_buscar = new javax.swing.JButton();
        vencimiento_ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        b_modificar = new javax.swing.JButton();
        precio_ = new javax.swing.JTextField();
        stock_ = new javax.swing.JTextField();
        nombre_ = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Modificar Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 600, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        codigo_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        codigo_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        codigo_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigo_KeyPressed(evt);
            }
        });
        getContentPane().add(codigo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        b_buscar.setBackground(new java.awt.Color(255, 255, 255));
        b_buscar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buscar.setForeground(new java.awt.Color(0, 0, 0));
        b_buscar.setText("BUSCAR");
        b_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(b_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        vencimiento_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        vencimiento_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vencimiento_KeyPressed(evt);
            }
        });
        getContentPane().add(vencimiento_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 100, -1));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Stock:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 80, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha de vencimiento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        b_modificar.setBackground(new java.awt.Color(255, 255, 255));
        b_modificar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_modificar.setForeground(new java.awt.Color(0, 0, 0));
        b_modificar.setText("Modificar producto");
        b_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(b_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 260, -1));

        precio_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        precio_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precio_KeyPressed(evt);
            }
        });
        getContentPane().add(precio_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 100, -1));

        stock_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        stock_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stock_KeyPressed(evt);
            }
        });
        getContentPane().add(stock_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 100, -1));

        nombre_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        nombre_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombre_KeyPressed(evt);
            }
        });
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 100, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigo_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            codigo_.setEditable(false);
        } else {
            codigo_.setEditable(true);
        }
    }//GEN-LAST:event_codigo_KeyPressed

    private void b_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarActionPerformed
        int codigo = Integer.parseInt(codigo_.getText());
        Productos pro1 = array1.busqueda_codigo(codigo);
        if (codigo == pro1.getP_id()) {
            nombre_.setText(pro1.getNombre());
            precio_.setText(String.valueOf(pro1.getPrecio()));
            stock_.setText(String.valueOf(pro1.getStock()));
            vencimiento_.setText(pro1.getF_vencimiento());
        } else {
            codigo_.setText("");
            nombre_.setText("");
            stock_.setText("");
            precio_.setText("");
            JOptionPane.showMessageDialog(rootPane, "Codigo no encontrado");
        }
    }//GEN-LAST:event_b_buscarActionPerformed

    private void b_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_modificarActionPerformed
        Productos producto1 = array1.busqueda_codigo(Integer.parseInt(codigo_.getText()));

        if (0 != producto1.getP_id()) {
            producto1.setNombre(nombre_.getText());
            producto1.setPrecio(Double.parseDouble(precio_.getText()));
            producto1.setStock(Integer.parseInt(stock_.getText()));
            producto1.setF_vencimiento(vencimiento_.getText());

            array1.grabarModificareliminar();

            JOptionPane.showMessageDialog(null, "Registro Modificado");

            productos_1 p1 = new productos_1();
            aux.change_jf(p1, this);
        } else {
            JOptionPane.showMessageDialog(null, "No existe código", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_b_modificarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        productos_1 p1 = new productos_1();
        aux.change_jf(p1, this);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nombre_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            codigo_.setEditable(false);
        } else {
            codigo_.setEditable(true);
        }
    }//GEN-LAST:event_nombre_KeyPressed

    private void stock_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stock_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            codigo_.setEditable(false);
        } else {
            codigo_.setEditable(true);
        }
    }//GEN-LAST:event_stock_KeyPressed

    private void precio_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            codigo_.setEditable(false);
        } else {
            codigo_.setEditable(true);
        }
    }//GEN-LAST:event_precio_KeyPressed

    private void vencimiento_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vencimiento_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            codigo_.setEditable(false);
        } else {
            codigo_.setEditable(true);
        }
    }//GEN-LAST:event_vencimiento_KeyPressed

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
            java.util.logging.Logger.getLogger(modificar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscar;
    private javax.swing.JButton b_modificar;
    private javax.swing.JTextField codigo_;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombre_;
    private javax.swing.JTextField precio_;
    private javax.swing.JTextField stock_;
    private javax.swing.JTextField vencimiento_;
    // End of variables declaration//GEN-END:variables
}
