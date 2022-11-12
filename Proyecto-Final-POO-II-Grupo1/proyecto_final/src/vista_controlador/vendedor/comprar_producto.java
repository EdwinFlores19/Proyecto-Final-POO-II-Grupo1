package vista_controlador.vendedor;

import auxiliares.Auxiliares;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import proyecto_final.productos_Array;
import proyecto_final.Productos;
import vista_controlador.admin.productos_1;

public class comprar_producto extends javax.swing.JFrame {

    productos_Array array1 = new productos_Array();
    Auxiliares aux = new Auxiliares();

    public comprar_producto() {
        initComponents();
        array1.inicializar();
        /* Inicializar table desde UI, con una funcion señal, si es que se cambio el valor en la celda de unidades, actualizar el total */
        //modelo = new DefaultTableModel();
        table_products.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Codigo", "Nombre", "Unidades", "Precio", "Total"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

//        modelo.addColumn("Codigo");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Unidades");
//        modelo.addColumn("Precio");
//        modelo.addColumn("Total");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_products = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        codigo_ = new javax.swing.JTextField();
        b_sel = new javax.swing.JButton();
        b_exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Unidades", "Precio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_products);
        if (table_products.getColumnModel().getColumnCount() > 0) {
            table_products.getColumnModel().getColumn(0).setResizable(false);
            table_products.getColumnModel().getColumn(1).setResizable(false);
            table_products.getColumnModel().getColumn(2).setResizable(false);
            table_products.getColumnModel().getColumn(3).setResizable(false);
            table_products.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 770, 310));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("comprar producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 550, -1));

        codigo_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        codigo_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        codigo_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigo_KeyPressed(evt);
            }
        });
        getContentPane().add(codigo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        b_sel.setBackground(new java.awt.Color(255, 255, 255));
        b_sel.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_sel.setForeground(new java.awt.Color(0, 0, 0));
        b_sel.setText("sleccionar");
        b_sel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_selActionPerformed(evt);
            }
        });
        getContentPane().add(b_sel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("SALIR");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 220, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codigo_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            codigo_.setEditable(false);
        } else {
            codigo_.setEditable(true);
        }
    }//GEN-LAST:event_codigo_KeyPressed

    private void b_selActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_selActionPerformed
        int codigo = Integer.parseInt(codigo_.getText());
        Productos pro1 = array1.busqueda_codigo(codigo);
        if (codigo > array1.rows()) {
            codigo_.setText("");
            JOptionPane.showMessageDialog(rootPane, "Codigo no encontrado");
        } else {
            /*Para el total, CONSTANTEMENTE agarrar el dato de unidades y multiplicarlo con el precio*/
            /*https://www.youtube.com/watch?v=5dK4dA39INk
              https://www.youtube.com/watch?v=91Rp2MA0i94*/
            int x = 1;
            Object[] row_data = {pro1.getP_id(), pro1.getNombre(), x, pro1.getPrecio(), x * pro1.getPrecio()};
            //modelo.addRow(row_data);
            DefaultTableModel modelo = (DefaultTableModel) table_products.getModel();
            modelo.addRow(row_data);
        }
    }//GEN-LAST:event_b_selActionPerformed

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        productos_1 p1 = new productos_1();
        aux.change_jf(p1, this);
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
            java.util.logging.Logger.getLogger(comprar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comprar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comprar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comprar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comprar_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_exit;
    private javax.swing.JButton b_sel;
    private javax.swing.JTextField codigo_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_products;
    // End of variables declaration//GEN-END:variables
}
