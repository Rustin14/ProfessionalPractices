package InterfacesDAO;

import Domain.Activity;

import java.util.List;

public interface IActivityDAO {
    public void saveActivity(int id_activity, String name, int id_practicing);
    public Activity readActivityByIDActivity (int id_activity);
    public void deleteActivity (int id_activity);
    public List<Activity> returnAllActivities();
}
