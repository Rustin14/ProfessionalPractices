/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: AssignmentPaperDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AssignmentPaperDAO implements IAssignmentPaperDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;


    @Override
    public void saveAssignmentPaperByIDAssignment(int id_assignment) {
        throw new UnsupportedOperationException("Not supported yet.");
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
