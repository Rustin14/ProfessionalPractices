package InterfacesDAO;

import Domain.MonthlyReport;

import java.sql.Date;

public interface IMonthlyReportDAO {

    public void saveMonthlyReportByIDMonthly(int id_monthly, int monthNumber, int score, String observations, Date dueDate, byte[] paperFile, int id_practicing, String address);
    public MonthlyReport readMonthlyReportByIDMonthly(int id_monthly, String address);
    public void deleteMonthlyReportByIDMonthly(int id_monthly);
}
