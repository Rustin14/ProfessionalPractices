/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: UpdateProject
Date of creation: June 09th. 2020 
*/   

package GUI.Windows;

import javax.swing.JOptionPane;


public class UpdateProject extends javax.swing.JFrame {

    public UpdateProject() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Actualizar Proyecto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUpdateProject = new javax.swing.JLabel();
        jLabelUpdateProjectIcon = new javax.swing.JLabel();
        jLabelProjectsList = new javax.swing.JLabel();
        jComboBoxProjectsList = new javax.swing.JComboBox<>();
        jButtonUpdate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUpdateProject.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelUpdateProject.setText("Actualizar Proyecto");
        getContentPane().add(jLabelUpdateProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 360, 60));

        jLabelUpdateProjectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/updateIcon.png"))); // NOI18N
        getContentPane().add(jLabelUpdateProjectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 70, 70));

        jLabelProjectsList.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabelProjectsList.setText("Lista de Proyectos");
        getContentPane().add(jLabelProjectsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 230, 40));

        jComboBoxProjectsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxProjectsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 330, 50));

        jButtonUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonUpdate.setText("Actualizar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 150, 50));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 150, 50));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 756, 452));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String [] cancelButtons = {"Si", "No"};  
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Actualizar Proyecto", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]);
        
        if (optionSelected == 0){
            PrincipalWindowCoordinator returnToPrincipalWindowCoordinator = new PrincipalWindowCoordinator(); 
            returnToPrincipalWindowCoordinator.setVisible(true); 
            dispose(); 
        }
        
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        SectionsToUpdateProject goToSectionsToUpdateProject = new SectionsToUpdateProject();
        goToSectionsToUpdateProject.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxProjectsList;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelProjectsList;
    private javax.swing.JLabel jLabelUpdateProject;
    private javax.swing.JLabel jLabelUpdateProjectIcon;
    // End of variables declaration//GEN-END:variables
}
