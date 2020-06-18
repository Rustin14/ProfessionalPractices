/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ICompanyDAO
Date of creation: April 27th. 2020
*/
package InterfacesDAO;
import Domain.Company;
import java.sql.SQLException;
import java.util.List;

public interface ICompanyDAO {
    public void saveCompany (int id_company, String name, String address, String email, String state, String phoneNumber, Company.myEnum sector, String city, int id_coordinator, int id_course) throws SQLException, ClassNotFoundException;
    public Company searchCompanyByIDCompany (int id_company) throws SQLException, ClassNotFoundException;
    public Company searchCompanyByKeyword (String keyword) throws SQLException, ClassNotFoundException; 
    public void deleteCompanyByIDCompany(int id_company, boolean userAnswer) throws SQLException, ClassNotFoundException;
    public List<Company> returnAllCompanies() throws SQLException, ClassNotFoundException;
}


