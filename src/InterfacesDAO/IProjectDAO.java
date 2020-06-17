/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: IProjectDAO
Date of creation: April 27th. 2020
*/
package InterfacesDAO;
import java.util.List;
import Domain.Project;
import java.sql.SQLException;

public interface IProjectDAO {
    public void saveProject(int id_project, String name, float duration, String general_purpose,
                            String general_description, int id_company, String chargeResponsable,
                            String nameResponsable, String emailResponsable) throws SQLException, ClassNotFoundException;
    public Project searchProjectByIDProject(int id_project) throws SQLException, ClassNotFoundException;
    public Project searchProjectByKeyword (String keyword) throws SQLException, ClassNotFoundException;
    public void deleteProjectByIDProject (int id_project) throws SQLException, ClassNotFoundException;
    public List<Project> returnAllProjects() throws SQLException, ClassNotFoundException;
}


