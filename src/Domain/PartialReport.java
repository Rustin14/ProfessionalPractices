/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: PartialReport
Date of creation: May 6th. 2020
*/
package Domain;

public class PartialReport {
    private int id_partial;
    private int id_practicing;
    private byte[] paperFile;

    public PartialReport () {
        
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

    public byte[] getPaperFile() {
        return paperFile;
    }

    public void setPaperFile(byte[] paperFile) {
        this.paperFile = paperFile;
    }
}
