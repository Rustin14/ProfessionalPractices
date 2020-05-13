package dataAccess;

public interface IMonthlyReportDAO {

    public void saveMonthlyReportByIDMonthly(int id_monthly);
    public void readMonthlyReportByIDMonthly(int id_monthly);
    public void deleteMonthlyReportByIDMonthly(int id_monthly);
}
