package BusinessLogic;

import Domain.Administrator;
import Domain.Coordinator;
import Domain.Practicing;
import Domain.Professor;
import dataAccess.AdministratorDAO;
import dataAccess.CoordinatorDAO;
import dataAccess.PracticingDAO;
import dataAccess.ProfessorDAO;


import java.util.ArrayList;
import java.util.List;

public class LoginValidation {
    public Object validateLoginEmail (String email, String password) {
        if (loginProfessor(email, password)) {
            return new Professor();
        } else if (loginCoordinator(email, password)) {
            return new Coordinator();
        }
        else if (loginPracticing(email, password)) {
            return new Practicing();
        }
        return null;
    }

    public boolean loginProfessor(String email, String password) {
        ProfessorDAO professorDAO = new ProfessorDAO();
        List<Professor> allProfessors = professorDAO.returnAllProfessors();
        int i = 0;
        boolean flag = false;
        while (i < allProfessors.size()) {
            if ((allProfessors.get(i)).getEmail().equals(email) && (allProfessors.get(i).getPassword().equals(password))) {
                flag = true;
            }
            i++;
        }
        return flag;
    }

    public boolean loginCoordinator(String email, String password) {
        CoordinatorDAO coordinatorDAO = new CoordinatorDAO();
        List<Coordinator> allCoordinators = new ArrayList();
        allCoordinators = coordinatorDAO.returnAllCoordinators();
        int i = 0;
        boolean flag = false;
        while (i < allCoordinators.size()) {
            if ((allCoordinators.get(i)).getEmail().equals(email) && (allCoordinators.get(i).getPassword().equals(password))) {
                flag = true;
            }
            i++;
        }
        return flag;
    }

    public boolean loginPracticing(String email, String password) {
        PracticingDAO practicingDAO = new PracticingDAO();
        List<Practicing> allPracticing = new ArrayList();
        allPracticing = practicingDAO.returnAllPracticing();
        int i = 0;
        boolean flag = false;
        while (i < allPracticing.size() && !flag) {
            if ((allPracticing.get(i).getEmail().equals(email)) && (allPracticing.get(i).getPassword().equals(password))) {
                flag = true;
            }
        }
        return flag;
    }

    public boolean loginAdministrator (String email, String password) {
        AdministratorDAO administratorDAO = new AdministratorDAO();
        List<Administrator> allAdministrators = new ArrayList();
        allAdministrators = administratorDAO.returnAllAdministrators();
        int i = 0;
        boolean flag = false;
        while (i < allAdministrators.size() && !flag) {
            if ((allAdministrators.get(i).getEmail().equals(email)) && (allAdministrators.get(i).getPassword().equals(password))) {
                flag = true;
            }
        }
        return flag;
    }


}
