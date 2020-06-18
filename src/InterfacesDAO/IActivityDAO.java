package InterfacesDAO;

import Domain.Activity;
import java.sql.SQLException;

import java.util.List;

public interface IActivityDAO {
    public void saveActivity(int id_activity, String name, int id_practicing) throws SQLException, ClassNotFoundException;
    public Activity readActivityByIDActivity (int id_activity)  throws SQLException, ClassNotFoundException;
    public void deleteActivity (int id_activity)  throws SQLException, ClassNotFoundException;
    public List<Activity> returnAllActivities()  throws SQLException, ClassNotFoundException;
}
