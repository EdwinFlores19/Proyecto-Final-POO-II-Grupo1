package vista_controlador.productos;

import javax.swing.JOptionPane;
import vista_controlador.admin.productos_1;
import proyecto_final.*;
import auxiliares.Auxiliares;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class nuevo_producto extends javax.swing.JFrame {

    productos_Array array_pro = new productos_Array();
    Auxiliares aux = new Auxiliares();

    public nuevo_producto() {
        initComponents();
        array_pro.inicializar();
        Calendar c2 = new GregorianCalendar();
        fecha_ingreso.setCalendar(c2);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        color_ = new javax.swing.JTextField();
        nombre_ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fecha_ingreso = new com.toedter.calendar.JDateChooser();
        fecha_vencimiento = new com.toedter.calendar.JDateChooser();
        tamaño_ = new javax.swing.JComboBox<>();
        unidades_ = new javax.swing.JSpinner();
        stock_ = new javax.swing.JSpinner();
        costo_ = new javax.swing.JSpinner();
        precio_ = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(this.getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Color:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("tamaño:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("costo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 480, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 220, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CREAR PRODUCTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 220, -1));

        color_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        color_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                color_KeyPressed(evt);
            }
        });
        getContentPane().add(color_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 140, -1));

        nombre_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombre_KeyPressed(evt);
            }
        });
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 140, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("unidades:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("precio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("F. ingreso:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("f. vencimiento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("stock:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));
        getContentPane().add(fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 140, 30));
        getContentPane().add(fecha_vencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 140, 30));

        tamaño_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        tamaño_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "pequeño", "mediano", "grande" }));
        getContentPane().add(tamaño_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 140, 30));

        unidades_.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(unidades_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 140, 30));

        stock_.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(stock_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 140, 30));

        costo_.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        getContentPane().add(costo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 140, 30));

        precio_.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        getContentPane().add(precio_, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        productos_1 p1 = new productos_1();
        aux.change_jf(p1, this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int codigo = array_pro.Correlativo();
        String nombre = nombre_.getText();
        String color = color_.getText();
        String tamaño = (String) tamaño_.getSelectedItem();
        int unidades = (int) unidades_.getValue();
        int stock = (int) stock_.getValue();
        double costo = (double) costo_.getValue();
        double precio =(double) precio_.getValue();
        Date ingreso = fecha_ingreso.getDate();
        Date vencimiento =  fecha_vencimiento.getDate();

        if (!(nombre.isEmpty()) && !(tamaño.isEmpty()) && !(color.isEmpty()) && !"".equals(tamaño)) {
            Productos pro1 = new Productos();
            pro1.setP_id(codigo);
            pro1.setNombre(nombre);
            pro1.setTamaño(tamaño);
            pro1.setColor(color);
            pro1.setUnidades(unidades);
            pro1.setStock(stock);
            pro1.setCosto(costo);
            pro1.setPrecio(precio);
            pro1.setF_ingreso(String.valueOf(ingreso));
            pro1.setF_vencimiento(String.valueOf(vencimiento));

            array_pro.agregar(pro1);
            array_pro.grabar_archivo(pro1);

            JOptionPane.showMessageDialog(rootPane, "Registro completado");
            productos_1 p1 = new productos_1();
            aux.change_jf(p1, this);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ningun casillero debe estar vacio");
            nombre_.setText("");
            color_.setText("");
            
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void color_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_color_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tamaño_.setEditable(false);
        } else {
            tamaño_.setEditable(true);
        }
    }//GEN-LAST:event_color_KeyPressed

    private void nombre_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            tamaño_.setEditable(false);
        } else {
            tamaño_.setEditable(true);
        }
    }//GEN-LAST:event_nombre_KeyPressed

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
            java.util.logging.Logger.getLogger(nuevo_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevo_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevo_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevo_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevo_producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField color_;
    private javax.swing.JSpinner costo_;
    private com.toedter.calendar.JDateChooser fecha_ingreso;
    private com.toedter.calendar.JDateChooser fecha_vencimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre_;
    private javax.swing.JSpinner precio_;
    private javax.swing.JSpinner stock_;
    private javax.swing.JComboBox<String> tamaño_;
    private javax.swing.JSpinner unidades_;
    // End of variables declaration//GEN-END:variables
}
