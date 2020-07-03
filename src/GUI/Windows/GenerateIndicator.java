/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: GenerateIndicator
Date of creation: July 02nd. 2020 
*/ 

package GUI.Windows;

import javax.swing.JOptionPane;

public class GenerateIndicator extends javax.swing.JFrame {

    public GenerateIndicator() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Generar Indicadores");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelGenerateIndicator = new javax.swing.JLabel();
        jLabelGenerateIndicatorIcon = new javax.swing.JLabel();
        jLabelFilters = new javax.swing.JLabel();
        jButtonGeneratePdf = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelGenerateIndicator.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelGenerateIndicator.setText("Generar Indicadores");
        getContentPane().add(jLabelGenerateIndicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabelGenerateIndicatorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/GEnerateReportIcon.png"))); // NOI18N
        getContentPane().add(jLabelGenerateIndicatorIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabelFilters.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabelFilters.setText("Filtros: ");
        getContentPane().add(jLabelFilters, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jButtonGeneratePdf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGeneratePdf.setText("Generar PDF");
        getContentPane().add(jButtonGeneratePdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 150, 50));

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 150, 50));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 733, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String [] cancelButtons = {"Si", "No"}; 
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro desea cancelar?", "Cancelar Generar Reporte de Indicadores", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons[0]);
        
        if (optionSelected == 0) {
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
            java.util.logging.Logger.getLogger(GenerateIndicator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateIndicator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateIndicator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateIndicator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateIndicator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonGeneratePdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFilters;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelGenerateIndicator;
    private javax.swing.JLabel jLabelGenerateIndicatorIcon;
    // End of variables declaration//GEN-END:variables
}
