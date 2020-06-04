package Domain;

public class Activity {
    private int id_activity;
    private String name;
    private String description;
    private String plannedTime;
    private String timeInvested;
    private int timeInWeeks;
    private int id_practicing;

    public Activity(int id_activity, String name, String description, String plannedTime, String timeInvested, int timeInWeeks, int id_practicing) {
        this.id_activity = id_activity;
        this.name = name;
        this.description = description;
        this.plannedTime = plannedTime;
        this.timeInvested = timeInvested;
        this.timeInWeeks = timeInWeeks;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlannedTime() {
        return plannedTime;
    }

    public void setPlannedTime(String plannedTime) {
        this.plannedTime = plannedTime;
    }

    public String getTimeInvested() {
        return timeInvested;
    }

    public void setTimeInvested(String timeInvested) {
        this.timeInvested = timeInvested;
    }

    public int getTimeInWeeks() {
        return timeInWeeks;
    }

    public void setTimeInWeeks(int timeInWeeks) {
        this.timeInWeeks = timeInWeeks;
    }
}
