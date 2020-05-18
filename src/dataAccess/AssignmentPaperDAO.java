/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: AssignmentPaperDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AssignmentPaperDAO implements IAssignmentPaperDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;


    @Override
    public void saveAssignmentPaper(int id_assignment, int id_coordinator, int id_practicing, int id_project, byte[] paperFile, String address) {
        try (Connection connect = connectDB.getConnection()) {
            String query = "INSERT INTO assignmentpaper  (id_assignment, id_coordinator, id_practicing, id_project, paperFile) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connect.prepareStatement(query);
            statement.setInt(1, id_assignment);
            statement.setInt(2, id_coordinator);
            statement.setInt(3, id_practicing);
            statement.setInt(4, id_project);
            try {
                InputStream inputStream = new FileInputStream(new File(address));
                statement.setBlob(5, inputStream);
            } catch (FileNotFoundException exc) {
                Logger.getLogger(AssignmentPaperDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
            statement.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(AssignmentPaperDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    @Override
    public void readAssignmentPaperByIDAssignment(int id_assignment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAssignmentPaperByIDAssignment(int id_assignment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
