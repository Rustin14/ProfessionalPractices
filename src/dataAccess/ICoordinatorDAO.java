/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ICoordinatorDAO
Date of creation: April 28th. 2020
*/
package dataAccess;
import Domain.Coordinator;
import java.util.List;

public interface ICoordinatorDAO {
    public Coordinator searchCoordinatorByIDPerson(int id_person);
    public Coordinator searchCoordinatorByKeyword (String keyword);
    public void deleteCoordinatorByIDPerson (int id_person);
    public List<Coordinator> returnAllCoordinators();
}
