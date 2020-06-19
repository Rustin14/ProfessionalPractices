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
    public void saveProfessor(String id_person, String name, String shift,String cubicle, String staff_number
            ,String email, String password) throws SQLException, ClassNotFoundException {
        Connection connect = connectDB.getConnection();
        String query = "INSERT INTO professor (id_person, name, cubicle, staff_number) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setString(1, id_person);
        statement.setString(2, name);
        statement.setString(3, shift);
        statement.setString(4, cubicle);
        statement.setString(5, staff_number);
        statement.setString(6, email);
        statement.setString(7, password);
        statement.executeQuery();
        connectDB.closeConnection();
    }

    @Override
    public Professor searchProfessorByIDPerson(int id_person) throws SQLException, ClassNotFoundException {
        Professor professor = null;
        Connection connect = connectDB.getConnection();
        String query = "SELECT id_person, name FROM professor where id_person = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setInt(1, id_person);
        results = statement.executeQuery();
        while (results.next()) {
            professor = new Professor();
            professor.setId_person(results.getInt("id_person"));
            professor.setName(results.getString("name"));
            connectDB.closeConnection();
        }
        return professor;
    }

    @Override
    public Professor searchProfessorByKeyword(String keyword) throws SQLException, ClassNotFoundException {
        Professor professor = null;
        Connection connect = connectDB.getConnection();
        String query = "SELECT id_person, name FROM professor where name LIKE %{?}%";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setString(1, keyword);
        results = statement.executeQuery();
        while (results.next()) {
            professor = new Professor();
            professor.setId_person(results.getInt("id_person"));
            professor.setName(results.getString("name"));
        }
        connectDB.closeConnection();
        return professor;
    }

    @Override
    public void deleteProfessorByIDPerson(int id_person, boolean userAnswer) throws SQLException, ClassNotFoundException {
        Connection connect = null;
        PreparedStatement sentence = null;
        connect = connectDB.getConnection();
        String query = "START TRANSACTION; DELETE FROM professor WHERE id_person = ?";
        sentence = connect.prepareStatement(query);
        sentence.setInt(1, id_person);
        results = sentence.executeQuery();
        if (userAnswer) {
                sentence = connect.prepareStatement("COMMIT");
                sentence.executeQuery();
                connectDB.closeConnection();
            } else {
                sentence = connect.prepareStatement("ROLLBACK");
                sentence.executeQuery();
                connectDB.closeConnection();
        }
    }

    @Override
    public List<Professor> returnAllProfessors() throws SQLException, ClassNotFoundException {
        List<Professor> allProfessors = new ArrayList();
        Professor professor = null;
        connection = connectDB.getConnection();
        consultation = connection.createStatement();
        results = consultation.executeQuery("SELECT * FROM professor");
        while (results.next()) {
            professor = new Professor();
            professor.setId_person(results.getInt("id_person"));
            professor.setName(results.getString("name"));
            professor.setShift(results.getString("Shift"));
            professor.setCubicle(results.getString("cubicle"));
            professor.setStaff_number(results.getString("staff_number"));
            professor.setEmail(results.getString("email"));
            professor.setPassword(results.getString("password"));
            allProfessors.add(professor);
        }
        connectDB.closeConnection();
        return allProfessors;
    }
}

