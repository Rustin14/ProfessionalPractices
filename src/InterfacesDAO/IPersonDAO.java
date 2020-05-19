/*
Institution: Universidad Veracruzana
File creator: B
Class name: IPersonDAO
Date of creation: March 22nd. 2020
*/

package InterfacesDAO;

import Domain.Person;
import Domain.Practicing;

import java.util.List;

public interface IPersonDAO {
    public Person searchPersonbyID (int id_person);
    public Person searchPersonByKeyword (String keyword);
    public void deletePersonByIDPerson (int id_person);
    public List<Person> returnAllPerson();
}
