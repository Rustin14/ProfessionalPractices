/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesDAO;
import Domain.Practicing;
import java.sql.SQLException;
import java.util.List;


public interface IPracticingDAO {
    public void savePracticing (int id_person, String name, String enrollment, int id_project, int id_professor) throws SQLException, ClassNotFoundException;
    public Practicing searchPracticingByEnrollment (String enrollment) throws SQLException, ClassNotFoundException;
    public Practicing searchPracticingByKeyword (String keyword) throws SQLException, ClassNotFoundException;
    public void deletePracticingByEnrollment (String enrollment) throws SQLException, ClassNotFoundException;
    public List<Practicing> returnAllPracticing() throws SQLException, ClassNotFoundException;
}
