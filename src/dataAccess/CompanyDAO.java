/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: CompanyDAO
Date of creation: April 29th. 2020
*/
package dataAccess;
import Domain.Company;
import InterfacesDAO.ICompanyDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompanyDAO implements ICompanyDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;

    public CompanyDAO () {
        connectDB = new ConnectDB();
    }


    @Override
    public void saveCompany(int id_company, String name, String address, String email, String state,
                            String phoneNumber, Company.myEnum sector,
                            String city, int id_coordinator, int id_course) {
        try (Connection connect = connectDB.getConnection()){
            String query = "INSERT INTO company (id_company, name, address, email, " +
                    "state, phoneNumber, sector, city, id_coordinator, id_course) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_company);
            statement.setString(2, name);
            statement.setString(3, address);
            statement.setString(4, email);
            statement.setString(5, state);
            statement.setString(6, phoneNumber);
            statement.setString(7, String.valueOf(sector));
            statement.setString(8, city);
            statement.setInt(9, id_coordinator);
            statement.setInt(10, id_course);
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
    }

    @Override
    public Company searchCompanyByIDCompany(int id_company) {
        Company company = null;
        try (Connection connection = connectDB.getConnection()) {
            String query = "SELECT id_company, name FROM company where id_company = ?";
             PreparedStatement statement = connection.prepareStatement(query);
             statement.setInt(1, id_company);
             statement.executeQuery();
             while (results.next()) {
                 company = new Company();
                 company.setName(results.getString("name"));
                 company.setId_company(results.getInt("id_company"));
             }
        } catch (SQLException exc) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return company;
    }

    @Override
    public Company searchCompanyByKeyword(String keyword) {
        Company company = null;
        try (Connection connection = connectDB.getConnection()) {
            String query = "SELECT id_company, name FROM company where name LIKE %{?}%";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, keyword);
            statement.executeQuery();
            while (results.next()) {
                company = new Company();
                company.setId_company(results.getInt("id_company"));
                company.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return company;
    }

    @Override
    public void deleteCompanyByIDCompany(int id_company) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = connectDB.getConnection();
            String query = "START TRANSACTION; DELETE FROM company WHERE id_company = ?";
            sentence = connect.prepareStatement(query);
            sentence.setInt(1, id_company);
            results = sentence.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        boolean userAnswer = true;
        if (userAnswer) {
            try {
                sentence = connect.prepareStatement("COMMIT");
                sentence.executeQuery();
            } catch (SQLException exc) {
                Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
            } finally {
                connectDB.closeConnection();
            }
        } else {
            try {
                sentence = connect.prepareStatement("ROLLBACK");
                sentence.executeQuery();
            } catch (SQLException exc) {
                Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
            } finally {
                connectDB.closeConnection();
            }
        }
    }

    @Override
    public List<Company> returnAllCompanies() {
        List<Company> allCompanies = new ArrayList();
        Company company = null;
        try {
            connection = connectDB.getConnection();
            consultation = connection.createStatement();
            results = consultation.executeQuery("SELECT id_company, name FROM company");
            while (results.next()) {
                company = new Company();
                company.setId_company(results.getInt("id_company"));
                company.setName(results.getString("name"));
                allCompanies.add(company);
            }
        } catch (SQLException exc) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return allCompanies;
    }
}

