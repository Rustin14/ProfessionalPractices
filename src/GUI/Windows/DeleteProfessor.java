/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: DeleteProfesor
Date of creation: June 15th. 2020 
*/    
package GUI.Windows;

import Domain.Professor;
import dataAccess.ProfessorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DeleteProfessor extends javax.swing.JFrame{

    public DeleteProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Eliminar Profesor");
        getProfessors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelSelectProfesor = new javax.swing.JLabel();
        jButtonDeletePofessor = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelInformationProfessor = new javax.swing.JLabel();
        jLabelNameProfessor = new javax.swing.JLabel();
        jLabelCubicle = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelStaffNumber = new javax.swing.JLabel();
        jLabelIDNumber = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldCubicle = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldStaffNumber = new javax.swing.JTextField();
        jTextFieldIDNumber = new javax.swing.JTextField();
        jComboBoxSelectProfessor = new javax.swing.JComboBox<>();
        jLabelShift = new javax.swing.JLabel();
        jTextFieldShift = new javax.swing.JTextField();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Profesor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabelSelectProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSelectProfesor.setText("Seleccione al Profesor :");
        getContentPane().add(jLabelSelectProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButtonDeletePofessor.setBackground(new java.awt.Color(204, 255, 255));
        jButtonDeletePofessor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonDeletePofessor.setText("Eliminar");
        jButtonDeletePofessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletePofessorActionPerformed(evt);
            }
        });
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

        jLabelInformationProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelInformationProfessor.setText("Profesor seleccionado");
        getContentPane().add(jLabelInformationProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabelNameProfessor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNameProfessor.setText("Nombre :");
        getContentPane().add(jLabelNameProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, 20));

        jLabelCubicle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCubicle.setText("Cubiculo :");
        getContentPane().add(jLabelCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 100, 20));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelEmail.setText("Correo :");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 80, 20));

        jLabelStaffNumber.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelStaffNumber.setText("No. de personal :");
        getContentPane().add(jLabelStaffNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabelIDNumber.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelIDNumber.setText("No. de identificacion :");
        getContentPane().add(jLabelIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jTextFieldName.setEditable(false);
        jTextFieldName.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 340, 30));

        jTextFieldCubicle.setEditable(false);
        jTextFieldCubicle.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 340, 30));

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 340, 30));

        jTextFieldStaffNumber.setEditable(false);
        jTextFieldStaffNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldStaffNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 340, 30));

        jTextFieldIDNumber.setEditable(false);
        jTextFieldIDNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 340, 30));

        jComboBoxSelectProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un profesor...." }));
        jComboBoxSelectProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxSelectProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 330, 30));

        jLabelShift.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelShift.setText("Turno :");
        jLabelShift.setToolTipText("");
        getContentPane().add(jLabelShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jTextFieldShift.setEditable(false);
        jTextFieldShift.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 340, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
       cancelOption();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonDeletePofessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletePofessorActionPerformed
        deleteProfessor(idPersonProfessor);
    }//GEN-LAST:event_jButtonDeletePofessorActionPerformed

    String professorSelected = "";
    
    private void jComboBoxSelectProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectProfessorActionPerformed
        if (evt.getSource() == jComboBoxSelectProfessor){
            professorSelected = (String)jComboBoxSelectProfessor.getSelectedItem();
            getProfessor(professorSelected);
        }
    }//GEN-LAST:event_jComboBoxSelectProfessorActionPerformed

    void cancelOption(){
        String [] cancelButtons = {"Sí", "No"};
        int optionSelected = JOptionPane.showOptionDialog
                (this, "¿Seguro desea cancelar?", "Cancelar Eliminar Profesor", 
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
        if (optionSelected == JOptionPane.YES_NO_OPTION) {
            PrincipalWindowAdministrator returnToPrincipalWindowAdministrador = new PrincipalWindowAdministrator(); 
            returnToPrincipalWindowAdministrador.setVisible(true); 
            dispose();  
        }
    }
    
    void getProfessors(){
        String status = "Activo";
        int sizeOfList = 0;
        ProfessorDAO getActiveProfessors = new ProfessorDAO();
        try {
            ArrayList<Professor> ProfessorsList = getActiveProfessors.getProfessors(status);
            while (sizeOfList < ProfessorsList.size()){
               jComboBoxSelectProfessor.addItem(ProfessorsList.get(sizeOfList).getName());
               sizeOfList++;
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener la información deseada, Reintente más tarde");
            Logger.getLogger(DeleteProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    String idPersonProfessor = "";
    
    void getProfessor(String professorSelected){
        ProfessorDAO getProfessorSelected = new ProfessorDAO();
        try {
            Professor professor =getProfessorSelected.getProfessor(professorSelected);
            jTextFieldName.setText(professor.getName());
            jTextFieldCubicle.setText(professor.getCubicle());
            jTextFieldEmail.setText(professor.getEmail());
            jTextFieldShift.setText(professor.getShift());
            jTextFieldStaffNumber.setText(professor.getStaff_number());
            jTextFieldIDNumber.setText(professor.getid_person());
            idPersonProfessor = professor.getid_person();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo obtener la información solicitada, Reintente más tarde");
            Logger.getLogger(DeleteProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void deleteProfessor(String idPersonProfessor){
        ProfessorDAO deleteProfessor = new ProfessorDAO();
        try {
            deleteProfessor.deleteProfessorByIDPerson(idPersonProfessor);
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            returnToWindowAdministrator();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No hay conexión con la base de datos, Reintente más tarde");
            Logger.getLogger(DeleteProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void returnToWindowAdministrator(){
        PrincipalWindowAdministrator returnToWindowAdministrator = new PrincipalWindowAdministrator();
        returnToWindowAdministrator.setVisible(true);
        dispose();
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
    private javax.swing.JLabel jLabelShift;
    private javax.swing.JLabel jLabelStaffNumber;
    private javax.swing.JTextField jTextFieldCubicle;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIDNumber;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldShift;
    private javax.swing.JTextField jTextFieldStaffNumber;
    // End of variables declaration//GEN-END:variables
}
