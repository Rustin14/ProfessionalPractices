/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Windows;

import Domain.Activity;
import Domain.Practicing;
import Domain.Project;
import dataAccess.PracticingDAO;
import dataAccess.ProjectDAO;
import dataAccess.generatePDF;
import java.awt.Component;
import java.awt.Container;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


/**
 *
 * @author gabrielflores
 */
public class GeneratePartialReportWindow extends javax.swing.JFrame {

    
    public GeneratePartialReportWindow() {
        initComponents();
    }
    
    boolean checkForEmptyJText(Container container) {
        boolean empty = false;
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                if (((JTextField)component).getText().isEmpty()) {
                    empty = true;
                }
            }
        }
        return empty;
    }
    
    JPanel fillContainer() {
        JPanel container = new JPanel();
        container.add(jTextNameActivity);
        container.add(jTextActivityDescription);
        container.add(jTextPlannedTime);
        container.add(jTextInvestedTime);
        container.add(jTextTimeInWeeks);
        container.add(jTextPracticingEnrollment);
        return container;
    }
    
    void generatePartialReport() {
        if (checkForEmptyJText(fillContainer())) {
            JOptionPane.showMessageDialog(this, "No deje campos vacíos.");
        }
        Activity activity = new Activity();
        activity.setActivityName(jTextNameActivity.getText());
        activity.setDescription(jTextActivityDescription.getText());
        activity.setTimePlanned(jTextPlannedTime.getText());
        activity.setTimeInvested(jTextInvestedTime.getText());
        activity.setTimeInWeeks(jTextTimeInWeeks.getText());
         
        PracticingDAO practicingDAO = new PracticingDAO();
        Practicing practicing = null;
        try {
            practicing = practicingDAO.searchPracticingByEnrollment(jTextPracticingEnrollment.getText());
        } catch (SQLException | ClassNotFoundException exception) {
            JOptionPane.showMessageDialog(this, "No es posible acceder a la base de datos en este momento. Inténtelo más tarde.");
            Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(Level.SEVERE, null, exception);
        }
        
        ProjectDAO projectDAO = new ProjectDAO();
        Project project = null;
        int id_project = practicing.getId_project();
        try {
            project = projectDAO.searchProjectByIDProject(4);
        } catch (SQLException | ClassNotFoundException exception) {
            JOptionPane.showMessageDialog(this, "No es posible acceder a la base de datos en este momento. Inténtelo más tarde.");
            Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(Level.SEVERE, null, exception);
        }
        
        List<Activity> listItems = new ArrayList<>();
        listItems.add(activity);
        
        String outputFile = "/Users/gabrielflores/JaspersoftWorkspace/ReporteParcial/" + "PruebaReporteParcial.pdf";
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItems);
       
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("CollectionDataSet", itemsJRBean);
        parameters.put("practicingName", practicing.getPracticingName());
        parameters.put("projectName", project.getProjectName());
        
        generatePDF generatePDF = new generatePDF();
        InputStream templateFile = null;
        
        try {
            templateFile = generatePDF.readTemplateFile();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No es posible acceder al archivo base del reporte. Inténtelo más tarde.");
            Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        try {
            generatePDF.generateReport(parameters, templateFile);
        } catch (JRException reportCreatingException) {
           JOptionPane.showMessageDialog(this, "No es posible finalizar con su reporte en este momento, inténtelo más tarde.");
           Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(Level.SEVERE, null, reportCreatingException);
        }
        
        try {
            generatePDF.showResultingPDF();
        } catch (IOException readPDFException) {
            JOptionPane.showMessageDialog(this, "No es posible mostrar su archivo en este momento.");
            Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(Level.SEVERE, null, readPDFException);
        }
        JOptionPane.showMessageDialog(this, "Su reporte fue creado de manera correcta.");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNameActivity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextActivityDescription = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTextPlannedTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextInvestedTime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextTimeInWeeks = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonFinalize = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextPracticingEnrollment = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel1.setText("Información de actividad");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Sistema de Prácticas Profesionales");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel3.setText("Generar Reporte Parcial");

        jTextNameActivity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextNameActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActivityActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Nombre de actividad");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("Descripción de la actividad");

        jTextActivityDescription.setColumns(20);
        jTextActivityDescription.setRows(5);
        jScrollPane1.setViewportView(jTextActivityDescription);

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("Tiempo planteado");

        jTextPlannedTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPlannedTimeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("Tiempo real implementado");

        jTextInvestedTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInvestedTimeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("Semanas de la actividad");

        jTextTimeInWeeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTimeInWeeksActionPerformed(evt);
            }
        });

        jLabel9.setText("*La información necesaria para concluir tu reporte será extraída de la base de datos.");

        jButtonFinalize.setText("FInalizar");
        jButtonFinalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizeActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Matrícula de Practicante");

        jTextPracticingEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPracticingEnrollmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70)))
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextTimeInWeeks, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNameActivity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPlannedTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextInvestedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextPracticingEnrollment, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButtonFinalize)
                        .addGap(58, 58, 58)
                        .addComponent(jButtonCancel)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNameActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPracticingEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPlannedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextInvestedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextTimeInWeeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFinalize)
                    .addComponent(jButtonCancel))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTimeInWeeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTimeInWeeksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTimeInWeeksActionPerformed

    private void jButtonFinalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizeActionPerformed
        generatePartialReport();
    }//GEN-LAST:event_jButtonFinalizeActionPerformed

    private void jTextInvestedTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInvestedTimeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextInvestedTimeActionPerformed

    private void jTextNameActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActivityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActivityActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextPlannedTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPlannedTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPlannedTimeActionPerformed

    private void jTextPracticingEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPracticingEnrollmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPracticingEnrollmentActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratePartialReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneratePartialReportWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonFinalize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextActivityDescription;
    private javax.swing.JTextField jTextInvestedTime;
    private javax.swing.JTextField jTextNameActivity;
    private javax.swing.JTextField jTextPlannedTime;
    private javax.swing.JTextField jTextPracticingEnrollment;
    private javax.swing.JTextField jTextTimeInWeeks;
    // End of variables declaration//GEN-END:variables
}
