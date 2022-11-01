package vista_controlador.admin;

import javax.swing.table.DefaultTableModel;
import proyecto_final.usuario_Array;
import auxiliares.Auxiliares;
import proyecto_final.Cliente;
import proyecto_final.cliente_Array;

public class listado_cliente extends javax.swing.JFrame {

    DefaultTableModel modelo;
    usuario_Array array1 = new usuario_Array();
    Auxiliares aux = new Auxiliares();
    cliente_Array cliente_a = new cliente_Array();

    public listado_cliente() {
        initComponents();
        array1.inicializar();
        cliente_a.inicializar();
        modelo = new DefaultTableModel();

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("N° documento");
        modelo.addColumn("Rol");
        modelo.addColumn("Sexo");
        modelo.addColumn("Email");

        this.table_lista_clientes.setModel(modelo);
        for (int i = 0; i < array1.rows(); i++) {
            if ("Cliente".equals(array1.get(i).getRol())) {
                Cliente cliente1 = cliente_a.busqueda_credencial(array1.get(i).getCredencial());

                String[] info = new String[6];
                info[0] = String.valueOf(array1.get(i).getId());
                info[1] = cliente1.getNombre();
                info[2] = cliente1.getDocumento();
                info[3] = "Cliente";
                info[4] = cliente1.getSexo();
                info[5] = String.valueOf(cliente1.getEmail());

                modelo.addRow(info);
            }

        }
        table_lista_clientes.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        b_exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_lista_clientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(this.getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("listar clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 400, -1));

        b_exit.setBackground(new java.awt.Color(255, 255, 255));
        b_exit.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        b_exit.setForeground(new java.awt.Color(0, 0, 0));
        b_exit.setText("salir");
        b_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_exitActionPerformed(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, 160, -1));

        table_lista_clientes.setBackground(new java.awt.Color(255, 255, 255));
        table_lista_clientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_lista_clientes.setForeground(new java.awt.Color(0, 0, 0));
        table_lista_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "N° Documento", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_lista_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_lista_clientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_lista_clientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        // TODO add your handling code here:
        clientes_1 c1 = new clientes_1();
        aux.change_jf(c1, this);
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
            java.util.logging.Logger.getLogger(listado_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listado_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listado_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listado_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listado_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_lista_clientes;
    // End of variables declaration//GEN-END:variables
}
