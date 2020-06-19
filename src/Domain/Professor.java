/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: Professor
Date of creation: April 27th. 2020
*/
package Domain;

public class Professor extends Person {
    private String name = "";
    private String id_person = "";
    private String shift = "";
    private String cubicle = "";
    private String staff_number = "";
    private String email = "";
    private String password = "";

    public Professor(){}

    public Professor(String name, String id_person,String shift, String cubicle, String staff_number
            ,String email, String password){
        this.name = name;
        this.id_person = id_person;
        this.shift = shift;
        this.cubicle = cubicle;
        this.staff_number = staff_number;
        this.email = email;
        this.password = password;
    }

    public String id_person(){
        return id_person;
    }

    public void setId_person(String id_person){
        this.id_person = id_person;
    }

    public String getCubicle (){
        return cubicle;
    }
    
    public String getShift(){
        return shift;
    }
    
    public void setShift(String shift){
        this.shift = shift;
    }
    public void setCubicle(String cubicle){
        this.cubicle = cubicle;
    }

    public String getStaff_number() {
        return staff_number;
    }

    public void setStaff_number(String staff_number) {
        this.staff_number = staff_number;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
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
