package dataAccess;

import Domain.Activity;
import Domain.Administrator;
import Domain.Project;
import InterfacesDAO.IActivityDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActivityDAO implements IActivityDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;

    public ActivityDAO () {
        connectDB = new ConnectDB();
    }

    @Override
    public void saveActivity(int id_activity, String name, int id_practicing) {
        try (Connection connect = connectDB.getConnection()){
            String query = "INSERT INTO activity (id_activity, name, id_practicing) VALUES (?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_activity);
            statement.setString(2, name);
            statement.setInt(3, id_practicing);
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(ActivityDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    @Override
    public Activity readActivityByIDActivity(int id_activity) {
        Activity activity = null;
        try (Connection connection = connectDB.getConnection()){
            String query = "SELECT id_activity, name FROM activity where id_activity = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id_activity);
            statement.executeQuery();
            while (results.next()) {
                activity = new Activity();
                activity.setId_activity(results.getInt("id_activity"));
                activity.setName(results.getString("name"));
            }
        } catch (SQLException exc) {
            Logger.getLogger(ActivityDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return activity;
    }

    @Override
    public void deleteActivity(int id_activity) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = connectDB.getConnection();
            String query = "START TRANSACTION; DELETE FROM activity WHERE id_activity = ?";
            sentence = connect.prepareStatement(query);
            sentence.setInt(1, id_activity);
            results = sentence.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(ActivityDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        boolean userAnswer = true;
        if (userAnswer) {
            try {
                sentence = connect.prepareStatement("COMMIT");
                sentence.executeQuery();
            } catch (SQLException exc) {
                Logger.getLogger(ActivityDAO.class.getName()).log(Level.SEVERE, null, exc);
            } finally {
                connectDB.closeConnection();
            }
        } else {
            try {
                sentence = connect.prepareStatement("ROLLBACK");
                sentence.executeQuery();
            } catch (SQLException exc) {
                Logger.getLogger(ActivityDAO.class.getName()).log(Level.SEVERE, null, exc);
            } finally {
                connectDB.closeConnection();
            }
        }
    }

    @Override
    public List<Activity> returnAllActivities() {
        List<Activity> allActivities = new ArrayList();
        Activity activity = null;
        try (Connection connection = connectDB.getConnection()) {
            String query = "SELECT id_activity, name FROM activity";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeQuery();
            while(results.next()) {
                activity = new Activity();
                activity.setId_activity(results.getInt("id_activity"));
                activity.setName(results.getString("name"));
                activity.setId_practicing(results.getInt("id_practicing"));
                allActivities.add(activity);
            }
        } catch (SQLException exc) {
            Logger.getLogger(ActivityDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return allActivities;
    }
}
