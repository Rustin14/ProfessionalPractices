package dataAccess;

public interface IPartialReportDAO {
    public void savePartialReportByIDPartial(int id_partial);
    public void readPartialReportByIDPartial (int id_partial);
    public void deletePartialReportByIDPartial (int id_partial);
}
