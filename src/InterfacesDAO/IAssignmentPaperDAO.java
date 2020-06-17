package InterfacesDAO;

import Domain.AssignmentPaper;
import java.sql.SQLException;

public interface IAssignmentPaperDAO {

    public void saveAssignmentPaper(int id_assignment, int id_coordinator, int id_practicing, int id_project, byte[] paperFile, String address) throws SQLException, ClassNotFoundException;
    public AssignmentPaper readAssignmentPaperByIDAssignment (int id_assignment, String address) throws SQLException, ClassNotFoundException;
    public void deleteAssignmentPaperByIDAssignment (int id_assignment) throws SQLException, ClassNotFoundException;
}
