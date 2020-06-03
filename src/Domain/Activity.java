package Domain;

public class Activity {
    private int id_activity;
    private String name;
    private int id_practicing;

    public Activity(int id_activity, String name, int id_practicing) {
        this.id_activity = id_activity;
        this.name = name;
        this.id_practicing = id_practicing;
    }

    public Activity() { }

    public int getId_activity() {
        return id_activity;
    }

    public void setId_activity(int id_activity) {
        this.id_activity = id_activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_practicing() {
        return id_practicing;
    }

    public void setId_practicing(int id_practicing) {
        this.id_practicing = id_practicing;
    }
}
