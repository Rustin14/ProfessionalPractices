package InterfacesDAO;

import Domain.MonthlyReport;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IMonthlyReportDAO {

    public void saveMonthlyReportByIDMonthly(int id_monthly, int monthNumber, int score, String observations, Date dueDate, int id_practicing, String address) throws SQLException, ClassNotFoundException;
    public MonthlyReport readMonthlyReportByIDMonthly(int id_monthly, String address) throws SQLException, ClassNotFoundException;
    public void deleteMonthlyReportByIDMonthly(int id_monthly) throws SQLException, ClassNotFoundException;
    public ArrayList<MonthlyReport> ReadAllMonthlyReports() throws SQLException, ClassNotFoundException;
}
