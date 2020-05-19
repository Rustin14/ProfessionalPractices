package InterfacesDAO;

import Domain.AssignmentPaper;

public interface IAssignmentPaperDAO {

    public void saveAssignmentPaper(int id_assignment, int id_coordinator, int id_practicing, int id_project, byte[] paperFile, String address);
    public AssignmentPaper readAssignmentPaperByIDAssignment (int id_assignment, String address);
    public void deleteAssignmentPaperByIDAssignment (int id_assignment);
}
