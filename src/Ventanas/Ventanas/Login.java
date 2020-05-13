package Ventanas.Ventanas;


import BusinessLogic.PersonDataValidations;
import javax.swing.JOptionPane;

/**
 *
 * @author BRANDON
 */
public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio de Sesión");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelUserIcon = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelUserPassword = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jPasswordFieldPasswordUser = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(204, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 120, 30));

        jLabelUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/UserIcon.png"))); // NOI18N
        getContentPane().add(jLabelUserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 260, 270));

        jLabelUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelUserName.setText("Usuario :");
        getContentPane().add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabelUserPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelUserPassword.setText("Password : ");
        getContentPane().add(jLabelUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jTextFieldUserName.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 250, 30));

        jPasswordFieldPasswordUser.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jPasswordFieldPasswordUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 250, 30));

        jButtonLogin.setBackground(new java.awt.Color(204, 255, 255));
        jButtonLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonLogin.setText("Iniciar Sesión");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 727, 444));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
      
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    PersonDataValidations usuario = new PersonDataValidations();
    
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        if (jTextFieldUserName.getText().isEmpty() || jPasswordFieldPasswordUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
        }else{
            String userName = jTextFieldUserName.getText();
            String userPassword = jPasswordFieldPasswordUser.getText();
            usuario.validateEmail(userName);
            usuario.validatePassword(userPassword);
            usuario.saveEmailDao();
            usuario.savePasswordDao();             
            
            PrincipalWindowAdministrator goToWindowAdministrator = new PrincipalWindowAdministrator();
            goToWindowAdministrator.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelUserIcon;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserPassword;
    private javax.swing.JPasswordField jPasswordFieldPasswordUser;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
