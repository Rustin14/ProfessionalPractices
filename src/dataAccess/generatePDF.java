/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import GUI.Windows.GeneratePartialReportWindow;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author gabrielflores
 */
public class generatePDF  {
    
    public InputStream readTemplateFile () throws IOException {
    InputStream input = null;
    input = new FileInputStream(new File("/Users/gabrielflores/JaspersoftWorkspace/ReporteParcial/ReporteParcialBueno.jrxml"));
    return input;
    }
    
    public void showResultingPDF() throws IOException {
        String outputFile = "/Users/gabrielflores/JaspersoftWorkspace/ReporteParcial/" + "PruebaReporteParcial.pdf";
        Desktop.getDesktop().open(new File(outputFile));
    }
    
    public void generateReport (Map<String, Object> parameters, InputStream inputTemplateFile) throws JRException {
    String outputFile = "/Users/gabrielflores/JaspersoftWorkspace/ReporteParcial/" + "PruebaReporteParcial.pdf";
    OutputStream outputStream = null;
    JasperDesign jasperDesign = JRXmlLoader.load(inputTemplateFile);
    JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
        try {
            outputStream = new FileOutputStream(new File(outputFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(generatePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
    }
}
