/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: AssignProject
Date of creation: June 21st. 2020 
*/   
 
package GUI.Windows;

import javax.swing.JOptionPane;

public class AssignProject extends javax.swing.JFrame {

    public AssignProject() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Asignar Proyecto"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAssignProject = new javax.swing.JLabel();
        jLabelAssignProjectIcon = new javax.swing.JLabel();
        jLabelProjectsList = new javax.swing.JLabel();
        jComboBoxProjectsList = new javax.swing.JComboBox<>();
        jButtonAssign = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAssignProject.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelAssignProject.setText("Asignar Proyecto");
        getContentPane().add(jLabelAssignProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabelAssignProjectIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/assignIcon.png"))); // NOI18N
        getContentPane().add(jLabelAssignProjectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabelProjectsList.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabelProjectsList.setText("Lista de Proyectos");
        getContentPane().add(jLabelProjectsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jComboBoxProjectsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxProjectsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 330, 50));

        jButtonAssign.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAssign.setText("Asignar");
        getContentPane().add(jButtonAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 150, 50));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 150, 50));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        jLabelFound.setText("jLabel1");
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 744, 428));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Asignación", 
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
            java.util.logging.Logger.getLogger(AssignProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAssign;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JComboBox<String> jComboBoxProjectsList;
    private javax.swing.JLabel jLabelAssignProject;
    private javax.swing.JLabel jLabelAssignProjectIcon;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelProjectsList;
    // End of variables declaration//GEN-END:variables
}
