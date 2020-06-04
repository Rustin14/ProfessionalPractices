package GUI.Windows;

/**
 *
 * @author BRANDON
 */
public class PrincipalWindowProfessor extends javax.swing.JFrame {

    public PrincipalWindowProfessor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jLabelTitleSectionActivities = new javax.swing.JLabel();
        jLabelTitleSectionReportsEvaluations = new javax.swing.JLabel();
        jButtonGenerateActivitie = new javax.swing.JButton();
        jButtonActivitiesDelivered = new javax.swing.JButton();
        jButtonUploadPresentationFormat = new javax.swing.JButton();
        jButtonMontlyReport = new javax.swing.JButton();
        jButtonPartialReport = new javax.swing.JButton();
        jLabelIcongenerateActivitie = new javax.swing.JLabel();
        jLabelActivitiesDeliveredICon = new javax.swing.JLabel();
        jLabelReportMontlyIcon = new javax.swing.JLabel();
        jLabelUploadPresentationFormatIcon = new javax.swing.JLabel();
        jLabelPartialReportIcon = new javax.swing.JLabel();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Profesor");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 20));

        jButtonLogout.setBackground(new java.awt.Color(204, 255, 255));
        jButtonLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonLogout.setText("Cerrar Sesión");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jLabelTitleSectionActivities.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelTitleSectionActivities.setText("Sección Actividades");
        getContentPane().add(jLabelTitleSectionActivities, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabelTitleSectionReportsEvaluations.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelTitleSectionReportsEvaluations.setText("Sección Evaluaciones");
        getContentPane().add(jLabelTitleSectionReportsEvaluations, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jButtonGenerateActivitie.setBackground(new java.awt.Color(51, 255, 204));
        jButtonGenerateActivitie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonGenerateActivitie.setText("Generar Actividad");
        getContentPane().add(jButtonGenerateActivitie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 190, 50));

        jButtonActivitiesDelivered.setBackground(new java.awt.Color(51, 255, 204));
        jButtonActivitiesDelivered.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonActivitiesDelivered.setText("<html><center> Actividades entregadas");
        getContentPane().add(jButtonActivitiesDelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 70));

        jButtonUploadPresentationFormat.setBackground(new java.awt.Color(51, 255, 204));
        jButtonUploadPresentationFormat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonUploadPresentationFormat.setText("<html><center> Subir formato de presentación");
        getContentPane().add(jButtonUploadPresentationFormat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 190, 70));

        jButtonMontlyReport.setBackground(new java.awt.Color(51, 255, 204));
        jButtonMontlyReport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonMontlyReport.setText("Reporte Mensual");
        getContentPane().add(jButtonMontlyReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 190, 50));

        jButtonPartialReport.setBackground(new java.awt.Color(51, 255, 204));
        jButtonPartialReport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonPartialReport.setText("Reporte Parcial");
        getContentPane().add(jButtonPartialReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 190, 50));

        jLabelIcongenerateActivitie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/GEnerateActivitie.png"))); // NOI18N
        getContentPane().add(jLabelIcongenerateActivitie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabelActivitiesDeliveredICon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/ActivitiesDelivered.png"))); // NOI18N
        getContentPane().add(jLabelActivitiesDeliveredICon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabelReportMontlyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/reportMontlyIcon.png"))); // NOI18N
        getContentPane().add(jLabelReportMontlyIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabelUploadPresentationFormatIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/uploadFormatPresentationIcon.png"))); // NOI18N
        getContentPane().add(jLabelUploadPresentationFormatIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabelPartialReportIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/reportParcialIcon.png"))); // NOI18N
        getContentPane().add(jLabelPartialReportIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 724, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        Login returnToLogin = new Login();
        returnToLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalWindowProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActivitiesDelivered;
    private javax.swing.JButton jButtonGenerateActivitie;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonMontlyReport;
    private javax.swing.JButton jButtonPartialReport;
    private javax.swing.JButton jButtonUploadPresentationFormat;
    private javax.swing.JLabel jLabelActivitiesDeliveredICon;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelIcongenerateActivitie;
    private javax.swing.JLabel jLabelPartialReportIcon;
    private javax.swing.JLabel jLabelReportMontlyIcon;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleSectionActivities;
    private javax.swing.JLabel jLabelTitleSectionReportsEvaluations;
    private javax.swing.JLabel jLabelUploadPresentationFormatIcon;
    // End of variables declaration//GEN-END:variables
}
