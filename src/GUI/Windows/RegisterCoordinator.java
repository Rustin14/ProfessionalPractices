/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: RegisterCoordinator
Date of creation: May 15th. 2020 
*/ 
package GUI.Windows;
import BusinessLogic.CoordinatorValidations;
import BusinessLogic.PersonDataValidations;
import dataAccess.CoordinatorDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegisterCoordinator extends javax.swing.JFrame {

    public RegisterCoordinator() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("registrar Coordinador");
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
        jLabelCubicle = new javax.swing.JLabel();
        jTextFieldCubicle = new javax.swing.JTextField();
        jLabelIDNumber = new javax.swing.JLabel();
        jTextFieldIDNumber = new javax.swing.JTextField();
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
        getContentPane().add(jLabelNameCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabelCoordinatorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/coordinador.png"))); // NOI18N
        getContentPane().add(jLabelCoordinatorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabelPersonalNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPersonalNumber.setText("Número de personal :");
        getContentPane().add(jLabelPersonalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jLabelMailCoordinator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMailCoordinator.setText("Correo :");
        getContentPane().add(jLabelMailCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabelPasswordCoordinator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPasswordCoordinator.setText("Asigne una contraseña :");
        getContentPane().add(jLabelPasswordCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jTextFieldPersonalNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPersonalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 230, 30));

        jTextFieldNameCoordinator.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldNameCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 230, 30));

        jTextFieldMailCoordinator.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldMailCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 230, 30));

        jTextFieldPasswordCoordinator.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPasswordCoordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 230, 30));

        jButtonRegister.setBackground(new java.awt.Color(204, 255, 255));
        jButtonRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabelCubicle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCubicle.setText("Cubiculo: ");
        getContentPane().add(jLabelCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jTextFieldCubicle.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 230, 30));

        jLabelIDNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelIDNumber.setText("Número de identificación:");
        getContentPane().add(jLabelIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextFieldIDNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 230, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 723, 461));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        cancelOption();
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        verificarCampos();
    }//GEN-LAST:event_jButtonRegisterActionPerformed
    
    String nameCoordinator = "";
    String idNumber = "";
    String cubicle = "";
    String staffNumber = "";
    String mailCoordinator = "";
    String passwordCoordinator = "";
    
     void verificarCampos(){
        
        CoordinatorValidations userCoordinator = new CoordinatorValidations();
        
            if (jTextFieldNameCoordinator.getText().isEmpty() 
                    || jTextFieldCubicle.getText().isEmpty()
                        || jTextFieldPersonalNumber.getText().isEmpty() 
                            || jTextFieldMailCoordinator.getText().isEmpty() 
                                || jTextFieldPasswordCoordinator.getText().isEmpty()){
                                    JOptionPane.showMessageDialog(this, "Favor de NO dejar espacios vacios");   
            }else{
            
                nameCoordinator = jTextFieldNameCoordinator.getText();
                idNumber = jTextFieldIDNumber.getText();
                cubicle = jTextFieldNameCoordinator.getText();
                staffNumber = jTextFieldPersonalNumber.getText();
                mailCoordinator = jTextFieldMailCoordinator.getText();
                passwordCoordinator = jTextFieldPasswordCoordinator.getText();
            
                if((userCoordinator.validateName(nameCoordinator)) 
                        && (userCoordinator.validateIDNumber(idNumber))
                            && (userCoordinator.validateCubicleNumber(cubicle))
                                && (userCoordinator.validateStaffNumber(staffNumber)) 
                                    && (userCoordinator.validateEmail(mailCoordinator)) 
                                        && (userCoordinator.validatePassword(passwordCoordinator))){
                                            saveCoordinator();
                                            JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO");
                                            returnHomeAdministrator();
                                            
                }else if(!userCoordinator.validateName(nameCoordinator)){
                    JOptionPane.showMessageDialog(this, "Asegurese de ingresar un nombre valido");
                }else if(!userCoordinator.validateIDNumber(idNumber)){
                    JOptionPane.showMessageDialog(this, "Asegurese de ingresar un NÚMERO de identificación valido,"
                            + "4 números como máximo");
                }else if(!userCoordinator.validateCubicleNumber(cubicle)){
                    JOptionPane.showMessageDialog(this, "Ingrese un NÚMERO de cubiculo valido, 2 números como máximo");
                }else if(!userCoordinator.validateStaffNumber(staffNumber)){
                    JOptionPane.showMessageDialog(this, "Asegurese de ingresar un numero de personal valido");
                }else if(!userCoordinator.validateEmail(mailCoordinator)){
                    JOptionPane.showMessageDialog(this, "Asegurese de ingresar un Email valido");
                }else if(!userCoordinator.validatePassword(passwordCoordinator)){
                    JOptionPane.showMessageDialog(this, "Asegurese de que su contraseña contenga números y caracteres");
                }   
            }
    }
   
    void saveCoordinator(){
        try {
            CoordinatorDAO coordinator = new CoordinatorDAO();
            coordinator.saveCoordinator(idNumber, nameCoordinator, cubicle, staffNumber, mailCoordinator
                    ,passwordCoordinator);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a la base de datos en este momento. Intente más tarde.");
            Logger.getLogger(RegisterCoordinator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    void returnHomeAdministrator(){
        PrincipalWindowAdministrator returnToWindowAdministrator = new PrincipalWindowAdministrator();
        returnToWindowAdministrator.setVisible(true);
        dispose(); 
    }
    
    void cancelOption(){
        String [] cancelButtons = {"Si", "No"}; 
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", 
                "Cancelar Registro de Coordinador", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons[0]);
        if (optionSelected == 0) {
            returnHomeAdministrator();
        }  
    }
    
    
    
    
    
    
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
    private javax.swing.JLabel jLabelCubicle;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelIDNumber;
    private javax.swing.JLabel jLabelMailCoordinator;
    private javax.swing.JLabel jLabelNameCoordinator;
    private javax.swing.JLabel jLabelPasswordCoordinator;
    private javax.swing.JLabel jLabelPersonalNumber;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldCubicle;
    private javax.swing.JTextField jTextFieldIDNumber;
    private javax.swing.JTextField jTextFieldMailCoordinator;
    private javax.swing.JTextField jTextFieldNameCoordinator;
    private javax.swing.JTextField jTextFieldPasswordCoordinator;
    private javax.swing.JTextField jTextFieldPersonalNumber;
    // End of variables declaration//GEN-END:variables
}
