/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: PersonDAO
Date of creation: April 22nd. 2020
*/

package dataAccess;
import Domain.Person;
import InterfacesDAO.IPersonDAO;

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

public class PersonDAO implements IPersonDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;


    public PersonDAO() {
        connectDB = new ConnectDB();
    }

    public Person searchPersonbyID (int id_person) {
        Person person = null;
        try (Connection connect = connectDB.getConnection()){
            String query = "SELECT id_person, name FROM person WHERE id_person = ?";
            PreparedStatement sentencia = connect.prepareStatement(query);
            sentencia.setInt(1, id_person);
            results = sentencia.executeQuery();
            while (results.next()){
                person = new Person();
                person.setId_person(results.getInt("id_person"));
                person.setName(results.getString("name"));
            }
        } catch (SQLException exc){
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return person;
    }

    public Person searchPersonByKeyword (String keyword) {
        Person person = null;
        try (Connection connect = connectDB.getConnection()) {
            String query = "SELECT id_person, name FROM person WHERE name LIKE %{?}%";
            PreparedStatement sentence = connect.prepareStatement(query);
            sentence.setString(1, keyword);
            results = sentence.executeQuery();
            while (results.next()) {
                person = new Person();
                person.setId_person(results.getInt("id_person"));
                person.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return person;
    }

    public void deletePersonByIDPerson (int id_person) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = connectDB.getConnection();
            String query = "START TRANSACTION; DELETE FROM person WHERE id_person = ?";
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

    public List<Person> returnAllPerson() {
        List<Person> allPerson = new ArrayList();
        Person person = null;
        try {
            connection = connectDB.getConnection();
            consultation = connection.createStatement();
            results = consultation.executeQuery("select id_person, name from person");
            while (results.next()){
                person = new Person();
                person.setId_person(results.getInt("id_person"));
                person.setName(results.getString("name"));
                allPerson.add(person);
            }

        } catch (SQLException exc) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, exc);
        }  finally {
            connectDB.closeConnection();
        }
        return allPerson;
    }
}




