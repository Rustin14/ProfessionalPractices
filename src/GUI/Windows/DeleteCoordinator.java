/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: DeleteCoordinator
Date of creation: Jun 26th. 2020 
*/ 
package GUI.Windows;

import javax.swing.JOptionPane;

public class DeleteCoordinator extends javax.swing.JFrame {

    public DeleteCoordinator() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Eliminar Coordinador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelCubicle = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelStaffNumber = new javax.swing.JLabel();
        jLabelIDNumber = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldCubicle = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldSatffNumber = new javax.swing.JTextField();
        jTextFieldIDNumber = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Coordinador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabelName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelName.setText("Nombre :");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabelCubicle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCubicle.setText("Cubiculo :");
        getContentPane().add(jLabelCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, -1));

        jLabelEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelEmail.setText("Correo :");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabelStaffNumber.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelStaffNumber.setText("No. de personal :");
        getContentPane().add(jLabelStaffNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabelIDNumber.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelIDNumber.setText("No. de identificacion :");
        getContentPane().add(jLabelIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jTextFieldName.setEditable(false);
        jTextFieldName.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 79, 320, 30));

        jTextFieldCubicle.setEditable(false);
        jTextFieldCubicle.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldCubicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 320, -1));

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 320, -1));

        jTextFieldSatffNumber.setEditable(false);
        jTextFieldSatffNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldSatffNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 320, -1));

        jTextFieldIDNumber.setEditable(false);
        jTextFieldIDNumber.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldIDNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 320, -1));

        jButtonDelete.setBackground(new java.awt.Color(204, 255, 255));
        jButtonDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonDelete.setText("Eliminar");
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 40));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 100, 40));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        jLabelFound.setText("jLabel1");
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 652, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        cancelOption();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    void cancelOption(){
        String [] cancelButtons = {"Si", "No"}; 
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", 
                "Cancelar Registro de Coordinador", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons[0]);
        if (optionSelected == JOptionPane.YES_NO_OPTION) {
            PrincipalWindowAdministrator returnToWindowAdministrator = new PrincipalWindowAdministrator();
            returnToWindowAdministrator.setVisible(true);
            dispose(); 
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCoordinator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCubicle;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelIDNumber;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelStaffNumber;
    private javax.swing.JTextField jTextFieldCubicle;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIDNumber;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSatffNumber;
    // End of variables declaration//GEN-END:variables
}
