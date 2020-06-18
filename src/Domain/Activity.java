package Domain;

public class Activity {
    private int id_activity;
    private String activityName;
    private String description;
    private String timePlanned;
    private String timeInvested;
    private String timeInWeeks;
    private int id_practicing;

    public Activity(int id_activity, String name, String description, String plannedTime, String timeInvested, String timeInWeeks, int id_practicing) {
        this.id_activity = id_activity;
        this.activityName = name;
        this.description = description;
        this.timePlanned = plannedTime;
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

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
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

    public String getTimePlanned() {
        return timePlanned;
    }

    public void setTimePlanned(String timePlanned) {
        this.timePlanned = timePlanned;
    }

    public String getTimeInvested() {
        return timeInvested;
    }

    public void setTimeInvested(String timeInvested) {
        this.timeInvested = timeInvested;
    }

    public String getTimeInWeeks() {
        return timeInWeeks;
    }

    public void setTimeInWeeks(String timeInWeeks) {
        this.timeInWeeks = timeInWeeks;
    }
}
