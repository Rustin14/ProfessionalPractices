/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: RegisterProfessor
Date of creation: May 15th. 2020 
*/ 
package GUI.Windows;
import javax.swing.JOptionPane;
import BusinessLogic.PersonDataValidations;
import BusinessLogic.ProfessorValidations;
import Domain.Person;
import dataAccess.PersonDAO;
import dataAccess.ProfessorDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterProfessor extends javax.swing.JFrame {

    public RegisterProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Profesor");
    }

    String nameProfessor = "";
    String phoneNumber = "";
    String cubicle = "";
    String personalNumber = "";
    String mailProfessor = "";
    String passwordProfessor = "";
    String chooseShift = null;
    static final String status = "Activo";
    
    void verificarCampos(){
        PersonDataValidations user = new PersonDataValidations ();
        ProfessorValidations professor = new ProfessorValidations();
        
        if (jTextFieldNameProfessor.getText().isEmpty() 
                ||jTextFieldPhoneNumber.getText().isEmpty()
                    || jTextFieldCubicle.getText().isEmpty()
                        || jTextFieldPersonalNumber.getText().isEmpty()
                            || jTextFieldMailProfessor.getText().isEmpty() 
                                || jTextFieldPasswordProfessor.getText().isEmpty()){
                                    JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
        }else if (jRadioButtonMorningShift.isSelected() == false && jRadioButtonEveningShift.isSelected() == false){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
        }else{
            nameProfessor = jTextFieldNameProfessor.getText();
            phoneNumber = jTextFieldPhoneNumber.getText();
            cubicle = jTextFieldCubicle.getText();
            personalNumber = jTextFieldPersonalNumber.getText();
            mailProfessor = jTextFieldMailProfessor.getText();
            passwordProfessor = jTextFieldPasswordProfessor.getText();
           
            
            if (jRadioButtonMorningShift.isSelected() == true){
                chooseShift = jRadioButtonMorningShift.getText();
            }else{
                chooseShift = jRadioButtonEveningShift.getText();
            }
            
            if((user.validateName(nameProfessor)) 
                    &&(user.validatePhoneNumber(phoneNumber))
                        && (user.validateEmail(mailProfessor)) 
                            && (professor.validateCubicleNumber(cubicle))
                                && (user.validatePassword(passwordProfessor)) 
                                    && (professor.validateStaffNumber(personalNumber))){
                                        savePerson(nameProfessor, phoneNumber, mailProfessor);
                                        getIdPersonSaved(nameProfessor);
            }else if(!user.validateName(nameProfessor)){
                JOptionPane.showMessageDialog(this, "Favor de ingresar un nombre valido");
            }else if(!user.validatePhoneNumber(phoneNumber)){
                JOptionPane.showMessageDialog(this, "Favor de ingresar un número de telefono valido");
            }else if(!user.validateEmail(mailProfessor)){
                JOptionPane.showMessageDialog(this, "Ingrese un email valido");
            }else if(!professor.validateCubicleNumber(cubicle)){
                JOptionPane.showMessageDialog(this, "Ingrese un NÚMERO de cubiculo valido, 2 números como máximo");
            }else if(!user.validatePassword(passwordProfessor)){
                JOptionPane.showMessageDialog(this, "Ingrese una contraseña valida");
            }else if(!professor.validateStaffNumber(personalNumber)){
                JOptionPane.showMessageDialog(this, "Ingrese un número de personal valido");
            }
        }
    }
    
    void savePerson(String nameProfessor, String phoneNumber, String mailProfessor){
        PersonDAO Person = new PersonDAO();
        try {
            Person.savePerson(nameProfessor, phoneNumber, mailProfessor);
        } catch (SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, "No hay conexión con la base de datos. Reintente más tarde.");
            Logger.getLogger(RegisterProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    void getIdPersonSaved(String nameProfessor){
        String idPerson = "";
        PersonDAO getId = new PersonDAO();
        try {
           Person person = getId.searchPersonByKeyword(nameProfessor);
           idPerson = person.getId_person();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener la información necesaria. Reintente más tarde.");
            Logger.getLogger(RegisterProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        saveProfessor(idPerson, nameProfessor, cubicle, personalNumber,
                mailProfessor, passwordProfessor, chooseShift, status);
    }
    
    void saveProfessor(String idPerson, String nameProfessor, String cubicle, String personalNumber, 
            String mailProfessor, String passwordProfessor, String chooseShift, String status){
                    ProfessorDAO professor = new ProfessorDAO();
                    try {
                        professor.saveProfessor(idPerson, nameProfessor, cubicle, personalNumber,
                                mailProfessor, passwordProfessor, chooseShift, status);
                                JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO");
                                returnHomeAdministrator();
                    } catch (SQLException | ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, "No hay conexión con la base de datos. Reintente más tarde.");
                        Logger.getLogger(RegisterProfessor.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
    
    void returnHomeAdministrator(){
         PrincipalWindowAdministrator returnToWindowAdministrator = new PrincipalWindowAdministrator();
         returnToWindowAdministrator.setVisible(true);
         dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupChoiceOfShifts = new javax.swing.ButtonGroup();
        jLabelTitle = new javax.swing.JLabel();
        jLabelProfessorIcon = new javax.swing.JLabel();
        jLabelNameProfessor = new javax.swing.JLabel();
        jLabelPersonalNumber = new javax.swing.JLabel();
        jLabelTurnProfessor = new javax.swing.JLabel();
        jLabelCorreoProfessor = new javax.swing.JLabel();
        jLabelPasswordProfessor = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jTextFieldNameProfessor = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jTextFieldPersonalNumber = new javax.swing.JTextField();
        jTextFieldMailProfessor = new javax.swing.JTextField();
        jTextFieldPasswordProfessor = new javax.swing.JTextField();
        jRadioButtonMorningShift = new javax.swing.JRadioButton();
        jRadioButtonEveningShift = new javax.swing.JRadioButton();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jLabelCubicle = new javax.swing.JLabel();
        jTextFieldCubicle = new javax.swing.JTextField();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Registrar Profesor");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabelProfessorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/profe.png"))); // NOI18N
        getContentPane().add(jLabelProfessorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabelNameProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNameProfessor.setText("Nombre : ");
        getContentPane().add(jLabelNameProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabelPersonalNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPersonalNumber.setText("Número de personal :");
        getContentPane().add(jLabelPersonalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabelTurnProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTurnProfessor.setText("Turno :");
        getContentPane().add(jLabelTurnProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabelCorreoProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCorreoProfessor.setText("Correo :");
        getContentPane().add(jLabelCorreoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabelPasswordProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPasswordProfessor.setText("Asigne una contraseña :");
        getContentPane().add(jLabelPasswordProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 409, 100, 40));

        jTextFieldNameProfessor.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldNameProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 240, 30));

        jButtonRegister.setBackground(new java.awt.Color(204, 255, 255));
        jButtonRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 409, 100, 40));

        jTextFieldPersonalNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPersonalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 240, 30));

        jTextFieldMailProfessor.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldMailProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 240, 30));

        jTextFieldPasswordProfessor.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPasswordProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 240, 30));

        jRadioButtonMorningShift.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupChoiceOfShifts.add(jRadioButtonMorningShift);
        jRadioButtonMorningShift.setText("Matutino");
        getContentPane().add(jRadioButtonMorningShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jRadioButtonEveningShift.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupChoiceOfShifts.add(jRadioButtonEveningShift);
        jRadioButtonEveningShift.setText("Vespertino");
        getContentPane().add(jRadioButtonEveningShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        jLabelPhoneNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPhoneNumber.setText("Número de telefono :");
        getContentPane().add(jLabelPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jTextFieldPhoneNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 240, 30));

        jLabelCubicle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCubicle.setText("Cubículo :");
        getContentPane().add(jLabelCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jTextFieldCubicle.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 240, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 731, 457));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        String [] cancelButtons = {"Si", "No"}; 
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", "Cancelar Registro de Profesor", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons[0]);
        
        if (optionSelected == JOptionPane.YES_NO_CANCEL_OPTION) {
           returnHomeAdministrator();   
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        verificarCampos();
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupChoiceOfShifts;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelCorreoProfessor;
    private javax.swing.JLabel jLabelCubicle;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelNameProfessor;
    private javax.swing.JLabel jLabelPasswordProfessor;
    private javax.swing.JLabel jLabelPersonalNumber;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelProfessorIcon;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTurnProfessor;
    private javax.swing.JRadioButton jRadioButtonEveningShift;
    private javax.swing.JRadioButton jRadioButtonMorningShift;
    private javax.swing.JTextField jTextFieldCubicle;
    private javax.swing.JTextField jTextFieldMailProfessor;
    private javax.swing.JTextField jTextFieldNameProfessor;
    private javax.swing.JTextField jTextFieldPasswordProfessor;
    private javax.swing.JTextField jTextFieldPersonalNumber;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
