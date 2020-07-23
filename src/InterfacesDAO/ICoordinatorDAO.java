/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ICoordinatorDAO
Date of creation: April 28th. 2020
*/
package InterfacesDAO;
import Domain.Coordinator;
import java.sql.SQLException;
import java.util.List;

public interface ICoordinatorDAO {
    public void saveCoordinator(String id_person, String name, String cubicle, String staff_number, String email, String password, String status) throws SQLException, ClassNotFoundException;
    public Coordinator searchCoordinatorByIDPerson(int id_person) throws SQLException, ClassNotFoundException;
    public Coordinator searchCoordinatorByKeyword (String keyword) throws SQLException, ClassNotFoundException;
    public void deleteCoordinatorByIDPerson (String id_person) throws SQLException, ClassNotFoundException;
    public List<Coordinator> returnAllCoordinators() throws SQLException, ClassNotFoundException;
    public Coordinator getCoordinator(String status) throws SQLException, ClassNotFoundException;
}
