/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: AssignmentPaperDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import Domain.AssignmentPaper;
import InterfacesDAO.IAssignmentPaperDAO;

import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AssignmentPaperDAO implements IAssignmentPaperDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;


    @Override
    public void saveAssignmentPaper(int id_assignment, int id_coordinator, int id_practicing, int id_project, byte[] paperFile, String address) throws SQLException, ClassNotFoundException {
        Connection connect = connectDB.getConnection();
        String query = "INSERT INTO assignmentpaper  (id_assignment, id_coordinator, id_practicing, id_project, paperFile) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = connect.prepareStatement(query);
        statement.setInt(1, id_assignment);
        statement.setInt(2, id_coordinator);
        statement.setInt(3, id_practicing);
        statement.setInt(4, id_project);
        statement.executeQuery();
        connectDB.closeConnection();
        
    }

    @Override
    public AssignmentPaper readAssignmentPaperByIDAssignment(int id_assignment, String address) throws SQLException, ClassNotFoundException {
        AssignmentPaper paper = null;
        ResultSet resultSet = null;
        Connection connect = connectDB.getConnection();
        String query = "SELECT paperFile FROM assignmentpaper where id_assignment = ?";
        PreparedStatement statement = connect.prepareStatement(query);
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            paper = new AssignmentPaper();
            paper.setId_assignment(resultSet.getInt("id_assignment"));
        }
        connectDB.closeConnection();
        return paper;
    }

    @Override
    public void deleteAssignmentPaperByIDAssignment(int id_assignment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
