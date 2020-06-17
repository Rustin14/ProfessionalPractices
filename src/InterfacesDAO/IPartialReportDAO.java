package InterfacesDAO;

import Domain.PartialReport;
import java.sql.SQLException;

public interface IPartialReportDAO {
    public void savePartialReport(int id_partial, int partialNumber, int score, String observations, java.sql.Date dueDate, int id_practicing, String address) throws SQLException, ClassNotFoundException;
    public PartialReport readPartialReportByIDPartial (int id_partial, String address) throws SQLException, ClassNotFoundException;
    public void deletePartialReportByIDPartial (int id_partial) throws SQLException, ClassNotFoundException;
}
