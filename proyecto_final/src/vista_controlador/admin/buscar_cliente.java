/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista_controlador.admin;

import javax.swing.JOptionPane;
import proyecto_final.usuario_Array;
import proyecto_final.Vendedor;

/**
 *
 * @author WILLIAM
 */
public class buscar_cliente extends javax.swing.JFrame {
usuario_Array array1= new usuario_Array();
    /**
     * Creates new form buscar_cliente
     */
    public buscar_cliente() {
        initComponents();
        array1.inicializar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        documento_ = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        doc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nombre_ = new javax.swing.JLabel();
        codigo_ = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hijos_ = new javax.swing.JLabel();
        rol_ = new javax.swing.JLabel();
        sexo_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("buscar cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 420, -1));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI / RUC :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        documento_.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        documento_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        documento_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                documento_KeyPressed(evt);
            }
        });
        getContentPane().add(documento_, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        doc.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        doc.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CODIGO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, 160, -1));

        nombre_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        nombre_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        codigo_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        codigo_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(codigo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° de hijos:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("sexo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rol:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        jLabel13.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Documento:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        hijos_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        hijos_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hijos_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        rol_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        rol_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rol_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, -1, -1));

        sexo_.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        sexo_.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(sexo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void documento_KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documento_KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            documento_.setEditable(false);
        } else {
            documento_.setEditable(true);
        }
    }//GEN-LAST:event_documento_KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clientes_1 c1=new clientes_1();
        c1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String documento=documento_.getText();
        
        Vendedor v1=array1.busqueda_dni(documento);
        if(documento.length()==8 || documento.length()==11){
            if(v1.getRol().equals("cliente")){
                codigo_.setText(String.valueOf(v1.getCodigo()));
                nombre_.setText(v1.getNombre());
                doc.setText(String.valueOf(v1.getDni()));
                sexo_.setText(v1.getSexo());
                hijos_.setText(String.valueOf( v1.getNum_hijos()));
                rol_.setText(v1.getRol());
                documento_.setText("");
            }
            else if(v1.getRol().equals("administrador") || v1.getRol().equals("vendedor")){
                codigo_.setText("");
                nombre_.setText("");
                documento_.setText("");
                doc.setText("");
                sexo_.setText("");
                hijos_.setText("");
                rol_.setText("");
                JOptionPane.showMessageDialog(rootPane, "El codigo introducido no corresponde al de un cliente");
            }
            else {
                codigo_.setText("");
                nombre_.setText("");
                documento_.setText("");
                doc.setText("");
                sexo_.setText("");
                hijos_.setText("");
                rol_.setText("");
                JOptionPane.showMessageDialog(rootPane, "Codigo no encontrado");
            }
        }
        else{
            codigo_.setText("");
            nombre_.setText("");
            documento_.setText("");
            doc.setText("");
            sexo_.setText("");
            hijos_.setText("");
            rol_.setText("");
            JOptionPane.showMessageDialog(rootPane, "Ingresar un DNI (8 digitos) o RUC (11 digitos) valido");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscar_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigo_;
    private javax.swing.JLabel doc;
    private javax.swing.JTextField documento_;
    private javax.swing.JLabel hijos_;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nombre_;
    private javax.swing.JLabel rol_;
    private javax.swing.JLabel sexo_;
    // End of variables declaration//GEN-END:variables
}