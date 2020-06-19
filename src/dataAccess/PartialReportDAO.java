/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: PartialReportDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import Domain.PartialReport;
import InterfacesDAO.IPartialReportDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import java.sql.*;
import java.util.ArrayList;

public class PartialReportDAO implements IPartialReportDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;


    @Override
    public void savePartialReport(int id_partial, int partialNumber, int score, String observations
            ,Date dueDate, int id_practicing, String address) throws SQLException, ClassNotFoundException {
                Connection connect = connectDB.getConnection();
                String query = "INSERT INTO partialreport  (id_partial, id_practicing) VALUES (?, ?)";
                PreparedStatement statement = connect.prepareStatement(query);
                statement.setInt(1, id_partial);
                statement.setInt(7, id_practicing);
                statement.executeQuery();
                connectDB.closeConnection();
    }
    
    public void savePartialReportByIDPartial(int id_partial, String address) throws SQLException, ClassNotFoundException, FileNotFoundException {
        Connection connect = connectDB.getConnection();
        String query = "INSERT INTO partialreport (paperFile) VALUES (?) where id_partial = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        File file = new File(address);
        InputStream inputStream = new FileInputStream(file);
        int fileLength = (int)file.length();
        statement.setBinaryStream(1, inputStream);
        statement.setInt(2, id_partial);
        statement.executeUpdate();
    }

    @Override
    public PartialReport readPartialReportByIDPartial(int id_partial, String address) throws SQLException, ClassNotFoundException {
        PartialReport paper = null;
        ResultSet resultSet = null;
        Connection connect = connectDB.getConnection();
        String query = "SELECT paperFile FROM partialreport where id_partial = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        resultSet = statement.executeQuery();
        connectDB.closeConnection();
        return paper;
    }

    @Override
    public void deletePartialReportByIDPartial(int id_partial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public ArrayList<PartialReport> ReadAllPartialReports() throws SQLException, ClassNotFoundException {
        PartialReport paper = null;
        ArrayList<PartialReport> allPartialReports = new ArrayList();
        Connection connect = connectDB.getConnection();
        String query = "SELECT id_partial FROM partialreport";
        PreparedStatement statement = connect.prepareStatement(query);
        results = statement.executeQuery();
        while (results.next()) {
            paper = new PartialReport();
            paper.setId_partial(results.getInt("id_partial"));
            allPartialReports.add(paper);
        }
        return allPartialReports;
    }
}
