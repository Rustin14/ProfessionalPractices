/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: EvaluatePartialReport_SelectReport
Date of creation: July 2nd. 2020 
*/  
package GUI.Windows;

import javax.swing.JOptionPane;

public class EvaluatePartialReport_SelectReport extends javax.swing.JFrame {

    public EvaluatePartialReport_SelectReport() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Reporte Elegido");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jScrollPaneReportPreview = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservations = new javax.swing.JTextArea();
        jTextFieldQualification = new javax.swing.JTextField();
        jButtonQualify = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Evaluar Reporte Parcial");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 290, 30));
        getContentPane().add(jScrollPaneReportPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 480, 400));

        jTextAreaObservations.setBackground(new java.awt.Color(204, 255, 255));
        jTextAreaObservations.setColumns(30);
        jTextAreaObservations.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaObservations.setLineWrap(true);
        jTextAreaObservations.setRows(5);
        jTextAreaObservations.setText("Agregue una observación...");
        jScrollPane1.setViewportView(jTextAreaObservations);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 210, 340));

        jTextFieldQualification.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldQualification.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldQualification.setText("Calificación...");
        getContentPane().add(jTextFieldQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 210, 40));

        jButtonQualify.setBackground(new java.awt.Color(204, 255, 255));
        jButtonQualify.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonQualify.setText("Calificar");
        getContentPane().add(jButtonQualify, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

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
                new EvaluatePartialReport_SelectReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonQualify;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneReportPreview;
    private javax.swing.JTextArea jTextAreaObservations;
    private javax.swing.JTextField jTextFieldQualification;
    // End of variables declaration//GEN-END:variables
}
