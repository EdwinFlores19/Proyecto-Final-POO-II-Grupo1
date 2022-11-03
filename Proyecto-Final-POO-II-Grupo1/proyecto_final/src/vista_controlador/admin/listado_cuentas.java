package vista_controlador.admin;

import javax.swing.table.DefaultTableModel;
import proyecto_final.usuario_Array;
import auxiliares.Auxiliares;
import proyecto_final.Cliente;
import proyecto_final.Trabajador;
import proyecto_final.cliente_Array;
import proyecto_final.trabajador_Array;

public class listado_cuentas extends javax.swing.JFrame {

    DefaultTableModel modelo;
    usuario_Array array1 = new usuario_Array();
    Auxiliares aux = new Auxiliares();
    cliente_Array cliente_a = new cliente_Array();
    trabajador_Array trabajador_a = new trabajador_Array();

    public listado_cuentas() {
        initComponents();
        array1.inicializar();
        cliente_a.inicializar();
        trabajador_a.inicializar();
        modelo = new DefaultTableModel();

        modelo.addColumn("Codigo");
        modelo.addColumn("N° documento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Email");
        modelo.addColumn("Sexo");
        modelo.addColumn("Rol");

        this.table_lista_cuentas.setModel(modelo);
        for (int i = 0; i < array1.rows(); i++) {
            String[] info = new String[6];
            info[0] = String.valueOf(array1.get(i).getId());
            info[1] = array1.get(i).getCredencial();
            if ("Cliente".equals(array1.get(i).getRol())) {
                Cliente prueba = cliente_a.busqueda_credencial(array1.get(i).getCredencial());
                info[2] = prueba.getNombre();
                info[3] = prueba.getEmail();
                info[4] = prueba.getSexo();

            } else if ("Administrador".equals(array1.get(i).getRol()) || "Vendedor".equals(array1.get(i).getRol())) {
                Trabajador prueba1 = trabajador_a.busqueda_credencial(array1.get(i).getCredencial());
                info[2] = prueba1.getNombre();
                info[3] = prueba1.getEmail();
                info[4] = prueba1.getSexo();
            }

            info[5] = array1.get(i).getRol();

            modelo.addRow(info);
        }
        table_lista_cuentas.setDefaultEditor(Object.class, null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_lista_cuentas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(this.getPreferredSize());
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
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 180, -1));

        table_lista_cuentas.setBackground(new java.awt.Color(255, 255, 255));
        table_lista_cuentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_lista_cuentas.setForeground(new java.awt.Color(0, 0, 0));
        table_lista_cuentas.setModel(new javax.swing.table.DefaultTableModel(
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
        table_lista_cuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_lista_cuentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_lista_cuentas);
        if (table_lista_cuentas.getColumnModel().getColumnCount() > 0) {
            table_lista_cuentas.getColumnModel().getColumn(0).setResizable(false);
            table_lista_cuentas.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1170, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTADO DE CUENTAS REGISTRADAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_exitActionPerformed
        cuentas_1 a1 = new cuentas_1();
        aux.change_jf(a1, this);
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
            java.util.logging.Logger.getLogger(listado_cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listado_cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listado_cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listado_cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listado_cuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_lista_cuentas;
    // End of variables declaration//GEN-END:variables
}
