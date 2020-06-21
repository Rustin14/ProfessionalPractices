/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: SectionsToUpdateProject
Date of creation: June 09th. 2020 
*/   

package GUI.Windows;

import BusinessLogic.CoordinatorValidations;
import javax.swing.JOptionPane;

public class SectionsToUpdateProject extends javax.swing.JFrame {

    public SectionsToUpdateProject() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Secciones para Actualizar Proyecto"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelSectionsToUpdateIcon = new javax.swing.JLabel();
        jLabelCompanyName = new javax.swing.JLabel();
        jLabelNumberPhone = new javax.swing.JLabel();
        jLabelProjectName = new javax.swing.JLabel();
        jLabelManagerName = new javax.swing.JLabel();
        jLabelQuotaProject = new javax.swing.JLabel();
        jLabelActivities = new javax.swing.JLabel();
        jTextFieldCompanyName = new javax.swing.JTextField();
        jTextFieldNumberPhone = new javax.swing.JTextField();
        jTextFieldProjectName = new javax.swing.JTextField();
        jTextFieldManagerName = new javax.swing.JTextField();
        jTextFieldQuotaProject = new javax.swing.JTextField();
        jScrollPaneActivities = new javax.swing.JScrollPane();
        jTextPaneActivities = new javax.swing.JTextPane();
        jButtonUpdateProject = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Secciones para actualizar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 320, 50));

        jLabelSectionsToUpdateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/updateIcon.png"))); // NOI18N
        getContentPane().add(jLabelSectionsToUpdateIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabelCompanyName.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelCompanyName.setText("Nombre de la Empresa:");
        getContentPane().add(jLabelCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabelNumberPhone.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelNumberPhone.setText("Número Telefónico:");
        getContentPane().add(jLabelNumberPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabelProjectName.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelProjectName.setText("Nombre del Proyecto:");
        getContentPane().add(jLabelProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabelManagerName.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelManagerName.setText("<html>Nombre del Encargado <p> del Proyecto: <html>");
        getContentPane().add(jLabelManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabelQuotaProject.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelQuotaProject.setText("Cupo del Proyecto:");
        getContentPane().add(jLabelQuotaProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabelActivities.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabelActivities.setText("Calendarización de Actividades:");
        getContentPane().add(jLabelActivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));
        getContentPane().add(jTextFieldCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, 30));
        getContentPane().add(jTextFieldNumberPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 30));
        getContentPane().add(jTextFieldProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 200, 30));
        getContentPane().add(jTextFieldManagerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 200, 30));
        getContentPane().add(jTextFieldQuotaProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 80, 30));

        jScrollPaneActivities.setViewportView(jTextPaneActivities);

        getContentPane().add(jScrollPaneActivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 310, 200));

        jButtonUpdateProject.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonUpdateProject.setText("Actualizar Proyecto");
        jButtonUpdateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateProjectActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 150, 40));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 150, 40));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 755, 446));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String [] cancelButtons = {"Si", "No"};  
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Actualizar Proyecto", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]);  
        
        if (optionSelected == 0) {
            returnHomeCoordinator();  
        }
        
    }//GEN-LAST:event_jButtonCancelActionPerformed

    CoordinatorValidations coordinator = new CoordinatorValidations();
    
    private void jButtonUpdateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateProjectActionPerformed
        
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
                
                JOptionPane.showMessageDialog(this, "Proyecto actualizado exitosamente");    
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
        
    }//GEN-LAST:event_jButtonUpdateProjectActionPerformed
    
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
            java.util.logging.Logger.getLogger(SectionsToUpdateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SectionsToUpdateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SectionsToUpdateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SectionsToUpdateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SectionsToUpdateProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonUpdateProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelActivities;
    private javax.swing.JLabel jLabelCompanyName;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelManagerName;
    private javax.swing.JLabel jLabelNumberPhone;
    private javax.swing.JLabel jLabelProjectName;
    private javax.swing.JLabel jLabelQuotaProject;
    private javax.swing.JLabel jLabelSectionsToUpdateIcon;
    private javax.swing.JScrollPane jScrollPaneActivities;
    private javax.swing.JTextField jTextFieldCompanyName;
    private javax.swing.JTextField jTextFieldManagerName;
    private javax.swing.JTextField jTextFieldNumberPhone;
    private javax.swing.JTextField jTextFieldProjectName;
    private javax.swing.JTextField jTextFieldQuotaProject;
    private javax.swing.JTextPane jTextPaneActivities;
    // End of variables declaration//GEN-END:variables
}
