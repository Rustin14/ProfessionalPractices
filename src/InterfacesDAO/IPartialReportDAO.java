package InterfacesDAO;

import Domain.PartialReport;

public interface IPartialReportDAO {
    public void savePartialReport(int id_partial, int partialNumber, int score, String observations, java.sql.Date dueDate, byte[] paperFile, int id_practicing, String address);
    public PartialReport readPartialReportByIDPartial (int id_partial, String address);
    public void deletePartialReportByIDPartial (int id_partial);
}
