package InterfacesDAO;

import Domain.AcceptancePaper;
import java.sql.SQLException;

public interface IAcceptancePaperDAO {
    public void saveAcceptancePaper(int id_acceptance, int id_practicing, int id_project, int id_company, String address) throws SQLException, ClassNotFoundException;
    public AcceptancePaper readAcceptancePaperByIDAcceptance (int id_acceptance, String address) throws SQLException, ClassNotFoundException;
    public void deleteAcceptancePaperByIDAcceptance (int id_acceptance) throws SQLException, ClassNotFoundException;
}
