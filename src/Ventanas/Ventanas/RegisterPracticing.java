package Ventanas.Ventanas;

import javax.swing.JOptionPane;

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

        jLabelPracticingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Practicings.png"))); // NOI18N
        getContentPane().add(jLabelPracticingIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabelNamePracticing.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNamePracticing.setText("Nombre :");
        getContentPane().add(jLabelNamePracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabelEnrollmentPracticing.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelEnrollmentPracticing.setText("Matricula :");
        getContentPane().add(jLabelEnrollmentPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabelSex.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSex.setText("Sexo :");
        getContentPane().add(jLabelSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabelProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelProfessor.setText("Profesor :");
        getContentPane().add(jLabelProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jLabelLanguageIndigenous.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelLanguageIndigenous.setText("¿Habla alguna lengua indigena?");
        getContentPane().add(jLabelLanguageIndigenous, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jTextFieldNamePracticing.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldNamePracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 230, 30));

        jTextFieldEnrollmentPracticing.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldEnrollmentPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 230, 30));

        jTextFieldProfessor.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 230, 30));

        jTextFieldLanguageIndigenous.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldLanguageIndigenous, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 230, 30));

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
        getContentPane().add(jRadioButtonWomanSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jRadioButtonManSex.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupChoiceOfSex.add(jRadioButtonManSex);
        jRadioButtonManSex.setText("Masculino");
        getContentPane().add(jRadioButtonManSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 729, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        if (jTextFieldNamePracticing.getText().isEmpty() || jTextFieldEnrollmentPracticing.getText().isEmpty() 
                    || jTextFieldProfessor.getText().isEmpty() || jTextFieldLanguageIndigenous.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
        }else if (jRadioButtonManSex.isSelected()== false 
                        && jRadioButtonWomanSex.isSelected() == false ){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
        }else{
            String namePracticing = jTextFieldNamePracticing.getText();
            String enrollmentParcticing = jTextFieldEnrollmentPracticing.getText();
            String nameProfessor = jTextFieldProfessor.getText();
            String languageIndigenous = jTextFieldLanguageIndigenous.getText();
            String choiceOfSex = null;
            
            if (jRadioButtonManSex.isSelected() == true){
                choiceOfSex = jRadioButtonManSex.getText();
            }else{
                choiceOfSex = jRadioButtonWomanSex.getText();
            }
            
            JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO");
            dispose();
        }
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
    private javax.swing.JLabel jLabelEnrollmentPracticing;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelLanguageIndigenous;
    private javax.swing.JLabel jLabelNamePracticing;
    private javax.swing.JLabel jLabelPracticingIcon;
    private javax.swing.JLabel jLabelProfessor;
    private javax.swing.JLabel jLabelSex;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JRadioButton jRadioButtonManSex;
    private javax.swing.JRadioButton jRadioButtonWomanSex;
    private javax.swing.JTextField jTextFieldEnrollmentPracticing;
    private javax.swing.JTextField jTextFieldLanguageIndigenous;
    private javax.swing.JTextField jTextFieldNamePracticing;
    private javax.swing.JTextField jTextFieldProfessor;
    // End of variables declaration//GEN-END:variables
}
