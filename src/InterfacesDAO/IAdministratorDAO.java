package InterfacesDAO;

import Domain.Administrator;

import java.util.List;

public interface IAdministratorDAO {
    public void saveAdministrator(int id_administrator, String name, String email, String password);
    public Administrator readAdministrator(int id_administrator);
    public void deleteAdministrator (int id_administrator);
    public List<Administrator> returnAllAdministrators();
}
