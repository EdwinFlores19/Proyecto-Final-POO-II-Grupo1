package vista_controlador.cliente;

import auxiliares.Auxiliares;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_final.productos_Array;
import proyecto_final.Productos;
import proyecto_final.DetalleVentas;
import proyecto_final.DetalleVentas_Array;

public class cliente_comprar extends javax.swing.JFrame {

    productos_Array array1 = new productos_Array();
    DetalleVentas_Array array2 = new DetalleVentas_Array();
    Auxiliares aux = new Auxiliares();

    /* Boleta local */
    ArrayList<DetalleVentas> boleta_a = new ArrayList();

    public cliente_comprar() {
        initComponents();
        array1.inicializar();

        /* Inicializar table desde UI, con una funcion señal, si es que se cambio el valor en la celda de unidades, actualizar el total */
        table_products.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Codigo", "Nombre", "Cantidades", "Precio", "Total"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        table_products.setColumnSelectionAllowed(true);

        table_products.getTableHeader().setReorderingAllowed(false);

        jScrollPane1.setViewportView(table_products);

        table_products.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (table_products.getColumnModel().getColumnCount() > 0) {
            table_products.getColumnModel().getColumn(0).setResizable(false);
            table_products.getColumnModel().getColumn(1).setResizable(false);
            table_products.getColumnModel().getColumn(2).setResizable(false);
            table_products.getColumnModel().getColumn(3).setResizable(false);
            table_products.getColumnModel().getColumn(4).setResizable(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_products = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        codigo_ = new javax.swing.JTextField();
        b_sel = new javax.swing.JButton();
        b_edit = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        b_buy = new javax.swing.JButton();
        b_exit1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(this.getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidades", "Precio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_products.setColumnSelectionAllowed(true);
        table_products.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_products);
        table_products.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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

        b_edit.setBackground(new java.awt.Color(255, 255, 255));
        b_edit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_edit.setForeground(new java.awt.Color(0, 0, 0));
        b_edit.setText("editar");
        b_edit.setEnabled(false);
        b_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editActionPerformed(evt);
            }
        });
        getContentPane().add(b_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 130, 30));

        b_delete.setBackground(new java.awt.Color(255, 255, 255));
        b_delete.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_delete.setForeground(new java.awt.Color(0, 0, 0));
        b_delete.setText("eliminar");
        b_delete.setEnabled(false);
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(b_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 130, 30));

        b_buy.setBackground(new java.awt.Color(255, 255, 255));
        b_buy.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_buy.setForeground(new java.awt.Color(0, 0, 0));
        b_buy.setText("Comprar");
        b_buy.setEnabled(false);
        b_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buyActionPerformed(evt);
            }
        });
        getContentPane().add(b_buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 220, -1));

        b_exit1.setBackground(new java.awt.Color(255, 255, 255));
        b_exit1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit1.setForeground(new java.awt.Color(0, 0, 0));
        b_exit1.setText("SALIR");
        b_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 220, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        fondo.setForeground(new java.awt.Color(0, 0, 0));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        if (codigo > array1.rows() || codigo < 0) {
            codigo_.setText("");
            JOptionPane.showMessageDialog(rootPane, "Codigo inválido", "Error de búsqueda", JOptionPane.ERROR_MESSAGE);
        } else {
            String cant = JOptionPane.showInputDialog(rootPane, "Ingrese la cantidad de " + pro1.getNombre() + " que desea comprar:");
            while (cant.isBlank()) {
                cant = JOptionPane.showInputDialog(rootPane, "Ingrese la cantidad de " + pro1.getNombre() + " que desea comprar:");
            }

            b_buy.setEnabled(true);
            b_delete.setEnabled(true);
            b_edit.setEnabled(true);

            boolean encontrado = false;
            if (table_products.getRowCount() == 0) {
                Object[] row_data = {pro1.getP_id(), pro1.getNombre(), Integer.parseInt(cant), pro1.getPrecio(), pro1.getPrecio() * Double.parseDouble(cant)};

                DefaultTableModel modelo = (DefaultTableModel) table_products.getModel();
                modelo.addRow(row_data);
            } else {
                for (int i = 0; i < table_products.getRowCount(); i++) {
                    if (cant.equals("0") && table_products.getValueAt(i, 0).equals(codigo)) {
                        encontrado = true;
                        DefaultTableModel modelo = (DefaultTableModel) table_products.getModel();
                        modelo.removeRow(i);
                        break;
                    } else if (table_products.getValueAt(i, 0).equals(codigo) && cant.equals("0") == false) {
                        encontrado = true;
                        table_products.setValueAt(Integer.parseInt(cant) + Integer.parseInt(table_products.getValueAt(i, 2).toString()), i, 2);
                        table_products.setValueAt(pro1.getPrecio() * Double.parseDouble(cant) + Double.parseDouble(table_products.getValueAt(i, 4).toString()), i, 4);
                        break;
                    }
                }
                if (!encontrado) {
                    Object[] row_data = {pro1.getP_id(), pro1.getNombre(), Integer.parseInt(cant), pro1.getPrecio(), pro1.getPrecio() * Double.parseDouble(cant)};

                    DefaultTableModel modelo = (DefaultTableModel) table_products.getModel();
                    modelo.addRow(row_data);
                }
            }
        }
    }//GEN-LAST:event_b_selActionPerformed
    private String resumen_de_compra(DetalleVentas obj) {
        String resumen = "Codigo de venta: " + obj.getCodVenta() + "\n";
        double suma = 0;
        for (int i = 0; i < table_products.getRowCount(); i++) {
            resumen
                    += "Nombre: " + table_products.getValueAt(i, 1).toString() + "\n"
                    + "  Cantidad: " + table_products.getValueAt(i, 2).toString() + "\n"
                    + "  Precio: " + table_products.getValueAt(i, 3).toString() + "\n"
                    + "  Subtotal: " + table_products.getValueAt(i, 4).toString() + "\n";
            suma += Double.parseDouble(table_products.getValueAt(i, 4).toString());
        }
        resumen += "\nTotal: " + suma;
        return resumen;
    }

    private void b_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buyActionPerformed
        DetalleVentas det1 = new DetalleVentas();
        double suma = 0;
        for (int i = 0; i < table_products.getRowCount(); i++) {
            det1.setCodVenta(array2.Correlativo());
            det1.setCodProducto(Integer.parseInt(table_products.getValueAt(i, 0).toString()));
            det1.setNomProducto(table_products.getValueAt(i, 1).toString());
            det1.setCantidad(Double.parseDouble(table_products.getValueAt(i, 2).toString()));
            det1.setPrecioProducto(Double.parseDouble(table_products.getValueAt(i, 3).toString()));
            det1.setImporteTotal(Double.parseDouble(table_products.getValueAt(i, 4).toString()));
            suma += Double.parseDouble(table_products.getValueAt(i, 4).toString());
            boleta_a.add(det1);
        }

        int confirm = JOptionPane.showConfirmDialog(
                rootPane,
                "Resumen de compra:\n" + resumen_de_compra(det1),
                "Resumen de compra",
                JOptionPane.YES_NO_OPTION);

        if (confirm == 0) {
            for (int i = 0; i < boleta_a.size(); i++) {
                array2.agregar(boleta_a.get(i));
                array2.grabar_archivo(boleta_a.get(i));
                DefaultTableModel modelo = (DefaultTableModel) table_products.getModel();
                modelo.setRowCount(0);
            }
        }
    }//GEN-LAST:event_b_buyActionPerformed

    private void b_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exit1ActionPerformed
        cliente_1 p1 = new cliente_1();
        aux.change_jf(p1, this);
    }//GEN-LAST:event_b_exit1ActionPerformed

    private void b_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editActionPerformed
        int row = table_products.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "No se ha elegido un producto", "Error de edición", JOptionPane.ERROR_MESSAGE);
        } else {
            String value = JOptionPane.showInputDialog(rootPane, "Ingrese la cantidad nueva cantidad que desea comprar:");
            while (value.isBlank()) {
                value = JOptionPane.showInputDialog(rootPane, "Ingrese la cantidad nueva cantidad que desea comprar:");
            }
            table_products.setValueAt(value, row, 2);
            double pre_val = (double) table_products.getValueAt(row, 3);
            table_products.setValueAt(Double.parseDouble(value) * pre_val, row, 4);
        }
    }//GEN-LAST:event_b_editActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        int row = table_products.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "No se ha elegido un producto", "Error de edición", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de su elección?", "Confirmación de edición", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == 0) {
                DefaultTableModel modelo = (DefaultTableModel) table_products.getModel();
                modelo.removeRow(row);
            }
        }
    }//GEN-LAST:event_b_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(cliente_comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente_comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente_comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente_comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente_comprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buy;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_edit;
    private javax.swing.JButton b_exit1;
    private javax.swing.JButton b_sel;
    private javax.swing.JTextField codigo_;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_products;
    // End of variables declaration//GEN-END:variables
}
