package GUI.Windows;

/**
 *
 * @author BRANDON
 */
public class PrincipalWindowCoordinator extends javax.swing.JFrame {

    public PrincipalWindowCoordinator() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Coordinador");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelProyectSectionTitle = new javax.swing.JLabel();
        jLabelPracticingSectionTitle = new javax.swing.JLabel();
        jButtonOptionRegisterProject = new javax.swing.JButton();
        jButtonOptionAssignProject = new javax.swing.JButton();
        jButtonOptionUpdateProject = new javax.swing.JButton();
        jButtonOptionDeleteProject = new javax.swing.JButton();
        jButtonOptionRegisterPracticing = new javax.swing.JButton();
        jButtonOptionDeletePracticing = new javax.swing.JButton();
        jButtonOptionReportIndicators = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jLabelRegisterProyectIcon = new javax.swing.JLabel();
        jLabelAssignProyectIcon = new javax.swing.JLabel();
        jLabelUpdateProyectIcon = new javax.swing.JLabel();
        jLabelDeletePRoyectIcon = new javax.swing.JLabel();
        jLabelRegisterPracticingIcon = new javax.swing.JLabel();
        jLabelDeleteIconPRacticing = new javax.swing.JLabel();
        jLabelGeneratrReportIcon = new javax.swing.JLabel();
        jButtonCheckMailbox = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Coordinador");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabelProyectSectionTitle.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelProyectSectionTitle.setText("Sección de Proyectos");
        getContentPane().add(jLabelProyectSectionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabelPracticingSectionTitle.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelPracticingSectionTitle.setText("Sección de Prácticantes");
        getContentPane().add(jLabelPracticingSectionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        jButtonOptionRegisterProject.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionRegisterProject.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionRegisterProject.setText("Registrar Proyecto");
        jButtonOptionRegisterProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionRegisterProjectActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionRegisterProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 210, 50));

        jButtonOptionAssignProject.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionAssignProject.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionAssignProject.setText("Asignar Proyecto");
        jButtonOptionAssignProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionAssignProjectActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionAssignProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, 50));

        jButtonOptionUpdateProject.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionUpdateProject.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionUpdateProject.setText("Actualizar Proyecto");
        jButtonOptionUpdateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionUpdateProjectActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 210, 50));

        jButtonOptionDeleteProject.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionDeleteProject.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionDeleteProject.setText("Eliminar Proyecto");
        jButtonOptionDeleteProject.setToolTipText("");
        jButtonOptionDeleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionDeleteProjectActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionDeleteProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 210, 50));

        jButtonOptionRegisterPracticing.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionRegisterPracticing.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionRegisterPracticing.setText("Registrar Practicante");
        jButtonOptionRegisterPracticing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionRegisterPracticingActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionRegisterPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 220, 50));

        jButtonOptionDeletePracticing.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionDeletePracticing.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionDeletePracticing.setText("Eliminar Practicante");
        jButtonOptionDeletePracticing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionDeletePracticingActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionDeletePracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 220, 50));

        jButtonOptionReportIndicators.setBackground(new java.awt.Color(51, 255, 204));
        jButtonOptionReportIndicators.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonOptionReportIndicators.setText("Generar Indicadores");
        jButtonOptionReportIndicators.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionReportIndicatorsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOptionReportIndicators, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 220, 50));

        jButtonLogout.setBackground(new java.awt.Color(204, 255, 255));
        jButtonLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonLogout.setText("Cerrar sesión");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        jLabelRegisterProyectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/RegisterProyectIcon.png"))); // NOI18N
        getContentPane().add(jLabelRegisterProyectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabelAssignProyectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/assignIcon.png"))); // NOI18N
        getContentPane().add(jLabelAssignProyectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabelUpdateProyectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/updateIcon.png"))); // NOI18N
        getContentPane().add(jLabelUpdateProyectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabelDeletePRoyectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/DeleteIcon.png"))); // NOI18N
        getContentPane().add(jLabelDeletePRoyectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabelRegisterPracticingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/RegisterPracticingIcon.png"))); // NOI18N
        getContentPane().add(jLabelRegisterPracticingIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabelDeleteIconPRacticing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/DeletePRacticingIcon.png"))); // NOI18N
        getContentPane().add(jLabelDeleteIconPRacticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabelGeneratrReportIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/GEnerateReportIcon.png"))); // NOI18N
        getContentPane().add(jLabelGeneratrReportIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        jButtonCheckMailbox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCheckMailbox.setText("Consultar Buzón");
        jButtonCheckMailbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckMailboxActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCheckMailbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 723, 448));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOptionReportIndicatorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionReportIndicatorsActionPerformed
        GenerateIndicator goToGenerateIndicator = new GenerateIndicator();
        goToGenerateIndicator.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonOptionReportIndicatorsActionPerformed

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        Login returnToLogin = new Login();
        returnToLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonOptionRegisterPracticingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionRegisterPracticingActionPerformed
        RegisterPracticing goToRegisterPracticing = new RegisterPracticing();
        goToRegisterPracticing.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonOptionRegisterPracticingActionPerformed

    private void jButtonOptionRegisterProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionRegisterProjectActionPerformed
        RegisterProject goToRegisterProject = new RegisterProject(); 
        goToRegisterProject.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonOptionRegisterProjectActionPerformed

    private void jButtonOptionAssignProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionAssignProjectActionPerformed
        AssignProjectSelectPracticing goToAssignProjectSelectPracticing = new AssignProjectSelectPracticing();
        goToAssignProjectSelectPracticing.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonOptionAssignProjectActionPerformed

    private void jButtonOptionDeleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionDeleteProjectActionPerformed
        DeleteProject goToDeleteProject = new DeleteProject();
        goToDeleteProject.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonOptionDeleteProjectActionPerformed

    private void jButtonOptionDeletePracticingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionDeletePracticingActionPerformed
        DeletePracticing goToDeletePracticing = new DeletePracticing(); 
        goToDeletePracticing.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonOptionDeletePracticingActionPerformed

    private void jButtonOptionUpdateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionUpdateProjectActionPerformed
        UpdateProject goToUpdateProject = new UpdateProject();
        goToUpdateProject.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonOptionUpdateProjectActionPerformed

    private void jButtonCheckMailboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckMailboxActionPerformed
        CheckMailbox goToCheckMailbox = new CheckMailbox(); 
        goToCheckMailbox.setVisible(true);
    }//GEN-LAST:event_jButtonCheckMailboxActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PrincipalWindowCoordinator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindowCoordinator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindowCoordinator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindowCoordinator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalWindowCoordinator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheckMailbox;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonOptionAssignProject;
    private javax.swing.JButton jButtonOptionDeletePracticing;
    private javax.swing.JButton jButtonOptionDeleteProject;
    private javax.swing.JButton jButtonOptionRegisterPracticing;
    private javax.swing.JButton jButtonOptionRegisterProject;
    private javax.swing.JButton jButtonOptionReportIndicators;
    private javax.swing.JButton jButtonOptionUpdateProject;
    private javax.swing.JLabel jLabelAssignProyectIcon;
    private javax.swing.JLabel jLabelDeleteIconPRacticing;
    private javax.swing.JLabel jLabelDeletePRoyectIcon;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelGeneratrReportIcon;
    private javax.swing.JLabel jLabelPracticingSectionTitle;
    private javax.swing.JLabel jLabelProyectSectionTitle;
    private javax.swing.JLabel jLabelRegisterPracticingIcon;
    private javax.swing.JLabel jLabelRegisterProyectIcon;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUpdateProyectIcon;
    // End of variables declaration//GEN-END:variables
}
