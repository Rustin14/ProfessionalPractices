/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: AddSchedule
Date of creation: June 26th. 2020 
*/  
package GUI.Windows;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

public class AddSchedule extends javax.swing.JFrame {

    private String nameFile = "";
    private boolean selectedFile = false;
    private String pathFile = "";
    
    public AddSchedule() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Añadir Horario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelSelectFile = new javax.swing.JLabel();
        jButtonSelectFile = new javax.swing.JButton();
        jLabelNameFile = new javax.swing.JLabel();
        jTextFieldNameFile = new javax.swing.JTextField();
        jLabelPreview = new javax.swing.JLabel();
        jScrollPanePreview = new javax.swing.JScrollPane();
        jButtonAcept = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitle.setText("Añadir Horario");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabelSelectFile.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSelectFile.setText("Por favor, seleccione su archivo.");
        getContentPane().add(jLabelSelectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jButtonSelectFile.setBackground(new java.awt.Color(204, 255, 255));
        jButtonSelectFile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonSelectFile.setText("Seleccionar");
        jButtonSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectFileActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSelectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 120, 40));

        jLabelNameFile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNameFile.setText("Nombre : ");
        getContentPane().add(jLabelNameFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextFieldNameFile.setEditable(false);
        jTextFieldNameFile.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldNameFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 680, 30));

        jLabelPreview.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPreview.setText("Vista previa :");
        getContentPane().add(jLabelPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jScrollPanePreview.setBackground(new java.awt.Color(204, 255, 255));
        jScrollPanePreview.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jScrollPanePreviewMouseWheelMoved(evt);
            }
        });
        getContentPane().add(jScrollPanePreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 750, 350));

        jButtonAcept.setBackground(new java.awt.Color(204, 255, 255));
        jButtonAcept.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAcept.setText("Aceptar");
        jButtonAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 100, 40));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 100, 40));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        cancelOption();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectFileActionPerformed
        selectFile();
    }//GEN-LAST:event_jButtonSelectFileActionPerformed

    private void jButtonAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAceptActionPerformed

    private void jScrollPanePreviewMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jScrollPanePreviewMouseWheelMoved
        
    }//GEN-LAST:event_jScrollPanePreviewMouseWheelMoved

    void cancelOption(){
        String [] cancelButtons = {"Sí", "No"};
        int optionSelected = JOptionPane.showOptionDialog
                (this, "¿Seguro que desea cancelar?", "Cancelar generar actividad",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
        if (optionSelected == JOptionPane.YES_NO_OPTION) {
            PrincipalWindowProfessor returnToPrincipalWindowProfessor = new PrincipalWindowProfessor(); 
            returnToPrincipalWindowProfessor.setVisible(true); 
            dispose();  
        }
    }
    
    void selectFile(){
        JFileChooser chooseFile = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Files", "pdf");
        chooseFile.setFileFilter(filter);
        int returnVal = chooseFile.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            pathFile = chooseFile.getSelectedFile().getAbsolutePath();
            nameFile = chooseFile.getSelectedFile().getName();
        }   
        previewFile(pathFile, nameFile);
    }
    
    void previewFile(String file, String nameFile){
        SwingController controller = new SwingController();
        SwingViewBuilder getBuilder = new SwingViewBuilder(controller);
        JPanel viewerComponentPanel = getBuilder.buildViewerPanel();
        controller.getDocumentViewController().setAnnotationCallback(new org.icepdf.ri.common.MyAnnotationCallback(controller.getDocumentViewController()));
        jScrollPanePreview.setViewportView(viewerComponentPanel);
        jTextFieldNameFile.setText(nameFile);
        controller.openDocument(file);
        selectedFile  = true;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcept;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSelectFile;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelNameFile;
    private javax.swing.JLabel jLabelPreview;
    private javax.swing.JLabel jLabelSelectFile;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPanePreview;
    private javax.swing.JTextField jTextFieldNameFile;
    // End of variables declaration//GEN-END:variables
}
