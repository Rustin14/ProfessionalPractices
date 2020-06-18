package GUI.Windows;

import BusinessLogic.CoordinatorValidations;
import BusinessLogic.PersonDataValidations;
import javax.swing.JOptionPane;

/**
 *
 * @author BRANDON
 */
public class RegisterCoordinator extends javax.swing.JFrame {

    public RegisterCoordinator() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("registrar Coordinador");
    }

    void verificarCampos(){
        PersonDataValidations user = new PersonDataValidations();
        CoordinatorValidations userCoordinator = new CoordinatorValidations();
            if (jTextFieldNameCoordinator.getText().isEmpty() 
                || jTextFieldPersonalNumber.getText().isEmpty() 
                    || jTextFieldMailCoordinator.getText().isEmpty() 
                        || jTextFieldPasswordCoordinator.getText().isEmpty()){
                            JOptionPane.showMessageDialog(this, "Favor de NO dejar espacios vacios");   
            }else{
            
                String nameCoordinator = jTextFieldNameCoordinator.getText();
                String personalNumberCoordinator = jTextFieldPersonalNumber.getText();
                String mailCoordinator = jTextFieldMailCoordinator.getText();
                String passwordCoordinator = jTextFieldPasswordCoordinator.getText();
            
                if((user.validateName(nameCoordinator) == true) 
                        && (userCoordinator.validateStaffNumber(personalNumberCoordinator) == true) 
                            && (user.validateEmail(mailCoordinator) == true) 
                                && (user.validatePassword(passwordCoordinator) == true)){
                                    JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO");
                                    dispose(); 
                }else if((user.validateName(nameCoordinator) == false)){
                    JOptionPane.showMessageDialog(this, "Asegurese de ingresar un nombre valido");
                }else if((userCoordinator.validateStaffNumber(personalNumberCoordinator) == false)){
                    JOptionPane.showMessageDialog(this, "Asegurese de ingresar un numero de personal valido");
                }else if((user.validateEmail(mailCoordinator) == false)){
                    JOptionPane.showMessageDialog(this, "Asegurese de ingresar un Email valido");
                }else if((user.validatePassword(passwordCoordinator) == false)){
                    JOptionPane.showMessageDialog(this, "Asegurese de que su contraseña contenga números y caracteres");
                }   
            }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancel = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelNameCoordinator = new javax.swing.JLabel();
        jLabelCoordinatorIcon = new javax.swing.JLabel();
        jLabelPersonalNumber = new javax.swing.JLabel();
        jLabelMailCoordinator = new javax.swing.JLabel();
        jLabelPasswordCoordinator = new javax.swing.JLabel();
        jTextFieldPersonalNumber = new javax.swing.JTextField();
        jTextFieldNameCoordinator = new javax.swing.JTextField();
        jTextFieldMailCoordinator = new javax.swing.JTextField();
        jTextFieldPasswordCoordinator = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Registrar Coordinador");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabelNameCoordinator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNameCoordinator.setText("Nombre :");
        getContentPane().add(jLabelNameCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabelCoordinatorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/coordinador.png"))); // NOI18N
        getContentPane().add(jLabelCoordinatorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabelPersonalNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPersonalNumber.setText("Número de personal :");
        getContentPane().add(jLabelPersonalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        jLabelMailCoordinator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMailCoordinator.setText("Correo :");
        getContentPane().add(jLabelMailCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabelPasswordCoordinator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPasswordCoordinator.setText("Asigne una contraseña :");
        getContentPane().add(jLabelPasswordCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jTextFieldPersonalNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPersonalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 230, 30));

        jTextFieldNameCoordinator.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldNameCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 230, 30));

        jTextFieldMailCoordinator.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldMailCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 230, 30));

        jTextFieldPasswordCoordinator.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPasswordCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 230, 30));

        jButtonRegister.setBackground(new java.awt.Color(204, 255, 255));
        jButtonRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 723, 461));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", "Cancelar Registro de Coordinador", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons[0]);
        
        if (optionSelected == 0) {
            PrincipalWindowAdministrator returnToWindowAdministrator = new PrincipalWindowAdministrator();
            returnToWindowAdministrator.setVisible(true);
            dispose();   
        } 
        
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        verificarCampos();
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCoordinator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelCoordinatorIcon;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelMailCoordinator;
    private javax.swing.JLabel jLabelNameCoordinator;
    private javax.swing.JLabel jLabelPasswordCoordinator;
    private javax.swing.JLabel jLabelPersonalNumber;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldMailCoordinator;
    private javax.swing.JTextField jTextFieldNameCoordinator;
    private javax.swing.JTextField jTextFieldPasswordCoordinator;
    private javax.swing.JTextField jTextFieldPersonalNumber;
    // End of variables declaration//GEN-END:variables
}
