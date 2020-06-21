/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: DeletePracticing
Date of creation: June 07th. 2020 
*/    

package GUI.Windows;

import javax.swing.JOptionPane;

public class DeletePracticing extends javax.swing.JFrame {

    public DeletePracticing() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Eliminar Practicante"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDeletePracticing = new javax.swing.JLabel();
        jLabelPracticingList = new javax.swing.JLabel();
        jComboBoxPracticingList = new javax.swing.JComboBox<>();
        jButtonDelete = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelDeletePracticingIcon = new javax.swing.JLabel();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDeletePracticing.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelDeletePracticing.setText("Eliminar Practicante");
        getContentPane().add(jLabelDeletePracticing, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 370, 70));

        jLabelPracticingList.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabelPracticingList.setText("Lista de Practicantes");
        getContentPane().add(jLabelPracticingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jComboBoxPracticingList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxPracticingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 350, 50));

        jButtonDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDelete.setText("Eliminar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 160, 50));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 160, 50));

        jLabelDeletePracticingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/DeletePRacticingIcon.png"))); // NOI18N
        getContentPane().add(jLabelDeletePracticingIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        jLabelFound.setText(" ");
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 757, 452));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Eliminar Practicante", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
     
        if (optionSelected == 0) {
            returnHomeCoordinator();  
        }
        
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    String [] deleteButtons = {"Aceptar", "Cancelar"};
    
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea eliminar al Practicante?", 
                "Confirmar Eliminar Practicante", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, 
                        deleteButtons, deleteButtons [0]); 
        
        if (optionSelected == 0) {
            JOptionPane.showMessageDialog(this, "Practicante eliminado exitosamente");
            returnHomeCoordinator();  
        }
        
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    
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
            java.util.logging.Logger.getLogger(DeletePracticing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletePracticing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletePracticing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletePracticing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletePracticing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JComboBox<String> jComboBoxPracticingList;
    private javax.swing.JLabel jLabelDeletePracticing;
    private javax.swing.JLabel jLabelDeletePracticingIcon;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelPracticingList;
    // End of variables declaration//GEN-END:variables
}
