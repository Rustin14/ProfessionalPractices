package InterfacesDAO;

import Domain.Administrator;
import java.sql.SQLException;

import java.util.List;

public interface IAdministratorDAO {
    public void saveAdministrator(int id_administrator, String name, String email, String password) throws SQLException, ClassNotFoundException;
    public Administrator readAdministrator(int id_administrator) throws SQLException, ClassNotFoundException;
    public void deleteAdministrator (int id_administrator, boolean userAnswer) throws SQLException, ClassNotFoundException;
    public List<Administrator> returnAllAdministrators() throws SQLException, ClassNotFoundException;
}
