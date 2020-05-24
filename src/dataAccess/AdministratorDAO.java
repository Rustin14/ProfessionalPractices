/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: AdministratorDAO
Date of creation: May 23rd. 2020
*/
package dataAccess;

import Domain.Administrator;
import InterfacesDAO.IAdministratorDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministratorDAO implements IAdministratorDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;

    public AdministratorDAO() {
        connectDB = new ConnectDB();
    }

    @Override
    public void saveAdministrator(int id_administrator, String name, String email, String password) {
        try (Connection connect = connectDB.getConnection()){
            String query = "INSERT INTO administrator (id_administrator, name, email, password) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_administrator);
            statement.setString(2, name);
            statement.setString(3, email);
            statement.setString(4, password);
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    @Override
    public Administrator readAdministrator(int id_administrator) {
        Administrator administrator = null;
        try (Connection connection = connectDB.getConnection()){
            String query = "SELECT id_administrator, name FROM administrator where id_administrator = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id_administrator);
            statement.executeQuery();
            while (results.next()) {
                administrator = new Administrator();
                administrator.setId_administrator(results.getInt("id_administrator"));
                administrator.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        return administrator;
    }

    @Override
    public void deleteAdministrator(int id_administrator) {
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = connectDB.getConnection();
            String query = "START TRANSACTION; DELETE FROM administrator WHERE id_administrator = ?";
            sentence = connect.prepareStatement(query);
            sentence.setInt(1, id_administrator);
            results = sentence.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(AdministratorDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        boolean userAnswer = true;
        if (userAnswer) {
            try {
                sentence = connect.prepareStatement("COMMIT");
                sentence.executeQuery();
            } catch (SQLException exc) {
                Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        } else {
            try {
                sentence = connect.prepareStatement("ROLLBACK");
                sentence.executeQuery();
            } catch (SQLException exc) {
                Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
    }

    @Override
    public List<Administrator> returnAllAdministrators() {
        List<Administrator> AllAdministrators = new ArrayList();
        Administrator administrator = null;
        try {
            Connection connection = connectDB.getConnection();
            consultation = connection.createStatement();
            results = consultation.executeQuery("SELECT id_administrator, name FROM administrator");
            while (results.next()) {
                administrator = new Administrator();
                administrator.setId_administrator(results.getInt("id_administrator"));
                administrator.setName(results.getString("name"));
                AllAdministrators.add(administrator);
            }
        } catch (SQLException exc) {
            Logger.getLogger(CoordinatorDAO.class.getName()).log(Level.SEVERE, null, exc);

        } finally {
            connectDB.closeConnection();
        }
        return AllAdministrators;
    }
}
