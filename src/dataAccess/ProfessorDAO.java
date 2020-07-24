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
    public void saveProfessor(String id_person, String name, String cubicle, String staff_number,
            String email, String password, String shift, String status) throws SQLException, ClassNotFoundException {
                    Connection connect = connectDB.getConnection();
                    String query = "INSERT INTO professor (id_person, name, cubicle, staff_number,"
                            + "email, password, shift, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                                    PreparedStatement statement = connect.prepareStatement(query);
                                    statement.setString(1, id_person);
                                    statement.setString(2, name);
                                    statement.setString(3, cubicle);
                                    statement.setString(4, staff_number);
                                    statement.setString(5, email);
                                    statement.setString(6, password);
                                    statement.setString(7, shift);
                                    statement.setString(8, status);
                                    statement.executeUpdate();
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
            professor.setId_person(results.getString("id_person"));
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
            professor.setId_person(results.getString("id_person"));
            professor.setName(results.getString("name"));
        }
        connectDB.closeConnection();
        return professor;
    }

    @Override
    public void deleteProfessorByIDPerson(String id_person) throws SQLException, ClassNotFoundException {
        Connection connect = null;
        connect = connectDB.getConnection();
        String query = "UPDATE professor SET status = 'Inactivo' WHERE id_person = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setString(1, id_person);
        statement.executeUpdate();
        connectDB.closeConnection();
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
            professor.setId_person(results.getString("id_person"));
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
    
    public ArrayList<Professor> getProfessors(String status) throws SQLException, ClassNotFoundException{
        ArrayList<Professor> activeProfessors = new ArrayList<>();
        Professor professor = null;
        connection = connectDB.getConnection();
        consultation = connection.createStatement();
        results = consultation.executeQuery("SELECT * FROM professor WHERE status = 'Activo'");
        while (results.next()) {
            professor = new Professor();
            professor.setId_person(results.getString("id_person"));
            professor.setName(results.getString("name"));
            professor.setShift(results.getString("Shift"));
            professor.setCubicle(results.getString("cubicle"));
            professor.setStaff_number(results.getString("staff_number"));
            professor.setEmail(results.getString("email"));
            professor.setPassword(results.getString("password"));
            activeProfessors.add(professor);
        }
        connectDB.closeConnection();
        return activeProfessors;
    }
    
    public Professor getProfessor(String nameProfessor)throws SQLException, ClassNotFoundException{
        Professor professor = null;
        Connection connect = connectDB.getConnection();
        String query = "SELECT * FROM professor where name = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setString(1, nameProfessor);
        results = statement.executeQuery();
        while (results.next()) {
            professor = new Professor();
            professor.setId_person(results.getString("id_person"));
            professor.setName(results.getString("name"));
            professor.setShift(results.getString("Shift"));
            professor.setCubicle(results.getString("cubicle"));
            professor.setStaff_number(results.getString("staff_number"));
            professor.setEmail(results.getString("email"));
            professor.setId_person(results.getString("id_person"));
        }
        connectDB.closeConnection();
        return professor;
    }
}

