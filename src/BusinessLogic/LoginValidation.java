package BusinessLogic;

import Domain.Coordinator;
import Domain.Practicing;
import Domain.Professor;
import dataAccess.CoordinatorDAO;
import dataAccess.PracticingDAO;
import dataAccess.ProfessorDAO;

import java.util.ArrayList;
import java.util.List;

public class LoginValidation {
    public Object validateLoginEmail (String email) {
        if (loginProfessor(email)) {
            return new Professor();
        } else if (loginCoordinator(email)) {
            return new Coordinator();
        }
        /*else if (loginPracticing(email)) {
            return new Practicing();
        }*/
        return null;
    }

    public boolean loginProfessor(String email) {
        ProfessorDAO professorDAO = new ProfessorDAO();
        List<Professor> allProfessors = new ArrayList();
        allProfessors = professorDAO.returnAllProfessors();
        int i = 0;
        boolean flag = false;
        while (i < allProfessors.size() && !flag) {
            if ((allProfessors.get(i)).getEmail().equals(email)) {
                flag = true;
            }
        }
        return flag;
    }

    public boolean loginCoordinator(String email) {
        CoordinatorDAO coordinatorDAO = new CoordinatorDAO();
        List<Coordinator> allCoordinators = new ArrayList();
        allCoordinators = coordinatorDAO.returnAllCoordinators();
        int i = 0;
        boolean flag = false;
        while (i < allCoordinators.size() && !flag) {
            if ((allCoordinators.get(i)).getEmail().equals(email)) {
                flag = true;
            }
        }
        return flag;
    }

    public boolean loginPracticing(String email) {
        PracticingDAO practicingDAO = new PracticingDAO();
        List<Practicing> allPracticing = new ArrayList();
        allPracticing = practicingDAO.returnAllPracticing();
        int i = 0;
        boolean flag = false;
        while (i < allPracticing.size() && !flag) {
            if ((allPracticing.get(i).getEmail().equals(email))) {
                flag = true;
            }
        }
        return flag;
    }

}
