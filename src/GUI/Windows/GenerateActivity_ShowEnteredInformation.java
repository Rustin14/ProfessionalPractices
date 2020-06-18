/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: GenerateActivity_ShowEnteredInformation
Date of creation: June 15th. 2020 
*/  
package GUI.Windows;

import javax.swing.JOptionPane;

public class GenerateActivity_ShowEnteredInformation extends javax.swing.JFrame {

    public GenerateActivity_ShowEnteredInformation() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Información ingresada");
        GenerateActivity data = new GenerateActivity();
        jTextFieldTitleEntered.setText(data.titleOfActivity);
        jTextAreaDescriptionEntered.setText(data.descriptionOfActivity);
        jTextFieldDateEntered.setText(data.dayOfDelivery + "/" + data.monthOfDelivery + "/" + data.yearOfDelivery);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelTitleActivity = new javax.swing.JLabel();
        jLabelDescriptionActivity = new javax.swing.JLabel();
        jLabelDateOfDelivery = new javax.swing.JLabel();
        jLabelIcon = new javax.swing.JLabel();
        jTextFieldTitleEntered = new javax.swing.JTextField();
        jScrollPaneDescriptionEntered = new javax.swing.JScrollPane();
        jTextAreaDescriptionEntered = new javax.swing.JTextArea();
        jTextFieldDateEntered = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Actividad");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabelTitleActivity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitleActivity.setText("Titulo:");
        getContentPane().add(jLabelTitleActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabelDescriptionActivity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelDescriptionActivity.setText("Descripción:");
        getContentPane().add(jLabelDescriptionActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabelDateOfDelivery.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelDateOfDelivery.setText("Entrega:");
        getContentPane().add(jLabelDateOfDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/ActivityDelivery.png"))); // NOI18N
        getContentPane().add(jLabelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jTextFieldTitleEntered.setEditable(false);
        jTextFieldTitleEntered.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldTitleEntered, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 300, 30));

        jTextAreaDescriptionEntered.setEditable(false);
        jTextAreaDescriptionEntered.setBackground(new java.awt.Color(204, 255, 255));
        jTextAreaDescriptionEntered.setColumns(20);
        jTextAreaDescriptionEntered.setRows(5);
        jScrollPaneDescriptionEntered.setViewportView(jTextAreaDescriptionEntered);

        getContentPane().add(jScrollPaneDescriptionEntered, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 240, 160));

        jTextFieldDateEntered.setEditable(false);
        jTextFieldDateEntered.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldDateEntered, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 280, 30));

        jButtonAdd.setBackground(new java.awt.Color(204, 255, 255));
        jButtonAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAdd.setText("Añadir");
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 110, 30));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 100, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 661, 444));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String [] cancelButtons = {"Sí", "No"};
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", "Cancelar información ingresada",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
        
         if (optionSelected == 0) {
            GenerateActivity returnToGenerateActivity = new GenerateActivity(); 
            returnToGenerateActivity.setVisible(true); 
            dispose();  
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed


    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateActivity_ShowEnteredInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabelDateOfDelivery;
    private javax.swing.JLabel jLabelDescriptionActivity;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleActivity;
    private javax.swing.JScrollPane jScrollPaneDescriptionEntered;
    private javax.swing.JTextArea jTextAreaDescriptionEntered;
    private javax.swing.JTextField jTextFieldDateEntered;
    private javax.swing.JTextField jTextFieldTitleEntered;
    // End of variables declaration//GEN-END:variables
}
