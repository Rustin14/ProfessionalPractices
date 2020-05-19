/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ProfessorDAO
Date of creation: April 28th. 2020
*/
package dataAccess;
import Domain.Professor;
import InterfacesDAO.IProfessorDAO;

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

public class ProfessorDAO implements IProfessorDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;

    public ProfessorDAO() {
        connectDB = new ConnectDB();
    }

    @Override
    public void saveProfessor(int id_person, String name, int cubicle, String staff_number) {
        try (Connection connect = connectDB.getConnection()){
            String query = "INSERT INTO professor (id_person, name, cubicle, staff_number) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_person);
            statement.setString(2, name);
            statement.setInt(4, cubicle);
            statement.setString(4, staff_number);
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    @Override
    public Professor searchProfessorByIDPerson(int id_person) {
        Professor professor = null;
        try (Connection connect = connectDB.getConnection()) {
            String query = "SELECT id_person, name FROM professor where id_person = ?";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_person);
            results = statement.executeQuery();
            while (results.next()) {
                professor = new Professor();
                professor.setId_person(results.getInt("id_person"));
                professor.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return professor;
    }

    @Override
    public Professor searchProfessorByKeyword(String keyword) {
        Professor professor = null;
        try (Connection connect = connectDB.getConnection()) {
            String query = "SELECT id_person, name FROM professor where name LIKE %{?}%";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setString(1, keyword);
            results = statement.executeQuery();
            while (results.next()) {
                professor = new Professor();
                professor.setId_person(results.getInt("id_person"));
                professor.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return professor;
    }

    @Override
    public void deleteProfessorByIDPerson(int id_person) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = connectDB.getConnection();
            String query = "START TRANSACTION; DELETE FROM professor WHERE id_person = ?";
            sentence = connect.prepareStatement(query);
            sentence.setInt(1, id_person);
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
    public List<Professor> returnAllProfessors() {
        List<Professor> allProfessors = new ArrayList();
        Professor professor = null;
        try {
            connection = connectDB.getConnection();
            consultation = connection.createStatement();
            results = consultation.executeQuery("SELECT * FROM professor");
            while (results.next()) {
                professor = new Professor();
                professor.setId_person(results.getInt("id_person"));
                professor.setName(results.getString("name"));
                professor.setCubicle(results.getInt("cubicle"));
                professor.setStaff_number(results.getString("staff_number"));
                professor.setEmail(results.getString("email"));
                professor.setPassword(results.getString("password"));
                allProfessors.add(professor);
            }
        } catch (SQLException exc) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return allProfessors;
    }
}

