/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: DeleteProfesor
Date of creation: June 15th. 2020 
*/    
package GUI.Windows;

import javax.swing.JOptionPane;


public class DeleteProfesor extends javax.swing.JFrame {

    public DeleteProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Eliminar Profesor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelSelectProfesor = new javax.swing.JLabel();
        jComboBoxProfessorsList = new javax.swing.JComboBox<>();
        jLabelDeleteIcon = new javax.swing.JLabel();
        jButtonDeletePofessor = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Profesor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabelSelectProfesor.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSelectProfesor.setText("Seleccione al Profesor");
        getContentPane().add(jLabelSelectProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jComboBoxProfessorsList.setBackground(new java.awt.Color(204, 255, 255));
        jComboBoxProfessorsList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxProfessorsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProfessorsList.setToolTipText("");
        getContentPane().add(jComboBoxProfessorsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 220, 30));

        jLabelDeleteIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/DeleteIconn.png"))); // NOI18N
        getContentPane().add(jLabelDeleteIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, -1, -1));

        jButtonDeletePofessor.setBackground(new java.awt.Color(204, 255, 255));
        jButtonDeletePofessor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonDeletePofessor.setText("Eliminar");
        getContentPane().add(jButtonDeletePofessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 100, 40));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 110, 40));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String [] cancelButtons = {"Sí", "No"};
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Eliminar Profesor", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
     
        if (optionSelected == 0) {
            PrincipalWindowAdministrator returnToPrincipalWindowAdministrador = new PrincipalWindowAdministrator(); 
            returnToPrincipalWindowAdministrador.setVisible(true); 
            dispose();  
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDeletePofessor;
    private javax.swing.JComboBox<String> jComboBoxProfessorsList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDeleteIcon;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelSelectProfesor;
    // End of variables declaration//GEN-END:variables
}
