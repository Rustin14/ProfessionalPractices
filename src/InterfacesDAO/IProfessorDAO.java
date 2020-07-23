/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: IProfessorDAO
Date of creation: April 27th. 2020
*/
package InterfacesDAO;
import Domain.Professor;
import java.sql.SQLException;
import java.util.List;

public interface IProfessorDAO {
    public void saveProfessor(String id_person, String name, String cubicle,
            String staff_number, String email, String password, String shift, String status) throws SQLException, ClassNotFoundException;
    public Professor searchProfessorByIDPerson (int id_person) throws SQLException, ClassNotFoundException;
    public Professor searchProfessorByKeyword (String keywords) throws SQLException, ClassNotFoundException;
    public void deleteProfessorByIDPerson (int id_person, boolean userAnswer) throws SQLException, ClassNotFoundException;
    public List<Professor> returnAllProfessors() throws SQLException, ClassNotFoundException;
}
