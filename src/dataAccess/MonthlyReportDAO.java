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
    public void saveMonthlyReportByIDMonthly(int id_monthly, int monthNumber, int score, String observations, java.sql.Date dueDate, int id_practicing, String address) throws SQLException, ClassNotFoundException{
        Connection connect = connectDB.getConnection();
        String query = "INSERT INTO monthlyreport  (id_monthly, id_monthNumber, score, observations, dueDate, paperFile, id_practicing) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setInt(1, id_monthly);
        statement.setInt(2, monthNumber);
        statement.setInt(3, score);
        statement.setString(4, observations);
        statement.setDate(5, dueDate);
        statement.setInt(7, id_practicing);
        statement.executeQuery(); 
        connectDB.closeConnection();
    }

    @Override
    public MonthlyReport readMonthlyReportByIDMonthly(int id_monthly, String address) throws SQLException, ClassNotFoundException {
        MonthlyReport paper = null;
        ResultSet resultSet = null;
        Connection connect = connectDB.getConnection();
        String query = "SELECT paperFile FROM monthlyreport where id_monthly = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        resultSet = statement.executeQuery();
        connectDB.closeConnection();
        return paper;
    }

    @Override
    public void deleteMonthlyReportByIDMonthly(int id_monthly) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
