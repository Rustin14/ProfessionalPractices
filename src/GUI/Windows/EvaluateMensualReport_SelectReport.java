
package GUI.Windows;

import javax.swing.JOptionPane;

public class EvaluateMensualReport_SelectReport extends javax.swing.JFrame {
    public EvaluateMensualReport_SelectReport() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Reporte Elegido");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jScrollPanePreviewReport = new javax.swing.JScrollPane();
        jScrollPaneObservations = new javax.swing.JScrollPane();
        jTextAreaObservations = new javax.swing.JTextArea();
        jTextFieldQualification = new javax.swing.JTextField();
        jButtonQualify = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Evaluar Reporte Mensual");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));
        getContentPane().add(jScrollPanePreviewReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 520, 400));

        jTextAreaObservations.setBackground(new java.awt.Color(204, 255, 255));
        jTextAreaObservations.setColumns(20);
        jTextAreaObservations.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaObservations.setRows(5);
        jTextAreaObservations.setText("Agregue una observación....");
        jScrollPaneObservations.setViewportView(jTextAreaObservations);

        getContentPane().add(jScrollPaneObservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 180, 350));

        jTextFieldQualification.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldQualification.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldQualification.setText("Calificación");
        getContentPane().add(jTextFieldQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 180, 30));

        jButtonQualify.setBackground(new java.awt.Color(204, 255, 255));
        jButtonQualify.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonQualify.setText("Calificar");
        getContentPane().add(jButtonQualify, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 90, -1));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 494));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        cancelOption();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    void cancelOption(){
        String [] cancelButtons = {"Sí", "No"};
        int optionSelected = JOptionPane.showOptionDialog
                (this, "¿Seguro que desea cancelar?", "Cancelar Evaluar Reporte",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
         if (optionSelected == JOptionPane.YES_NO_OPTION) {
            EvaluatePartialReport returnToPartialReport = new EvaluatePartialReport(); 
            returnToPartialReport.setVisible(true); 
            dispose(); 
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvaluateMensualReport_SelectReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonQualify;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPaneObservations;
    private javax.swing.JScrollPane jScrollPanePreviewReport;
    private javax.swing.JTextArea jTextAreaObservations;
    private javax.swing.JTextField jTextFieldQualification;
    // End of variables declaration//GEN-END:variables
}
