/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: CourseDAO
Date of creation: April 22nd. 2020
*/

package dataAccess;
import Domain.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class CourseDAO implements ICourseDAO  {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;

    public CourseDAO() {
        connectDB = new ConnectDB();
    }

    public Course searchCourseByNRC (String NRC) {
        Course course = null;
        try {
            Connection connect = ConnectDB.getConnection();
            String query = "SELECT id_course, name FROM course WHERE NRC = ?";
            PreparedStatement sentencia = connect.prepareStatement(query);
            sentencia.setString(1, NRC);
            results = sentencia.executeQuery();
            while (results.next()){
                course = new Course();
                course.setNRC(results.getString("NRC"));
                course.setName(results.getString("name"));
            }
        } catch (SQLException exc){
            Logger.getLogger(PracticingDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return course;
    }

    public Course searchCourseByKeyword(String keyword) {
        Course course = null;
        try {
            Connection connect = ConnectDB.getConnection();
            String query = "SELECT NRC, name FROM course WHERE name LIKE '%{?}% ";
            PreparedStatement sentence = connect.prepareStatement(query);
            sentence.setString(1, keyword);
            results = sentence.executeQuery();
            while (results.next()) {
                course = new Course();
                course.setNRC(results.getString("NRC"));
                course.setName(results.getString("name"));
            }

        } catch (SQLException exc) {
            Logger.getLogger(PracticingDAO.class.getName()).log(Level.SEVERE, null, exc);
        } finally {
            connectDB.closeConnection();
        }
        return course;
    }

    public void deleteCourseByNRC (String NRC) {
        Scanner sc = new Scanner(System.in);
        Connection connect = null;
        PreparedStatement sentence = null;
        try {
            connect = ConnectDB.getConnection();
            String query = "START TRANSACTION; DELETE from course WHERE NRC = ?";
            sentence = connect.prepareStatement(query);
            sentence.setString(1, NRC);
            results = sentence.executeQuery();
        } catch (SQLException exc) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, exc);
        }
        String flag = null;
        while (flag != "Y" || flag != "N") {
            System.out.println("Are you sure you want to erase this data? Y/N");
            flag = sc.nextLine();
            if (flag.equals("Y")) {
                try {
                    sentence = connect.prepareStatement("COMMIT");
                    sentence.executeQuery();
                } catch (SQLException exc) {
                    System.out.println("The operation couldn't be completed.");
                }
            } else if (flag.equals("N")) {
                try {
                    sentence = connect.prepareStatement("ROLLBACK");
                    sentence.executeQuery();
                } catch (SQLException exc) {
                    System.out.println("The operation couldn't be completed.");
                }
            } else {
                System.out.println("Answer not valid. Try again.");
            }
        }
    }


    public List<Course> returnAllCourses() {
        List<Course> allCourses = new ArrayList();
        Course course = null;
        try {
            connection = connectDB.getConnection();
            statement = connection.createStatement();
            results = statement.executeQuery("select id_course, name from course");
            while (results.next()){
                course = new Course();
                course.setId_course(results.getInt("id_course"));
                course.setName(results.getString("name"));
                allCourses.add(course);
            }

        } catch (SQLException exc) {
            Logger.getLogger(PracticingDAO.class.getName()).log(Level.SEVERE, null, exc);
        }  finally {
            connectDB.closeConnection();
        }
        return allCourses;
    }


}
