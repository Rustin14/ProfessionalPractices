/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: Professor
Date of creation: April 27th. 2020
*/
package Domain;

public class Professor extends Person {
    private String name;
    private int id_person;
    private int cubicle;
    private String staff_number;

    public Professor(){}

    public Professor(String name, int id_person, int cubicle, String staff_number) {
        this.name = name;
        this.id_person = id_person;
        this.cubicle = cubicle;
        this.staff_number = staff_number;
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public int getCubicle() {
        return cubicle;
    }

    public void setCubicle(int cubicle) {
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
}
