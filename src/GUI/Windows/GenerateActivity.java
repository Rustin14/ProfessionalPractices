/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: GenerateActivity
Date of creation: June 15th. 2020 
*/  
package GUI.Windows;

import BusinessLogic.PersonDataValidations;
import javax.swing.JOptionPane;


public class GenerateActivity extends javax.swing.JFrame {

    public GenerateActivity() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Generar Actividad");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelTitlrOfActivity = new javax.swing.JLabel();
        jTextFieldTitleOfActivity = new javax.swing.JTextField();
        jLabelDescriptionOfActivity = new javax.swing.JLabel();
        jScrollPaneDescriptionOfActivity = new javax.swing.JScrollPane();
        jTextAreaDescriptionOfActivity = new javax.swing.JTextArea();
        jLabelDateOfDelivery = new javax.swing.JLabel();
        jLabelDayOfDelivery = new javax.swing.JLabel();
        jLabelMonthOfDelivery = new javax.swing.JLabel();
        jLabelYearOfDelivery = new javax.swing.JLabel();
        jTextFieldDayOfDelivery = new javax.swing.JTextField();
        jTextFieldYearOfDelivery = new javax.swing.JTextField();
        jTextFieldMonthOfDelivery = new javax.swing.JTextField();
        jButtonAcept = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Generar Actividad");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 20));

        jLabelTitlrOfActivity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitlrOfActivity.setText("Titulo de la Actividad:");
        getContentPane().add(jLabelTitlrOfActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jTextFieldTitleOfActivity.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldTitleOfActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 210, 30));

        jLabelDescriptionOfActivity.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelDescriptionOfActivity.setText("Descripción:");
        getContentPane().add(jLabelDescriptionOfActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jTextAreaDescriptionOfActivity.setBackground(new java.awt.Color(204, 255, 255));
        jTextAreaDescriptionOfActivity.setColumns(20);
        jTextAreaDescriptionOfActivity.setRows(5);
        jScrollPaneDescriptionOfActivity.setViewportView(jTextAreaDescriptionOfActivity);

        getContentPane().add(jScrollPaneDescriptionOfActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 290, 160));

        jLabelDateOfDelivery.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelDateOfDelivery.setText("Fecha de entrega");
        getContentPane().add(jLabelDateOfDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 160, -1));

        jLabelDayOfDelivery.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelDayOfDelivery.setText("Día:");
        getContentPane().add(jLabelDayOfDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabelMonthOfDelivery.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelMonthOfDelivery.setText("Mes:");
        getContentPane().add(jLabelMonthOfDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabelYearOfDelivery.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelYearOfDelivery.setText("Año:");
        getContentPane().add(jLabelYearOfDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        jTextFieldDayOfDelivery.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldDayOfDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 160, 30));

        jTextFieldYearOfDelivery.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldYearOfDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 150, 30));

        jTextFieldMonthOfDelivery.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldMonthOfDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 150, 30));

        jButtonAcept.setBackground(new java.awt.Color(204, 255, 255));
        jButtonAcept.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAcept.setText("Aceptar");
        jButtonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, 30));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 100, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 668, 446));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void goToNextWindow(){
        GenerateActivity_ShowEnteredInformation goToNextWindow = new GenerateActivity_ShowEnteredInformation();
        goToNextWindow.setVisible(true);
        dispose();
    }

    public static String titleOfActivity = "";
    public static String descriptionOfActivity = "";
    public static String dayOfDelivery = "";
    public static String monthOfDelivery = "";
    public static String yearOfDelivery = "";
    
    void verificarCampos(){
        PersonDataValidations user = new PersonDataValidations();
        if(jTextFieldTitleOfActivity.getText().isEmpty() 
                || jTextAreaDescriptionOfActivity.getText().isEmpty()
                       || jTextFieldDayOfDelivery.getText().isEmpty() 
                                || jTextFieldMonthOfDelivery.getText().isEmpty()
                                        || jTextFieldYearOfDelivery.getText().isEmpty()){
                                                JOptionPane.showMessageDialog(this, "Favor de NO dejar espacios vacios");  
        }else{
             
            titleOfActivity = jTextFieldTitleOfActivity.getText();
            descriptionOfActivity = jTextAreaDescriptionOfActivity.getText();
            dayOfDelivery = jTextFieldDayOfDelivery.getText();
            monthOfDelivery = jTextFieldMonthOfDelivery.getText();
            yearOfDelivery = jTextFieldYearOfDelivery.getText();
           
            if((user.validateTitle(titleOfActivity) == true) 
                        && (user.validateDateDay(dayOfDelivery) == true) 
                            && (user.validateDateMonth(monthOfDelivery) == true) 
                                && (user.validateDateYear(yearOfDelivery) == true)){
                                        goToNextWindow();
            }else if((user.validateTitle(titleOfActivity) == false)){
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un título valido");
            }else if((user.validateDateDay(dayOfDelivery) == false)){
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un día valido (valores numericos)");
            }else if((user.validateDateMonth(monthOfDelivery) == false)){
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un mes valido (el nombre de un mes)");
            }else if((user.validateDateYear(yearOfDelivery) == false)){
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un año valido (valores numericos)");
            }       
        }
    }
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
      cancelOption();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptActionPerformed
        verificarCampos();
    }//GEN-LAST:event_jButtonAceptActionPerformed

    void cancelOption(){
        String [] cancelButtons = {"Sí", "No"};
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", "Cancelar generar actividad",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
        
         if (optionSelected == JOptionPane.YES_NO_OPTION) {
            PrincipalWindowProfessor returnToPrincipalWindowProfessor = new PrincipalWindowProfessor(); 
            returnToPrincipalWindowProfessor.setVisible(true); 
            dispose();  
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcept;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabelDateOfDelivery;
    private javax.swing.JLabel jLabelDayOfDelivery;
    private javax.swing.JLabel jLabelDescriptionOfActivity;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelMonthOfDelivery;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitlrOfActivity;
    private javax.swing.JLabel jLabelYearOfDelivery;
    private javax.swing.JScrollPane jScrollPaneDescriptionOfActivity;
    private javax.swing.JTextArea jTextAreaDescriptionOfActivity;
    private javax.swing.JTextField jTextFieldDayOfDelivery;
    private javax.swing.JTextField jTextFieldMonthOfDelivery;
    private javax.swing.JTextField jTextFieldTitleOfActivity;
    private javax.swing.JTextField jTextFieldYearOfDelivery;
    // End of variables declaration//GEN-END:variables
}
