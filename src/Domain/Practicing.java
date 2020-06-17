/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class practicingName: Practicing
Date of creation: April 27th. 2020
*/
package Domain;

/**
 *
 * @author BRANDON TRUJILLO
 */
public class Practicing {
    private int id_person;
    private String practicingName;
    private String enrollment;
    private int id_project;
    private int id_professor;
    private String email;
    private String password;


    public Practicing(int id_person, String name, String enrollment, int id_project, int id_professor) {
        this.id_person = id_person;
        this.practicingName = name;
        this.enrollment = enrollment;
        this.id_project = id_project;
        this.id_professor = id_professor;
    }

    public Practicing(){}

    public void setEnrollment (String enrollment){
        this.enrollment = enrollment;
    }

    public String getEnrollment (){
        return enrollment;
    }
    
    public void setPracticingName (String practicingName) {
        this.practicingName = practicingName;
    }
    public String getPracticingName (){
        return practicingName;
    }
    @Override
    public String toString(){
        return String.format("%d %s %s", enrollment, practicingName);
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public int getId_project() {
        return id_project;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
