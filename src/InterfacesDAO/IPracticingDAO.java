/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesDAO;
import Domain.Practicing;
import java.util.List;


public interface IPracticingDAO {
    public void savePracticing (int id_person, String name, String enrollment, int id_project, int id_professor);
    public Practicing searchPracticingByEnrollment (String enrollment);
    public Practicing searchPracticingByKeyword (String keyword);
    public void deletePracticingByEnrollment (String enrollment);
    public List<Practicing> returnAllPracticing();
}
