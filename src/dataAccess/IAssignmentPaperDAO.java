package dataAccess;

public interface IAssignmentPaperDAO {

    public void saveAssignmentPaper(int id_assignment, int id_coordinator, int id_practicing, int id_project, byte[] paperFile, String address);
    public void readAssignmentPaperByIDAssignment (int id_assignment);
    public void deleteAssignmentPaperByIDAssignment (int id_assignment);
}
