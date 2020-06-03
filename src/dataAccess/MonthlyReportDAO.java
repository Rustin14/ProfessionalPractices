/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: MonthlyReportDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import Domain.MonthlyReport;
import InterfacesDAO.IMonthlyReportDAO;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MonthlyReportDAO implements IMonthlyReportDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;


    @Override
    public void saveMonthlyReportByIDMonthly(int id_monthly, int monthNumber, int score, String observations, java.sql.Date dueDate, byte[] paperFile, int id_practicing, String address) {
        try (Connection connect = connectDB.getConnection()) {
            String query = "INSERT INTO monthlyreport  (id_monthly, id_monthNumber, score, observations, dueDate, paperFile, id_practicing) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_monthly);
            statement.setInt(2, monthNumber);
            statement.setInt(3, score);
            statement.setString(4, observations);
            statement.setDate(5, dueDate);
            statement.setInt(7, id_practicing);
            try {
                InputStream inputStream = new FileInputStream(new File(address));
                statement.setBlob(6, inputStream);
            } catch (FileNotFoundException exc) {
                Logger.getLogger(MonthlyReportDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(MonthlyReportDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
    }

    @Override
    public MonthlyReport readMonthlyReportByIDMonthly(int id_monthly, String address) {
        MonthlyReport paper = null;
        ResultSet resultSet = null;
        try (Connection connect = connectDB.getConnection()) {
            String query = "SELECT paperFile FROM monthlyreport where id_monthly = ?";
            PreparedStatement statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(MonthlyReportDAO.class.getName()).log(Level.SEVERE, null, exc);
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
            Logger.getLogger(MonthlyReportDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return paper;
    }

    @Override
    public void deleteMonthlyReportByIDMonthly(int id_monthly) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
