/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: Administrator
Date of creation: May 23rd. 2020
*/
package Domain;

public class Administrator {
    private int id_administrator;
    private String name;
    private String email;
    private String password;

    public Administrator() {
    }

    public Administrator(int id_administrator, String name, String email, String password) {
        this.id_administrator = id_administrator;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId_administrator() {
        return id_administrator;
    }

    public void setId_administrator(int id_administrator) {
        this.id_administrator = id_administrator;
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
}
