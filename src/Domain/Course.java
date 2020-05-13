/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: Course
Date of creation: March 22nd. 2020
*/
package Domain;

public class Course {
    public int id_course;
    public String NRC;
    public String semester;
    public String name;

    public Course(int id_course, String NRC, String semester, String name_project) {
        this.id_course = id_course;
        this.NRC = NRC;
        this.semester = semester;
        this.name = name_project;
    }

    public Course(){}

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public int getId_course() {
        return id_course;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public String getNRC() {
        return NRC;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
