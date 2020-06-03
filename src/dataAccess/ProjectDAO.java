/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ProjectDAO
Date of creation: April 30th. 2020
*/
package dataAccess;
import Domain.Project;
import InterfacesDAO.IProjectDAO;

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

public class ProjectDAO implements IProjectDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;

    public ProjectDAO () {
        connectDB = new ConnectDB();
    }

    @Override
    public void saveProject(int id_project, String name, float duration, String general_purpose, String general_description,
                            int id_company, String chargeResponsable, String nameResponsable, String emailResponsable) {

        try (Connection connect = connectDB.getConnection()){
            String query = "INSERT INTO project (id_project, name, duration, general_purpose, general_description, " +
                    "id_company, charge_responsable, name_responsable, email_responsable) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_project);
            statement.setString(2, name);
            statement.setFloat(3, duration);
            statement.setString(4, general_purpose);
            statement.setString(5, general_description);
            statement.setInt(6, id_company);
            statement.setString(7, chargeResponsable);
            statement.setString(8, nameResponsable);
            statement.setString(9, emailResponsable);
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
    }

    @Override
    public Project searchProjectByIDProject(int id_project) {
        Project project = null;
        try (Connection connection = connectDB.getConnection()) {
            String query = "SELECT id_project, name FROM project WHERE id_project = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt (1, id_project);
            statement.executeQuery();
            while (results.next()) {
                project = new Project();
                project.setId_project(results.getInt("id_project"));
                project.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(CoordinatorDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return project;
    }

    @Override
    public Project searchProjectByKeyword(String keyword) {
        Project project = null;
        try (Connection connection = connectDB.getConnection()) {
            String query = "SELECT id_project, name FROM project WHERE name LIKE %{?}%";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, keyword);
            statement.executeQuery();
            while (results.next()) {
                project = new Project();
                project.setId_project(results.getInt("id_project"));
                project.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return project;
    }

    @Override
    public void deleteProjectByIDProject(int id_project) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = connectDB.getConnection();
            String query = "START TRANSACTION; DELETE FROM project WHERE id_project = ?";
            sentence = connect.prepareStatement(query);
            sentence.setInt(1, id_project);
            results = sentence.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, exc);
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
    public List<Project> returnAllProjects() {
        List<Project> allProjects = new ArrayList();
        Project project = null;
        try (Connection connection = connectDB.getConnection()) {
            String query = "SELECT id_project, name FROM project";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeQuery();
            while(results.next()) {
                project = new Project();
                project.setId_project(results.getInt("id_project"));
                project.setName(results.getString("name"));
                allProjects.add(project);
            }
        } catch (SQLException exc) {
            Logger.getLogger(ProjectDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return allProjects;
    }
}
