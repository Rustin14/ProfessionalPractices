/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: PartialReport
Date of creation: May 6th. 2020
*/
package Domain;

import java.io.File;
import java.sql.Date;

public class PartialReport {
    private int id_partial;
    private int id_practicing;
    private int partialNumber;
    private int score;
    private String observations;
    private Date dueDate;
    private byte[] paperFile;
    private String address;

    public PartialReport () {
        dueDate = new Date(System.currentTimeMillis());
     }

    public int getId_partial() {
        return id_partial;
    }

    public void setId_partial(int id_partial) {
        this.id_partial = id_partial;
    }

    public int getId_practicing() {
        return id_practicing;
    }

    public void setId_practicing(int id_practicing) {
        this.id_practicing = id_practicing;
    }

    public int getPartialNumber() {
        return partialNumber;
    }

    public void setPartialNumber(int partialNumber) {
        this.partialNumber = partialNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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
