package vista_controlador;

import javax.swing.JOptionPane;
import proyecto_final.usuario_Array;
import proyecto_final.Vendedor;
import auxiliares.Auxiliares;

public class crear_cuenta extends javax.swing.JFrame {

    usuario_Array array1 = new usuario_Array();
    Auxiliares aux = new Auxiliares();

    public crear_cuenta() {
        initComponents();
        array1.inicializar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j3 = new javax.swing.JPasswordField();
        j4 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        j2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        j1 = new javax.swing.JTextField();
        combobox = new javax.swing.JComboBox<>();
        combo_DR = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sexo_ = new javax.swing.JComboBox<>();
        hijos_ = new javax.swing.JSpinner();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        j3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 140, -1));

        j4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Crear Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, -1));

        j2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        j2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j2KeyPressed(evt);
            }
        });
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 140, -1));

        jLabel5.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                                       Rol:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 250, 30));

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI / RUC:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 180, -1));

        j1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        j1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j1KeyPressed(evt);
            }
        });
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 140, -1));

        combobox.setMaximumRowCount(1);
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cliente" }));
        combobox.setToolTipText("");
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 140, -1));

        combo_DR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        getContentPane().add(combo_DR, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 110, 30));

        jLabel7.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 250, 30));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 50, 30));

        jLabel8.setFont(new java.awt.Font("Felix Titling", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero de hijos:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, 30));

        sexo_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Femenino", "Otros" }));
        getContentPane().add(sexo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 140, -1));
        getContentPane().add(hijos_, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 140, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/img1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id = array1.Correlativo();
        String nombre = j1.getText();
        String credential = j2.getText();
        String pre_cont = j4.getText();
        String contrasena = j3.getText();
        String rol = (String) combobox.getSelectedItem();
        String sexo= (String) sexo_.getSelectedItem();
        int hijos= (Integer) hijos_.getValue();
        rol = rol.toLowerCase();
        String combo_dr = (String) combo_DR.getSelectedItem();
        
        Vendedor v2= array1.busqueda_dni(credential);

        if (pre_cont.equals(contrasena) && !(pre_cont.isBlank()) && !(contrasena.isBlank())) {
            if (credential.length() == 8 || credential.length()==11 && !(credential.isBlank()) ) {
                if(rol != ""){
                    if(!v2.getDni().equals(credential) ){
                        if(sexo !=""){
                        Vendedor vendedor1 = new Vendedor();
                        vendedor1.setCodigo(id);
                        vendedor1.setNombre(nombre);
                        vendedor1.setDni(credential);
                        vendedor1.setContrasena(contrasena);
                        vendedor1.setRol(rol);
                        vendedor1.setSexo(sexo);
                        vendedor1.setNum_hijos(hijos);

                        array1.agregar(vendedor1);
                        array1.grabar_archivo(vendedor1);

                        vista_login v1 = new vista_login();
                        v1.setVisible(true);
                        this.setVisible(false);
                        }
                        else{
                           JOptionPane.showMessageDialog(rootPane, "Seleccione una de las opciones en la casilla Sexo"); 
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "El documento ingresado ya se encuentra registrado");
                        j2.setText("");
                        j1.setText("");
                        j3.setText("");
                        j4.setText("");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Seleccione un rol correcto");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El DNI ( 8 digitos) o RUC ( 11 digitos) ingresado es incorrecto");
                j2.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Las contraseñas deben ser iguales y no vacias");
            j3.setText("");
            j4.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vista_login v1 = new vista_login();
        aux.change_jf(v1, this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void j1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j1KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            j1.setEditable(false);
        } else {
            j1.setEditable(true);
        }
    }//GEN-LAST:event_j1KeyPressed

    private void j2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            j2.setEditable(false);
        } else {
            j2.setEditable(true);
        }
    }//GEN-LAST:event_j2KeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crear_cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crear_cuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_DR;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JLabel fondo;
    private javax.swing.JSpinner hijos_;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JPasswordField j3;
    private javax.swing.JPasswordField j4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> sexo_;
    // End of variables declaration//GEN-END:variables
}

/*if (!v2.getDni().equals(credential) && !"".equals(v2.getDni()) && pre_cont.equals(contrasena) && !(aux.tf_are_empty(new Object[]{nombre, credential, pre_cont, contrasena}))) {
            switch (combo_dr) {
                case "DNI" -> {
                    if (credential.length() == 8) {
                        Vendedor vendedor1 = new Vendedor();
                        vendedor1.setCodigo(id);
                        vendedor1.setNombre(nombre);
                        vendedor1.setDni(credential);
                        vendedor1.setContrasena(contrasena);
                        vendedor1.setRol(rol);

                        array1.agregar(vendedor1);
                        array1.grabar_archivo(vendedor1);

                        vista_login v1 = new vista_login();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El DNI debe tener 8 digitos");
                        j2.setText("");
                    }
                }

                case "RUC" -> {
                    if (credential.length() == 11) {
                        Vendedor vendedor1 = new Vendedor();
                        vendedor1.setCodigo(id);
                        vendedor1.setNombre(nombre);
                        vendedor1.setDni(credential);
                        vendedor1.setContrasena(contrasena);
                        vendedor1.setRol(rol);

                        array1.agregar(vendedor1);
                        array1.grabar_archivo(vendedor1);

                        vista_login v1 = new vista_login();
                        aux.change_jf(v1, this);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El RUC debe tener 11 digitos");
                        j2.setText("");
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "El documento ingresado ya se encuentra registrado");
            j2.setText("");
            j1.setText("");
            j3.setText("");
            j4.setText("");
        }
*/