package Ventanas.Ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author BRANDON
 */
public class RegisterProfessor extends javax.swing.JFrame {

    public RegisterProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Profesor");
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
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Registrar Profesor");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabelProfessorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/profe.png"))); // NOI18N
        getContentPane().add(jLabelProfessorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabelNameProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNameProfessor.setText("Nombre : ");
        getContentPane().add(jLabelNameProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabelPersonalNumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPersonalNumber.setText("Número de personal :");
        getContentPane().add(jLabelPersonalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabelTurnProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTurnProfessor.setText("Turno :");
        getContentPane().add(jLabelTurnProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabelCorreoProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCorreoProfessor.setText("Correo :");
        getContentPane().add(jLabelCorreoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabelPasswordProfessor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPasswordProfessor.setText("Asigne una contraseña :");
        getContentPane().add(jLabelPasswordProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        jTextFieldNameProfessor.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldNameProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 240, 30));

        jButtonRegister.setBackground(new java.awt.Color(204, 255, 255));
        jButtonRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jTextFieldPersonalNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPersonalNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 240, 30));

        jTextFieldMailProfessor.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldMailProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 240, 30));

        jTextFieldPasswordProfessor.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldPasswordProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 240, 30));

        jRadioButtonMorningShift.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupChoiceOfShifts.add(jRadioButtonMorningShift);
        jRadioButtonMorningShift.setText("Matutino");
        getContentPane().add(jRadioButtonMorningShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jRadioButtonEveningShift.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroupChoiceOfShifts.add(jRadioButtonEveningShift);
        jRadioButtonEveningShift.setText("Vespertino");
        getContentPane().add(jRadioButtonEveningShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 731, 457));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        PrincipalWindowAdministrator returnToWindowAdministrator = new PrincipalWindowAdministrator();
        returnToWindowAdministrator.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        if (jTextFieldNameProfessor.getText().isEmpty() || jTextFieldPersonalNumber.getText().isEmpty()
                    || jTextFieldMailProfessor.getText().isEmpty() || jTextFieldPasswordProfessor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
        }else if (jRadioButtonMorningShift.isSelected() == false && jRadioButtonEveningShift.isSelected() == false){
            JOptionPane.showMessageDialog(this, "Favor de NO dejar campos vacios");
        }else{
            String nameProfessor = jTextFieldNameProfessor.getText();
            String personalNumber = jTextFieldPersonalNumber.getText();
            String mailProfessor = jTextFieldMailProfessor.getText();
            String passwordProfessor = jTextFieldPasswordProfessor.getText();
            String choiceOfTurn = null;
            
            if (jRadioButtonMorningShift.isSelected() == true){
                choiceOfTurn = jRadioButtonMorningShift.getText();
            }else {
                choiceOfTurn = jRadioButtonEveningShift.getText();
            }
            
            JOptionPane.showMessageDialog(this, "REGISTRO EXITOSO");
            dispose();
        }
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
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelNameProfessor;
    private javax.swing.JLabel jLabelPasswordProfessor;
    private javax.swing.JLabel jLabelPersonalNumber;
    private javax.swing.JLabel jLabelProfessorIcon;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTurnProfessor;
    private javax.swing.JRadioButton jRadioButtonEveningShift;
    private javax.swing.JRadioButton jRadioButtonMorningShift;
    private javax.swing.JTextField jTextFieldMailProfessor;
    private javax.swing.JTextField jTextFieldNameProfessor;
    private javax.swing.JTextField jTextFieldPasswordProfessor;
    private javax.swing.JTextField jTextFieldPersonalNumber;
    // End of variables declaration//GEN-END:variables
}
