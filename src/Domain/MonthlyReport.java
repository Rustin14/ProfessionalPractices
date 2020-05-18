/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: MonthlyReport
Date of creation: May 7th. 2020
*/
package Domain;

import java.io.File;
import java.sql.Date;

public class MonthlyReport {
    private int id_monthly;
    private int monthNumber;
    private int score;
    private String observations;
    private java.sql.Date dueDate;
    private byte[] paperFile;
    private String address;

    public MonthlyReport(){
        dueDate = new Date(System.currentTimeMillis());
    }

    public int getId_monthly() {
        return id_monthly;
    }

    public void setId_monthly(int id_monthly) {
        this.id_monthly = id_monthly;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
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
