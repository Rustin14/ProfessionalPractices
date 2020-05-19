/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ICourseDAO
Date of creation: April 27th. 2020
*/
package InterfacesDAO;

import Domain.Course;
import java.util.List;

public interface ICourseDAO {
    public void saveCourse(int id_course, String NRC, String period, String name);
    public Course searchCourseByNRC (String NRC);
    public Course searchCourseByKeyword (String keyword);
    public void deleteCourseByNRC(String NRC);
    public List<Course> returnAllCourses();
}
