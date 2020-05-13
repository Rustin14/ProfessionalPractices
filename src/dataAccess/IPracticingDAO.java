/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;
import Domain.Practicing;
import java.util.List;

/**
 *
 * @author BRANDON TRUJILLO
 */
public interface IPracticingDAO {
    public Practicing searchPracticingByEnrollment (String enrollment);
    public Practicing searchPracticingByKeyword (String keyword);
    public void deletePracticingByEnrollment (String enrollment);
    public List<Practicing> returnAllPracticing();
}
