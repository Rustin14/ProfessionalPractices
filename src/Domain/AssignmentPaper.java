/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: AssignmentPaper
Date of creation: May 7th. 2020
*/
package Domain;

import java.io.File;

public class AssignmentPaper {
    private int id_assignment;
    private int id_coordinator;
    private int id_practicing;
    private int id_project;
    private byte[] paperFile;
    private String address;

    public AssignmentPaper(){}

    public int getId_assignment() {
        return id_assignment;
    }

    public void setId_assignment(int id_assignment) {
        this.id_assignment = id_assignment;
    }

    public int getId_coordinator() {
        return id_coordinator;
    }

    public void setId_coordinator(int id_coordinator) {
        this.id_coordinator = id_coordinator;
    }

    public int getId_practicing() {
        return id_practicing;
    }

    public void setId_practicing(int id_practicing) {
        this.id_practicing = id_practicing;
    }

    public int getId_project() {
        return id_project;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
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
