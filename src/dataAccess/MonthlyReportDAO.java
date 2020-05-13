/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: MonthlyReportDAO
Date of creation: May 8th. 2020
*/
package dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MonthlyReportDAO implements IMonthlyReportDAO{
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;


    @Override
    public void saveMonthlyReportByIDMonthly(int id_monthly) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void readMonthlyReportByIDMonthly(int id_monthly) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteMonthlyReportByIDMonthly(int id_monthly) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
