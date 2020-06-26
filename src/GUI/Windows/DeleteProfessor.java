/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: DeleteProfesor
Date of creation: June 15th. 2020 
*/    
package GUI.Windows;

import javax.swing.JOptionPane;


public class DeleteProfessor extends javax.swing.JFrame {

    public DeleteProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Eliminar Profesor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelSelectProfesor = new javax.swing.JLabel();
        jButtonDeletePofessor = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jComboBoxSelectProfessor = new javax.swing.JComboBox<>();
        jLabelInformationProfessor = new javax.swing.JLabel();
        jLabelNameProfessor = new javax.swing.JLabel();
        jLabelCubicle = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelStaffNumber = new javax.swing.JLabel();
        jLabelIDNumber = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldCubicle = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldSatffNumber = new javax.swing.JTextField();
        jTextFieldIDNumber = new javax.swing.JTextField();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Profesor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabelSelectProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSelectProfesor.setText("Seleccione al Profesor :");
        getContentPane().add(jLabelSelectProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jButtonDeletePofessor.setBackground(new java.awt.Color(204, 255, 255));
        jButtonDeletePofessor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonDeletePofessor.setText("Eliminar");
        getContentPane().add(jButtonDeletePofessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 40));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 100, 40));

        jComboBoxSelectProfessor.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxSelectProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxSelectProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 390, 40));

        jLabelInformationProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelInformationProfessor.setText("Profesor seleccionado :");
        getContentPane().add(jLabelInformationProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabelNameProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNameProfessor.setText("Nombre :");
        getContentPane().add(jLabelNameProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 100, 20));

        jLabelCubicle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCubicle.setText("Cubiculo :");
        getContentPane().add(jLabelCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, 20));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelEmail.setText("Correo :");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 80, 20));

        jLabelStaffNumber.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelStaffNumber.setText("No. de personal :");
        getContentPane().add(jLabelStaffNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabelIDNumber.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelIDNumber.setText("No. de identificacion :");
        getContentPane().add(jLabelIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jTextFieldName.setEditable(false);
        jTextFieldName.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 340, 30));

        jTextFieldCubicle.setEditable(false);
        jTextFieldCubicle.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 340, -1));

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 340, -1));

        jTextFieldSatffNumber.setEditable(false);
        jTextFieldSatffNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldSatffNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 340, -1));

        jTextFieldIDNumber.setEditable(false);
        jTextFieldIDNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 340, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
       cancelOption();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    void cancelOption(){
        String [] cancelButtons = {"Sí", "No"};
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Eliminar Profesor", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
     
        if (optionSelected == JOptionPane.YES_NO_OPTION) {
            PrincipalWindowAdministrator returnToPrincipalWindowAdministrador = new PrincipalWindowAdministrator(); 
            returnToPrincipalWindowAdministrador.setVisible(true); 
            dispose();  
        }
    }
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDeletePofessor;
    private javax.swing.JComboBox<String> jComboBoxSelectProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCubicle;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelIDNumber;
    private javax.swing.JLabel jLabelInformationProfessor;
    private javax.swing.JLabel jLabelNameProfessor;
    private javax.swing.JLabel jLabelSelectProfesor;
    private javax.swing.JLabel jLabelStaffNumber;
    private javax.swing.JTextField jTextFieldCubicle;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIDNumber;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSatffNumber;
    // End of variables declaration//GEN-END:variables
}
