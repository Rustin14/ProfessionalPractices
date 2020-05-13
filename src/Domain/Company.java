/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: Company
Date of creation: April 27th. 2020
*/
package Domain;

public class Company {
    private int id_company;
    private String name;
    private String address;
    private String email;
    private String state;
    private String phoneNumber;
    private myEnum sector;
    private String city;
    private int id_coordinator;
    private int id_course;

    enum myEnum {PRIMARY, SECONDARY, TERTIARY}

    public Company(){}

    public Company(int id_company, String name, String address, String email, String state, String phoneNumber, myEnum sector, String city, int id_coordinator, int id_course) {
        this.id_company = id_company;
        this.name = name;
        this.address = address;
        this.email = email;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.sector = sector;
        this.city = city;
        this.id_coordinator = id_coordinator;
        this.id_course = id_course;
    }

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId_coordinator() {
        return id_coordinator;
    }

    public void setId_coordinator(int id_coordinator) {
        this.id_coordinator = id_coordinator;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getSector() {
        return this.sector.name();
    }

    public void setSector(String sector) {
        this.sector = myEnum.valueOf(sector);
    }
}
