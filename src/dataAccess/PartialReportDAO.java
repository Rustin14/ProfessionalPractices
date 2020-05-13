/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: PartialReportDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PartialReportDAO implements IPartialReportDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;


    @Override
    public void savePartialReportByIDPartial(int id_partial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void readPartialReportByIDPartial(int id_partial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deletePartialReportByIDPartial(int id_partial) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
