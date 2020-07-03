/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: SendMessage
Date of creation: July 02nd. 2020 
*/   

package GUI.Windows;

import javax.swing.JOptionPane;

public class SendMessage extends javax.swing.JFrame {

    public SendMessage() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Enviar Mensaje"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSendMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRecipientsMail = new javax.swing.JLabel();
        jTextFieldRecipientsMail = new javax.swing.JTextField();
        jLabelMessageSubject = new javax.swing.JLabel();
        jTextFieldMessageSubject = new javax.swing.JTextField();
        jLabelMessageBody = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMessageBody = new javax.swing.JTextArea();
        jButtonSend = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSendMessage.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelSendMessage.setText("Enviar Mensaje");
        getContentPane().add(jLabelSendMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Mailbox.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabelRecipientsMail.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelRecipientsMail.setText("Correo del Destinatario: ");
        getContentPane().add(jLabelRecipientsMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        getContentPane().add(jTextFieldRecipientsMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 270, 30));

        jLabelMessageSubject.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelMessageSubject.setText("Asunto del Mensaje: ");
        getContentPane().add(jLabelMessageSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        getContentPane().add(jTextFieldMessageSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 270, 30));

        jLabelMessageBody.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelMessageBody.setText("Cuerpo del Mensaje:");
        getContentPane().add(jLabelMessageBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jTextAreaMessageBody.setColumns(20);
        jTextAreaMessageBody.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMessageBody);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 320, 150));

        jButtonSend.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSend.setText("Enviar");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 140, 50));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 140, 50));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 751, 434));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        JOptionPane.showMessageDialog(this, "Mensaje enviado exitosamente");
        dispose();
    }//GEN-LAST:event_jButtonSendActionPerformed

    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Enviar Mensaje", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]);
        
        if (optionSelected == 0) {
            dispose();
        }
        
    }//GEN-LAST:event_jButtonCancelActionPerformed

    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelMessageBody;
    private javax.swing.JLabel jLabelMessageSubject;
    private javax.swing.JLabel jLabelRecipientsMail;
    private javax.swing.JLabel jLabelSendMessage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMessageBody;
    private javax.swing.JTextField jTextFieldMessageSubject;
    private javax.swing.JTextField jTextFieldRecipientsMail;
    // End of variables declaration//GEN-END:variables
}
