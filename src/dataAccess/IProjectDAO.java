/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: IProjectDAO
Date of creation: April 27th. 2020
*/
package dataAccess;
import java.util.List;
import Domain.Project;

public interface IProjectDAO {
    public Project searchProjectByIDProject(int id_project);
    public Project searchProjectByKeyword (String keyword);
    public void deleteProjectByIDProject (int id_project);
    public List<Project> returnAllProjects();
}


