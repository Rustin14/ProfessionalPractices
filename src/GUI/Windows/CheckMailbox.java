/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: CheckMailbox
Date of creation: July 02nd. 2020 
*/  

package GUI.Windows;

import javax.swing.JOptionPane;

public class CheckMailbox extends javax.swing.JFrame {

    public CheckMailbox() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consultar Buzón"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMailBox = new javax.swing.JLabel();
        jLabelMessageList = new javax.swing.JLabel();
        jComboBoxMessagesList = new javax.swing.JComboBox<>();
        jTextFieldVisualization = new javax.swing.JTextField();
        jLabelVisualization = new javax.swing.JLabel();
        jButtonDeleteMessage = new javax.swing.JButton();
        jButtonSendMessage = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelMailBoxIcon = new javax.swing.JLabel();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMailBox.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabelMailBox.setText("Buzón");
        getContentPane().add(jLabelMailBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 160, 40));

        jLabelMessageList.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelMessageList.setText("Mensajes Recibidos: ");
        getContentPane().add(jLabelMessageList, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jComboBoxMessagesList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxMessagesList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 50));
        getContentPane().add(jTextFieldVisualization, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 360, 160));

        jLabelVisualization.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelVisualization.setText("Visualización: ");
        getContentPane().add(jLabelVisualization, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jButtonDeleteMessage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDeleteMessage.setText("Eliminar Mensaje");
        jButtonDeleteMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteMessageActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeleteMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 150, 50));

        jButtonSendMessage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSendMessage.setText("Enviar Mensaje");
        jButtonSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendMessageActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSendMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 150, 50));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 150, 50));

        jLabelMailBoxIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Mailbox.png"))); // NOI18N
        getContentPane().add(jLabelMailBoxIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar", "Cancelar Consultar Buzón", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons[0]); 
        
        if (optionSelected == 0) {
            dispose();
        }
        
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    String [] deleteButtons = {"Aceptar", "Cancelar"}; 
    
    private void jButtonDeleteMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteMessageActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea eliminar el mensaje?", "Eliminar Mensaje", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, null, deleteButtons, deleteButtons[0]);
        
        if (optionSelected == 0) {
            JOptionPane.showMessageDialog(this, "Mensaje eliminado exitosamente");
            dispose(); 
        }
        
    }//GEN-LAST:event_jButtonDeleteMessageActionPerformed

    private void jButtonSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendMessageActionPerformed
        SendMessage goToSendMessage = new SendMessage();
        goToSendMessage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSendMessageActionPerformed

   
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckMailbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckMailbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckMailbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckMailbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckMailbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDeleteMessage;
    private javax.swing.JButton jButtonSendMessage;
    private javax.swing.JComboBox<String> jComboBoxMessagesList;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelMailBox;
    private javax.swing.JLabel jLabelMailBoxIcon;
    private javax.swing.JLabel jLabelMessageList;
    private javax.swing.JLabel jLabelVisualization;
    private javax.swing.JTextField jTextFieldVisualization;
    // End of variables declaration//GEN-END:variables
}
