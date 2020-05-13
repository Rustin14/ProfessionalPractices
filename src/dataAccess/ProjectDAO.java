/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ProjectDAO
Date of creation: April 30th. 2020
*/
package dataAccess;
import Domain.Project;
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

public class ProjectDAO implements IProjectDAO{
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;

    public ProjectDAO () {
        connectDB = new ConnectDB();
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
        String flag = null;
        while (flag.equals("Y") || flag.equals("N")) {
            System.out.println("Are you sure you want to erase this data? Y/N");
            flag = sc.nextLine();
            if (flag.equals("Y")) {
                try {
                    sentence = connect.prepareStatement("COMMIT");
                    sentence.executeQuery();
                } catch (SQLException exc) {
                    System.out.println("The operation couldn't be completed.");
                }
            } else if (flag.equals("N")) {
                try {
                    sentence = connect.prepareStatement("ROLLBACK");
                    sentence.executeQuery();
                } catch (SQLException exc) {
                    System.out.println("The operation couldn't be completed.");
                }
            } else {
                System.out.println("Answer not valid. Try again.");
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
        }
        return allProjects;
    }
}
