/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: AcceptancePaperDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import Domain.AcceptancePaper;
import InterfacesDAO.IAcceptancePaperDAO;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AcceptancePaperDAO implements IAcceptancePaperDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;

public AcceptancePaperDAO () {
    connectDB = new ConnectDB();
}
    @Override
    public void saveAcceptancePaper(int id_acceptance, int id_practicing, int id_project, int id_company, String address) throws SQLException, ClassNotFoundException {
        Connection connect = connectDB.getConnection();
        String query = "INSERT INTO acceptancepaper  (id_acceptance, id_practicing, id_project, id_company, paperFile) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setInt(1, id_acceptance);
        statement.setInt(2, id_practicing);
        statement.setInt(3, id_project);
        statement.setInt(4, id_company);
        statement.executeQuery();
        connectDB.closeConnection();
    }

    @Override
    public AcceptancePaper readAcceptancePaperByIDAcceptance(int id_acceptance, String address) throws SQLException, ClassNotFoundException {
        AcceptancePaper paper = null;
        ResultSet resultSet = null;
        Connection connect = connectDB.getConnection();
        String query = "SELECT paperFile FROM paperacceptance where id_acceptance = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        resultSet = statement.executeQuery();
        connectDB.closeConnection();
        return paper;
    }

    @Override
    public void deleteAcceptancePaperByIDAcceptance(int id_acceptance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
