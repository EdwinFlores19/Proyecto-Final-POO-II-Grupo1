package vista_controlador.admin;

import javax.swing.JOptionPane;
import proyecto_final.Proveedor;
import proyecto_final.Proveedor_Array;

public class crear_cuenta_proveedor extends javax.swing.JFrame {

    Proveedor_Array proveedor_a = new Proveedor_Array();

    public crear_cuenta_proveedor() {
        initComponents();
        proveedor_a.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sucursal_ = new javax.swing.JTextField();
        website_ = new javax.swing.JTextField();
        contacto2_ = new javax.swing.JTextField();
        contacto1_ = new javax.swing.JTextField();
        razon_ = new javax.swing.JTextField();
        ruc_ = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        direccion_ = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(this.getPreferredSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("crear cuenta proveedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 730, -1));

        jLabel13.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NOMBRE CONTACTO 1:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 210, -1));

        jLabel14.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Dirección:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 110, -1));

        jLabel15.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("RUC:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 50, -1));

        jLabel16.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("SUCURSAL:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 100, -1));

        jLabel17.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nombre CONTACTO 2: ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 220, -1));

        jLabel18.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("WEBSITE:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 80, -1));

        sucursal_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        getContentPane().add(sucursal_, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 140, -1));

        website_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        getContentPane().add(website_, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 140, -1));

        contacto2_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        getContentPane().add(contacto2_, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 140, -1));

        contacto1_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        getContentPane().add(contacto1_, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 140, -1));

        razon_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        getContentPane().add(razon_, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 140, -1));

        ruc_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        getContentPane().add(ruc_, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 140, -1));

        regresar.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        regresar.setText("REGRESAR");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, -1, -1));

        crear.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        crear.setText("cREAR PROVEEDOR");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        direccion_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        getContentPane().add(direccion_, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 140, -1));

        jLabel19.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("rAZON SOCIAL:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        admin_1 a1 = new admin_1();
        a1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:
        String ruc = ruc_.getText();
        String direccion= direccion_.getText();
        String razon_social = razon_.getText();
        String contacto1 = contacto1_.getText();
        String contacto2 = contacto2_.getText();
        String website = website_.getText();
        String sucursal = sucursal_.getText();

        Proveedor p1 = proveedor_a.busqueda_proveedor(ruc);
        if (!ruc.isBlank() && ruc.length() == 11 && !p1.getRuc().equals(ruc)) {

            Proveedor p2 = new Proveedor();

            p2.setRuc(ruc);
            p2.setDireccion(direccion);
            p2.setRaz_social(razon_social);
            p2.setNom_contact1(contacto1);
            p2.setNom_contact2(contacto2);
            p2.setWebsite(website);
            p2.setSurcursal(sucursal);

            proveedor_a.agregar(p2);
            proveedor_a.grabar_archivo(p2);
            
            JOptionPane.showMessageDialog(rootPane, "Proveedor creado satisfactoriamente", "Creacion correcta ", JOptionPane.INFORMATION_MESSAGE);
            
            admin_1 a1 = new admin_1();
            a1.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(rootPane, "RUC inválido", "Error de búsqueda", JOptionPane.ERROR_MESSAGE);
            ruc_.setText("");
            razon_.setText("");
            direccion_.setText("");
            contacto1_.setText("");
            contacto2_.setText("");
            website_.setText("");
            sucursal_.setText("");
        }
    }//GEN-LAST:event_crearActionPerformed

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
            java.util.logging.Logger.getLogger(crear_cuenta_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crear_cuenta_proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contacto1_;
    private javax.swing.JTextField contacto2_;
    private javax.swing.JButton crear;
    private javax.swing.JTextField direccion_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField razon_;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField ruc_;
    private javax.swing.JTextField sucursal_;
    private javax.swing.JTextField website_;
    // End of variables declaration//GEN-END:variables
}
