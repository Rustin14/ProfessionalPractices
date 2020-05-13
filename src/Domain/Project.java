/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: Project
Date of creation: April 27th. 2020
*/
package Domain;

public class Project {
    private int id_project;
    private String name;
    private float duration;
    private String general_purpose;
    private String general_description;
    private int id_company;
    private String charge_Responsable;
    private String name_Responsable;
    private String email_Responsable;

    public Project(){}

    public Project(int id_project, String name, float duration, String general_purpose, String general_description, int id_company, String charge_Responsable, String name_Responsable, String email_Responsable) {
        this.id_project = id_project;
        this.name = name;
        this.duration = duration;
        this.general_purpose = general_purpose;
        this.general_description = general_description;
        this.id_company = id_company;
        this.charge_Responsable = charge_Responsable;
        this.name_Responsable = name_Responsable;
        this.email_Responsable = email_Responsable;
    }

    public int getId_project() {
        return id_project;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String getGeneral_purpose() {
        return general_purpose;
    }

    public void setGeneral_purpose(String general_purpose) {
        this.general_purpose = general_purpose;
    }

    public String getGeneral_description() {
        return general_description;
    }

    public void setGeneral_description(String general_description) {
        this.general_description = general_description;
    }

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public String getCharge_Responsable() {
        return charge_Responsable;
    }

    public void setCharge_Responsable(String charge_Responsable) {
        this.charge_Responsable = charge_Responsable;
    }

    public String getName_Responsable() {
        return name_Responsable;
    }

    public void setName_Responsable(String name_Responsable) {
        this.name_Responsable = name_Responsable;
    }

    public String getEmail_Responsable() {
        return email_Responsable;
    }

    public void setEmail_Responsable(String email_Responsable) {
        this.email_Responsable = email_Responsable;
    }
}
