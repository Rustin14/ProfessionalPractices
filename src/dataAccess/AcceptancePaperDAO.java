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


    @Override
    public void saveAcceptancePaper(int id_acceptance, int id_practicing, int id_project, int id_company, byte[] paperFile, String address) {
        try (Connection connect = connectDB.getConnection()) {
            String query = "INSERT INTO acceptancepaper  (id_acceptance, id_practicing, id_project, id_company, paperFile) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_acceptance);
            statement.setInt(2, id_practicing);
            statement.setInt(3, id_project);
            statement.setInt(4, id_company);
            try {
                InputStream inputStream = new FileInputStream(new File(address));
                statement.setBlob(5, inputStream);
            } catch (FileNotFoundException exc) {
                Logger.getLogger(AcceptancePaperDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(AcceptancePaperDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
    }

    @Override
    public AcceptancePaper readAcceptancePaperByIDAcceptance(int id_acceptance, String address) {
        AcceptancePaper paper = null;
        ResultSet resultSet = null;
        try (Connection connect = connectDB.getConnection()) {
            String query = "SELECT paperFile FROM paperacceptance where id_acceptance = ?";
            PreparedStatement statement = connect.prepareStatement(query);
            resultSet = statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(AcceptancePaperDAO.class.getName()).log(Level.SEVERE, null, exc);
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
            Logger.getLogger(AcceptancePaperDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return paper;
    }

    @Override
    public void deleteAcceptancePaperByIDAcceptance(int id_acceptance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
