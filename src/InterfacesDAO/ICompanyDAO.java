/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ICompanyDAO
Date of creation: April 27th. 2020
*/
package InterfacesDAO;
import Domain.Company;
import java.util.List;

public interface ICompanyDAO {
    public void saveCompany (int id_company, String name, String address, String email, String state, String phoneNumber, Company.myEnum sector, String city, int id_coordinator, int id_course);
    public Company searchCompanyByIDCompany (int id_company);
    public Company searchCompanyByKeyword (String keyword);
    public void deleteCompanyByIDCompany(int id_company);
    public List<Company> returnAllCompanies();
}


