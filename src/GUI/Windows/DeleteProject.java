/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: DeleteProject
Date of creation: June 07th. 2020 
*/   

package GUI.Windows;

import javax.swing.JOptionPane;

public class DeleteProject extends javax.swing.JFrame {
    
    public DeleteProject() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        this.setTitle("Eliminar Proyecto"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDeleteProject = new javax.swing.JLabel();
        jLabelDeleteProjectIcon = new javax.swing.JLabel();
        jLabelProjectsList = new javax.swing.JLabel();
        jComboBoxProjectsList = new javax.swing.JComboBox<>();
        jButtonDelete = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDeleteProject.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelDeleteProject.setText("Eliminar Proyecto");
        getContentPane().add(jLabelDeleteProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 320, 60));

        jLabelDeleteProjectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/DeleteIcon.png"))); // NOI18N
        getContentPane().add(jLabelDeleteProjectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabelProjectsList.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabelProjectsList.setText("Lista de Proyectos ");
        getContentPane().add(jLabelProjectsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jComboBoxProjectsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxProjectsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 330, 50));

        jButtonDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDelete.setText("Eliminar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 150, 50));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 150, 50));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 760, 455));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String [] cancelButtons = {"Si", "No"};
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Eliminar Proyecto", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
        
        if (optionSelected == 0) {
            returnHomeCoordinator(); 
        }
        
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    String [] deleteButtons = {"Aceptar", "Cancelar"};
    
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea eliminar el proyecto?", "Confirmar Eliminar Proyecto", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, deleteButtons, deleteButtons [0]);
        
       if (optionSelected == 0) {
           JOptionPane.showMessageDialog(this, "Proyecto eliminado exitosamente"); 
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
            java.util.logging.Logger.getLogger(DeleteProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProject().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JComboBox<String> jComboBoxProjectsList;
    private javax.swing.JLabel jLabelDeleteProject;
    private javax.swing.JLabel jLabelDeleteProjectIcon;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelProjectsList;
    // End of variables declaration//GEN-END:variables
}
