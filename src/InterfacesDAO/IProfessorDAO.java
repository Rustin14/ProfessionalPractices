/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: IProfessorDAO
Date of creation: April 27th. 2020
*/
package InterfacesDAO;
import Domain.Professor;
import java.util.List;

public interface IProfessorDAO {
    public void saveProfessor(int id_person, String name, int cubicle, String staff_number);
    public Professor searchProfessorByIDPerson (int id_person);
    public Professor searchProfessorByKeyword (String keywords);
    public void deleteProfessorByIDPerson (int id_person);
    public List<Professor> returnAllProfessors();
}
