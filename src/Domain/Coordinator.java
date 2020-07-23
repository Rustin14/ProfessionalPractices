/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: Coordinator
Date of creation: April 27th. 2020
*/

package Domain;

public class Coordinator {
    private String name = "";
    private String id_person = "";
    private String cubicle = "";
    private String staff_number = "";
    private String email = "";
    private String password = "";
    private String status = "";

    public Coordinator(){}

    public Coordinator(String name, String id_person, String cubicle, String staff_number, String status) {
        this.name = name;
        this.id_person = id_person;
        this.cubicle = cubicle;
        this.staff_number = staff_number;
        this.status = status;
    }

    public String getId_person() {
        return id_person;
    }

    public void setId_person(String id_person) {
        this.id_person = id_person;
    }

    public String getCubicle() {
        return cubicle;
    }

    public void setCubicle(String cubicle) {
        this.cubicle = cubicle;
    }

    public String getStaff_number() {
        return staff_number;
    }

    public void setStaff_number(String staff_number) {
        this.staff_number = staff_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return status;
    }
}

