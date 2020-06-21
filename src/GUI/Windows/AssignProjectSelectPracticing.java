/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: AssignProjectSelectPracticing
Date of creation: June 18th. 2020 
*/   

package GUI.Windows;

import javax.swing.JOptionPane;

public class AssignProjectSelectPracticing extends javax.swing.JFrame {

    public AssignProjectSelectPracticing() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Asignar Proyecto");
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAssignProject = new javax.swing.JLabel();
        jLabelAssignProjectIcon = new javax.swing.JLabel();
        jLabelPracticingList = new javax.swing.JLabel();
        jComboBoxPracticingList = new javax.swing.JComboBox<>();
        jButtonSelectPracticing = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        found = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAssignProject.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelAssignProject.setText("Asignar Proyecto");
        getContentPane().add(jLabelAssignProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabelAssignProjectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/assignIcon.png"))); // NOI18N
        getContentPane().add(jLabelAssignProjectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabelPracticingList.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabelPracticingList.setText("Lista de Practicantes");
        getContentPane().add(jLabelPracticingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jComboBoxPracticingList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxPracticingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 400, 50));

        jButtonSelectPracticing.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSelectPracticing.setText("Seleccionar Practicante");
        jButtonSelectPracticing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectPracticingActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSelectPracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 50));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 170, 50));

        found.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(found, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 748, 435));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSelectPracticingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectPracticingActionPerformed
        AssignProject goToAssignProject = new AssignProject();
        goToAssignProject.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonSelectPracticingActionPerformed

    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Asignación de Proyecto", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]);
        
        if (optionSelected == 0){
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
            java.util.logging.Logger.getLogger(AssignProjectSelectPracticing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignProjectSelectPracticing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignProjectSelectPracticing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignProjectSelectPracticing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignProjectSelectPracticing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel found;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSelectPracticing;
    private javax.swing.JComboBox<String> jComboBoxPracticingList;
    private javax.swing.JLabel jLabelAssignProject;
    private javax.swing.JLabel jLabelAssignProjectIcon;
    private javax.swing.JLabel jLabelPracticingList;
    // End of variables declaration//GEN-END:variables
}
