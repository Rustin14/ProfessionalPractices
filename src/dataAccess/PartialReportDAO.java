/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: PartialReportDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import Domain.PartialReport;
import InterfacesDAO.IPartialReportDAO;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PartialReportDAO implements IPartialReportDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;


    @Override
    public void savePartialReport(int id_partial, int partialNumber, int score, String observations, Date dueDate, byte[] paperFile, int id_practicing, String address) {
        try (Connection connect = connectDB.getConnection()) {
            String query = "INSERT INTO partialreport  (id_partial, partialNumber, score, observations, dueDate, paperFile, id_practicing) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_partial);
            statement.setInt(2, partialNumber);
            statement.setInt(3, score);
            statement.setString(4, observations);
            statement.setDate(5, dueDate);
            statement.setInt(7, id_practicing);
            try {
                InputStream inputStream = new FileInputStream(new File(address));
                statement.setBlob(5, inputStream);
            } catch (FileNotFoundException exc) {
                Logger.getLogger(PartialReport.class.getName()).log(Level.SEVERE, null, exc);
            }
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(PartialReport.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
    }

    @Override
    public PartialReport readPartialReportByIDPartial(int id_partial, String address) {
       PartialReport paper = null;
        ResultSet resultSet = null;
        try (Connection connect = connectDB.getConnection()) {
            String query = "SELECT paperFile FROM partialreport where id_partial = ?";
            PreparedStatement statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(PartialReportDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        try {
            File file = new File(address);
            FileOutputStream outputStream = new FileOutputStream(file);
            while (results.next()) {
                InputStream input = resultSet.getBinaryStream("paperFile");
                byte[] buffer = new byte[1024];
                while (input.read(buffer) > 0) {
                    outputStream.write(buffer);
                }
                paper.setPaperFile(buffer);
            }
        } catch (IOException | SQLException exc) {
            Logger.getLogger(PartialReportDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return paper;
    }

    @Override
    public void deletePartialReportByIDPartial(int id_partial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
