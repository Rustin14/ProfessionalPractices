package GUI.Windows;

import javax.swing.JOptionPane;
import BusinessLogic.PersonDataValidations;
import BusinessLogic.PracticingValidations;
/**
 *
 * @author BRANDON
 */
public class RegisterPracticing extends javax.swing.JFrame {

    public RegisterPracticing() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Practicante");
    }

void verificarCampos(){
    PersonDataValidations user = new PersonDataValidations();
    PracticingValidations practicing = new PracticingValidations();
    if (jTextFieldNamePracticing.getText().isEmpty() || jTextFieldEnrollmentPracticing.getText().isEmpty() 
        || jTextFieldProfessor.getText().isEmpty() || jTextFieldLanguageIndigenous.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
    }else if (jRadioButtonManSex.isSelected()== false 
        && jRadioButtonWomanSex.isSelected() == false ){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
    }else{
        String namePracticing = jTextFieldNamePracticing.getText();
        String enrollmentPracticing = jTextFieldEnrollmentPracticing.getText();
        String nameProfessor = jTextFieldProfessor.getText();
        String mailPracticing = jTextFieldMailPracticing.getText();
        String passwordPracticing = jTextFieldPasswordPracticing.getText();
        String languageIndigenous = jTextFieldLanguageIndigenous.getText();
        String choiceOfSex = null;
        
        if (jRadioButtonManSex.isSelected() == true){
            choiceOfSex = jRadioButtonManSex.getText();
        }else{
            choiceOfSex = jRadioButtonWomanSex.getText();
        }
           
        if((user.validateName(namePracticing) == true) && (practicing.validateEnrollment(enrollmentPracticing) == true)
            && (user.validateName(nameProfessor) == true) && (user.validateEmail(mailPracticing) == true) 
                && (user.validatePassword(passwordPracticing)) == true){
                    JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO");
                    PrincipalWindowCoordinator returnToPrincipalWindowCoordinator = new PrincipalWindowCoordinator(); 
                    returnToPrincipalWindowCoordinator.setVisible(true);
                    dispose(); 
        }else if((user.validateName(namePracticing) == false) || (user.validateName(nameProfessor) == false)){
                JOptionPane.showMessageDialog(this, "Revise el apartado Nombre o Profesor,"
                    + " los nombres deben estar correctamente escritos y solo se puede ingresar texto");
        }else if(practicing.validateEnrollment(enrollmentPracticing) == false){
                JOptionPane.showMessageDialog(this, "Ingrese una matricula valida");
        }else if(user.validateEmail(mailPracticing) == false){
                JOptionPane.showMessageDialog(this, "Ingrese un Email valido");
        }else if(user.validatePassword(passwordPracticing) == false){
                JOptionPane.showMessageDialog(this, "Ingrese una contraseña que contenga números y letras");
        }
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupChoiceOfSex = new javax.swing.ButtonGroup();
        jButtonCancel = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelPracticingIcon = new javax.swing.JLabel();
        jLabelNamePracticing = new javax.swing.JLabel();
        jLabelEnrollmentPracticing = new javax.swing.JLabel();
        jLabelSex = new javax.swing.JLabel();
        jLabelProfessor = new javax.swing.JLabel();
        jLabelLanguageIndigenous = new javax.swing.JLabel();
        jTextFieldNamePracticing = new javax.swing.JTextField();
        jTextFieldEnrollmentPracticing = new javax.swing.JTextField();
        jTextFieldProfessor = new javax.swing.JTextField();
        jTextFieldLanguageIndigenous = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jRadioButtonWomanSex = new javax.swing.JRadioButton();
        jRadioButtonManSex = new javax.swing.JRadioButton();
        jLabelMailPracticing = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPasswordPracticing = new javax.swing.JTextField();
        jTextFieldMailPracticing = new javax.swing.JTextField();
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
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 100, 30));

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Registrar Practicante");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabelPracticingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Practicings.png"))); // NOI18N
        getContentPane().add(jLabelPracticingIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabelNamePracticing.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNamePracticing.setText("Nombre :");
        getContentPane().add(jLabelNamePracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabelEnrollmentPracticing.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelEnrollmentPracticing.setText("Matricula :");
        getContentPane().add(jLabelEnrollmentPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 100, -1));

        jLabelSex.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSex.setText("Sexo :");
        getContentPane().add(jLabelSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabelProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelProfessor.setText("Profesor :");
        getContentPane().add(jLabelProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabelLanguageIndigenous.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelLanguageIndigenous.setText("¿Habla alguna lengua indigena?");
        getContentPane().add(jLabelLanguageIndigenous, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        jTextFieldNamePracticing.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldNamePracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 230, 30));

        jTextFieldEnrollmentPracticing.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldEnrollmentPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 230, 30));

        jTextFieldProfessor.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 230, 30));

        jTextFieldLanguageIndigenous.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldLanguageIndigenous, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 230, 30));

        jButtonRegister.setBackground(new java.awt.Color(204, 255, 255));
        jButtonRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, 30));

        jRadioButtonWomanSex.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupChoiceOfSex.add(jRadioButtonWomanSex);
        jRadioButtonWomanSex.setText("Femenino");
        getContentPane().add(jRadioButtonWomanSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jRadioButtonManSex.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupChoiceOfSex.add(jRadioButtonManSex);
        jRadioButtonManSex.setText("Masculino");
        getContentPane().add(jRadioButtonManSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        jLabelMailPracticing.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMailPracticing.setText("Correo :");
        getContentPane().add(jLabelMailPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Asigne una contraseña :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jTextFieldPasswordPracticing.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPasswordPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 230, 30));

        jTextFieldMailPracticing.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldMailPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 230, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 729, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", "Cancelar Registro de Practicante", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons[0]);
        
        if (optionSelected == 0) {
            PrincipalWindowCoordinator returnToWindowCoordinator = new PrincipalWindowCoordinator();
            returnToWindowCoordinator.setVisible(true);
            dispose(); 
        } 
      
    }//GEN-LAST:event_jButtonCancelActionPerformed


    
    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        verificarCampos();
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPracticing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupChoiceOfSex;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEnrollmentPracticing;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelLanguageIndigenous;
    private javax.swing.JLabel jLabelMailPracticing;
    private javax.swing.JLabel jLabelNamePracticing;
    private javax.swing.JLabel jLabelPracticingIcon;
    private javax.swing.JLabel jLabelProfessor;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JRadioButton jRadioButtonManSex;
    private javax.swing.JRadioButton jRadioButtonWomanSex;
    private javax.swing.JTextField jTextFieldEnrollmentPracticing;
    private javax.swing.JTextField jTextFieldLanguageIndigenous;
    private javax.swing.JTextField jTextFieldMailPracticing;
    private javax.swing.JTextField jTextFieldNamePracticing;
    private javax.swing.JTextField jTextFieldPasswordPracticing;
    private javax.swing.JTextField jTextFieldProfessor;
    // End of variables declaration//GEN-END:variables
}
