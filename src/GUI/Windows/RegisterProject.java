/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: RegisterProject
Date of creation: May 19th. 2020 
*/  

package GUI.Windows;

import BusinessLogic.CoordinatorValidations;
import javax.swing.JOptionPane;

public class RegisterProject extends javax.swing.JFrame {

    public RegisterProject() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Proyecto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRegisterProject = new javax.swing.JLabel();
        jLabelRegisterProjectIcon = new javax.swing.JLabel();
        jTextFieldCompanyName = new javax.swing.JTextField();
        jLabelCompanyName = new javax.swing.JLabel();
        jLabelProjectName = new javax.swing.JLabel();
        jTextFieldProjectName = new javax.swing.JTextField();
        jLabelActivities = new javax.swing.JLabel();
        jLabelManagerName = new javax.swing.JLabel();
        jTextFieldManagerName = new javax.swing.JTextField();
        jButtonRegisterProject = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelNumberPhone = new javax.swing.JLabel();
        jTextFieldNumberPhone = new javax.swing.JTextField();
        jLabelQuotaProject = new javax.swing.JLabel();
        jScrollPaneActivities = new javax.swing.JScrollPane();
        jTextPaneActivities = new javax.swing.JTextPane();
        jTextFieldQuotaProject = new javax.swing.JTextField();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegisterProject.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelRegisterProject.setText("Registrar Proyecto");
        getContentPane().add(jLabelRegisterProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabelRegisterProjectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/RegisterProyectIcon.png"))); // NOI18N
        getContentPane().add(jLabelRegisterProjectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 90, 90));
        getContentPane().add(jTextFieldCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, 30));

        jLabelCompanyName.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelCompanyName.setText("Nombre de la Empresa: ");
        getContentPane().add(jLabelCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabelProjectName.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelProjectName.setText("Nombre del Proyecto: ");
        getContentPane().add(jLabelProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        getContentPane().add(jTextFieldProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 30));

        jLabelActivities.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelActivities.setText("Calendarización de Actividades: ");
        getContentPane().add(jLabelActivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 220, 40));

        jLabelManagerName.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelManagerName.setText("<html>Nombre del Encargado <p> del Proyecto: <html>");
        getContentPane().add(jLabelManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 40));
        getContentPane().add(jTextFieldManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 200, 30));

        jButtonRegisterProject.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegisterProject.setText("Registrar Proyecto");
        jButtonRegisterProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterProjectActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegisterProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 140, 40));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 140, 40));

        jLabelNumberPhone.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelNumberPhone.setText("Número Telefónico: ");
        getContentPane().add(jLabelNumberPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        getContentPane().add(jTextFieldNumberPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, 30));

        jLabelQuotaProject.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelQuotaProject.setText("Cupo del Proyecto: ");
        getContentPane().add(jLabelQuotaProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jScrollPaneActivities.setViewportView(jTextPaneActivities);

        getContentPane().add(jScrollPaneActivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 310, 200));
        getContentPane().add(jTextFieldQuotaProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 80, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        jLabelFound.setText(" ");
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 780, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    CoordinatorValidations coordinator = new CoordinatorValidations();
    
    private void jButtonRegisterProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterProjectActionPerformed
        
        if (jTextFieldCompanyName.getText().isEmpty() 
                || jTextFieldNumberPhone.getText().isEmpty()
                    || jTextFieldProjectName.getText().isEmpty() 
                        || jTextFieldManagerName.getText().isEmpty()
                            || jTextFieldQuotaProject.getText().isEmpty() 
                                || jTextPaneActivities.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Favor de NO dejar espacios vacios");
            
        } else {
            
            String companyName = jTextFieldCompanyName.getText();
            String numberPhone = jTextFieldNumberPhone.getText();
            String projectName = jTextFieldProjectName.getText();
            String managerName = jTextFieldManagerName.getText(); 
            String quotaProject = jTextFieldQuotaProject.getText();
            
            if ((coordinator.validateCompanyName(companyName)) 
                    && (coordinator.validatePhoneNumber(numberPhone)) 
                        && (coordinator.validateProjectName(projectName)) 
                            && (coordinator.validateName(managerName)) 
                                && (coordinator.validateQuotaProject(quotaProject))) {
                
                JOptionPane.showMessageDialog(this, "REGISTRO DE PROYECTO EXITOSO");    
                returnHomeCoordinator(); 
                
            } else if (!coordinator.validateCompanyName(companyName)) {
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un nombre de compañia valido");
            } else if (!coordinator.validatePhoneNumber(numberPhone)) {
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un telefono valido");
            } else if (!coordinator.validateProjectName(projectName)) {
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un nombre de proyecto valido");
            } else if (!coordinator.validateName(managerName)) {
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un nombre de encargado del proyecto valido");
            } else if (!coordinator.validateQuotaProject(quotaProject)) {
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un cupo de proyecto valido. Solo numeros");
            }
        } 
    }//GEN-LAST:event_jButtonRegisterProjectActionPerformed

    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", "Cancelar Registro de Proyecto", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons[0]);
        
        if (optionSelected == 0) {
            returnHomeCoordinator();     
        } 
         
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    void returnHomeCoordinator(){
        PrincipalWindowCoordinator returnToPrincipalWindowCoordinator = new PrincipalWindowCoordinator(); 
        returnToPrincipalWindowCoordinator.setVisible(true);
        dispose();
    }
  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonRegisterProject;
    private javax.swing.JLabel jLabelActivities;
    private javax.swing.JLabel jLabelCompanyName;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelManagerName;
    private javax.swing.JLabel jLabelNumberPhone;
    private javax.swing.JLabel jLabelProjectName;
    private javax.swing.JLabel jLabelQuotaProject;
    private javax.swing.JLabel jLabelRegisterProject;
    private javax.swing.JLabel jLabelRegisterProjectIcon;
    private javax.swing.JScrollPane jScrollPaneActivities;
    private javax.swing.JTextField jTextFieldCompanyName;
    private javax.swing.JTextField jTextFieldManagerName;
    private javax.swing.JTextField jTextFieldNumberPhone;
    private javax.swing.JTextField jTextFieldProjectName;
    private javax.swing.JTextField jTextFieldQuotaProject;
    private javax.swing.JTextPane jTextPaneActivities;
    // End of variables declaration//GEN-END:variables
}
