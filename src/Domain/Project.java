/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class projectName: Project
Date of creation: April 27th. 2020
*/
package Domain;

public class Project {
    private int id_project;
    private String projectName;
    private float duration;
    private String general_purpose;
    private String general_description;
    private int id_company;
    private String chargeResponsable;
    private String nameResponsable;
    private String emailResponsable;

    public Project(){}

    public Project(int id_project, String name, float duration, String general_purpose, String general_description, int id_company, String chargeResponsable, String nameResponsable, String emailResponsable) {
        this.id_project = id_project;
        this.projectName = name;
        this.duration = duration;
        this.general_purpose = general_purpose;
        this.general_description = general_description;
        this.id_company = id_company;
        this.chargeResponsable = chargeResponsable;
        this.nameResponsable = nameResponsable;
        this.emailResponsable = emailResponsable;
    }

    public int getId_project() {
        return id_project;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public String getChargeResponsable() {
        return chargeResponsable;
    }

    public void setChargeResponsable(String chargeResponsable) {
        this.chargeResponsable = chargeResponsable;
    }

    public String getNameResponsable() {
        return nameResponsable;
    }

    public void setNameResponsable(String nameResponsable) {
        this.nameResponsable = nameResponsable;
    }

    public String getEmailResponsable() {
        return emailResponsable;
    }

    public void setEmailResponsable(String emailResponsable) {
        this.emailResponsable = emailResponsable;
    }
}
