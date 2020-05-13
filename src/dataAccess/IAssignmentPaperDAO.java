package dataAccess;

public interface IAssignmentPaperDAO {

    public void saveAssignmentPaperByIDAssignment (int id_assignment);
    public void readAssignmentPaperByIDAssignment (int id_assignment);
    public void deleteAssignmentPaperByIDAssignment (int id_assignment);
}
