/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: CoordinatorDAO
Date of creation: May 7th. 2020
*/
package dataAccess;

import Domain.Coordinator;
import InterfacesDAO.ICoordinatorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CoordinatorDAO implements ICoordinatorDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;

    public CoordinatorDAO () {
        connectDB = new ConnectDB();
    }


    @Override
    public void saveCoordinator(String id_person, String name, String cubicle, String staff_number, String email,
            String password, String status) throws SQLException, ClassNotFoundException{
                    Connection connect = connectDB.getConnection();
                    String query = "INSERT INTO coordinator (id_person, name, cubicle, staff_number,"
                        + "email, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement statement = connect.prepareStatement(query);
                                statement.setString(1, id_person);
                                statement.setString(2, name);
                                statement.setString(3, cubicle);
                                statement.setString(4, staff_number);
                                statement.setString(5, email);
                                statement.setString(6, password);
                                statement.setString(7, status);
                                statement.executeQuery();
                                connectDB.closeConnection();
    }

    @Override
    public Coordinator searchCoordinatorByIDPerson(int id_person) throws SQLException, ClassNotFoundException {
        Coordinator coordinator = null;
        Connection connection = connectDB.getConnection();
        String query = "SELECT id_person, name FROM coordinator where id_person = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id_person);
        statement.executeQuery();
        while (results.next()) {
            coordinator = new Coordinator();
            coordinator.setId_person(results.getString("id_person"));
            coordinator.setName(results.getString("name"));
        }
        connectDB.closeConnection();
        return coordinator;
    }

    @Override
    public Coordinator searchCoordinatorByKeyword(String keyword) throws SQLException, ClassNotFoundException {
        Coordinator coordinator = null;
        Connection connection = connectDB.getConnection();
        String query = "SELECT id_person, name FROM coordinator where name LIKE %{?}%";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, keyword);
        statement.executeQuery();
        while (results.next()) {
            coordinator = new Coordinator();
            coordinator.setId_person(results.getString("id_person"));
            coordinator.setName(results.getString("name"));
        }
        connectDB.closeConnection();
        return coordinator;
    }

    @Override
    public void deleteCoordinatorByIDPerson(String id_person) throws SQLException, ClassNotFoundException {
        Connection connect = null;
        connect = connectDB.getConnection();
        String query = "UPDATE coordinator SET status = 'Inactivo' WHERE id_person = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setString(1, id_person);
        statement.executeUpdate();
        connectDB.closeConnection();
    }

    @Override
    public List<Coordinator> returnAllCoordinators() throws SQLException, ClassNotFoundException {
        List<Coordinator> AllCoordinators = new ArrayList();
        Coordinator coordinator = null;
        Connection connection = connectDB.getConnection();
        consultation = connection.createStatement();
        results = consultation.executeQuery("SELECT * FROM coordinator");
        while (results.next()) {
            coordinator = new Coordinator();
            coordinator.setId_person(results.getString("id_person"));
            coordinator.setName(results.getString("name"));
            coordinator.setCubicle(results.getString("cubicle"));
            coordinator.setStaff_number(results.getString("staff_number"));
            coordinator.setEmail(results.getString("email"));
            coordinator.setPassword(results.getString("password"));
            AllCoordinators.add(coordinator);
        }
        connectDB.closeConnection();
        return AllCoordinators;
    }
    
    @Override
    public Coordinator getCoordinator (String status) throws SQLException, ClassNotFoundException{ 
         Coordinator coordinator = null;
        Connection connection = connectDB.getConnection();
        String query = "SELECT * FROM coordinator where status = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, status);
        results = statement.executeQuery();
        while (results.next()) {
            coordinator = new Coordinator();
            coordinator.setName(results.getString("name"));
            coordinator.setCubicle(results.getString("cubicle"));
            coordinator.setEmail(results.getString("email"));
            coordinator.setStaff_number(results.getString("staff_number"));
            coordinator.setId_person(results.getString("id_person"));
        }
        connectDB.closeConnection();
        return coordinator;
    }
}
