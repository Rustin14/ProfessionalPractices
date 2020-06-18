/*
Intitution: Universidad Veracruzana 
File creator: Brandon Trujillo
Class name: GenerateActivity
Date of creation: June 16th. 2020 
*/  
package GUI.Windows;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

public class AddPresentationFormat extends javax.swing.JFrame {
    private boolean flag;
    private String pathFile;
    
    public AddPresentationFormat() {
        this.flag = false;
        this.pathFile = "";
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Añadir formato de presentación");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPlisSelectTheArchive = new javax.swing.JLabel();
        jButtonSelect = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jTextFieldNameArchive = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelNameArchive = new javax.swing.JLabel();
        jLabelPreview = new javax.swing.JLabel();
        jScrollPanePreview = new javax.swing.JScrollPane();
        jButtonAcept = new javax.swing.JButton();
        jLabelFound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPlisSelectTheArchive.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPlisSelectTheArchive.setText("Por favor, seleccione su archivo");
        getContentPane().add(jLabelPlisSelectTheArchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jButtonSelect.setBackground(new java.awt.Color(204, 255, 255));
        jButtonSelect.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSelect.setText("Seleccionar");
        jButtonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 120, 30));

        jButtonCancel.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 120, 30));

        jTextFieldNameArchive.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(jTextFieldNameArchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 530, 30));

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Añadir formato de presentación");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabelNameArchive.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNameArchive.setText("Nombre:");
        getContentPane().add(jLabelNameArchive, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabelPreview.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPreview.setText("Vista previa:");
        getContentPane().add(jLabelPreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jScrollPanePreview.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jScrollPanePreview, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 610, 260));

        jButtonAcept.setBackground(new java.awt.Color(204, 255, 255));
        jButtonAcept.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAcept.setText("Aceptar");
        getContentPane().add(jButtonAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 120, 30));

        jLabelFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String [] cancelButtons = {"Sí", "No"};
    
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
      cancelOption();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectActionPerformed
          selectFile();
    }//GEN-LAST:event_jButtonSelectActionPerformed
    
    void cancelOption(){
        int optionSelected = JOptionPane.showOptionDialog(this, "¿Seguro que desea cancelar?", "Cancelar generar actividad",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, cancelButtons, cancelButtons [0]); 
         if (optionSelected == 0) {
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
        }   
        previewFile(pathFile);
    }
  
    void previewFile(String file){
        SwingController controller = new SwingController();
        SwingViewBuilder getBuilder = new SwingViewBuilder(controller);
        JPanel viewerComponentPanel = getBuilder.buildViewerPanel();
        controller.getDocumentViewController().setAnnotationCallback(new org.icepdf.ri.common.MyAnnotationCallback(controller.getDocumentViewController()));
        jScrollPanePreview.setViewportView(viewerComponentPanel);
        controller.openDocument(file);
        flag = true;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddPresentationFormat.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(AddPresentationFormat.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(AddPresentationFormat.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(AddPresentationFormat.class.getName()).log(Level.SEVERE, null, ex);
                }
                new AddPresentationFormat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcept;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSelect;
    private javax.swing.JLabel jLabelFound;
    private javax.swing.JLabel jLabelNameArchive;
    private javax.swing.JLabel jLabelPlisSelectTheArchive;
    private javax.swing.JLabel jLabelPreview;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPanePreview;
    private javax.swing.JTextField jTextFieldNameArchive;
    // End of variables declaration//GEN-END:variables
}
