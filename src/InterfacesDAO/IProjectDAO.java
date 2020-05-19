/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: IProjectDAO
Date of creation: April 27th. 2020
*/
package InterfacesDAO;
import java.util.List;
import Domain.Project;

public interface IProjectDAO {
    public void saveProject(int id_project, String name, float duration, String general_purpose, String general_description, int id_company, String chargeResponsable, String nameResponsable, String emailResponsable);
    public Project searchProjectByIDProject(int id_project);
    public Project searchProjectByKeyword (String keyword);
    public void deleteProjectByIDProject (int id_project);
    public List<Project> returnAllProjects();
}


