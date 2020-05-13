/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: AcceptancePaper
Date of creation: May 7th. 2020
*/
package Domain;

import java.io.File;

public class AcceptancePaper {
    private int id_acceptance;
    private int id_practicing;
    private int id_project;
    private int id_company;
    private byte[] paperFile;
    private String address;

    public AcceptancePaper(){}

    public int getId_acceptance() {
        return id_acceptance;
    }

    public void setId_acceptance(int id_acceptance) {
        this.id_acceptance = id_acceptance;
    }

    public int getId_project() {
        return id_project;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public int getId_company() {
        return id_company;
    }

    public void setId_company(int id_company) {
        this.id_company = id_company;
    }

    public int getId_practicing() {
        return id_practicing;
    }

    public void setId_practicing(int id_practicing) {
        this.id_practicing = id_practicing;
    }

    public byte[] getPaperFile() {
        return paperFile;
    }

    public void setPaperFile(byte[] paperFile) {
        this.paperFile = paperFile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void toBinary () {
        File file = new File(address);
        paperFile = new byte[(int) file.length()];
        this.setPaperFile(paperFile);
    }
}
