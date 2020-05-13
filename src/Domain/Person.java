package Domain;

public class Person {
    private int id_person;
    private String name;
    private String phoneNumber;
    private String email;
    private String id_course;

    public Person(int id_person, String name, String phoneNumber, String email, String id_course) {
        this.id_person = id_person;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id_course = id_course;
    }

    public Person(){}

    public void setId_person (int id_p) {
        this.id_person = id_p;
    }

    public int getId_person () {
        return id_person;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId_course(String id_course) {
        this.id_course = id_course;
    }

    public String getId_course() {
        return id_course;
    }
}
