/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ICourseDAO
Date of creation: April 27th. 2020
*/
package InterfacesDAO;

import Domain.Course;
import java.sql.SQLException;
import java.util.List;

public interface ICourseDAO {
    public void saveCourse(int id_course, String NRC, String period, String name) throws SQLException, ClassNotFoundException;
    public Course searchCourseByNRC (String NRC) throws SQLException, ClassNotFoundException;
    public Course searchCourseByKeyword (String keyword) throws SQLException, ClassNotFoundException;
    public void deleteCourseByNRC(String NRC, boolean userAnswer) throws SQLException, ClassNotFoundException;
    public List<Course> returnAllCourses() throws SQLException, ClassNotFoundException;
}
