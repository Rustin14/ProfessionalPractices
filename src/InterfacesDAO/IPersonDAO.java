/*
Institution: Universidad Veracruzana
File creator: B
Class name: IPersonDAO
Date of creation: March 22nd. 2020
*/

package InterfacesDAO;

import Domain.Person;
import Domain.Practicing;
import java.sql.SQLException;

import java.util.List;

public interface IPersonDAO {
    public Person searchPersonbyID (int id_person) throws SQLException, ClassNotFoundException;
    public Person searchPersonByKeyword (String keyword) throws SQLException, ClassNotFoundException;
    public void deletePersonByIDPerson (int id_person, boolean userAnswer) throws SQLException, ClassNotFoundException;
    public List<Person> returnAllPerson() throws SQLException, ClassNotFoundException;
    public void savePerson(String name, String phoneNumber, String email) throws SQLException, ClassNotFoundException;
}
