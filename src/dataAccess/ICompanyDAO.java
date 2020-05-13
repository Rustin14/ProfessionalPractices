/*
Institution: Universidad Veracruzana
File creator: Carlos Gabriel Flores Lira
Class name: ICompanyDAO
Date of creation: April 27th. 2020
*/
package dataAccess;
import Domain.Company;
import java.util.List;

public interface ICompanyDAO {
    public Company searchCompanyByIDCompany (int id_company);
    public Company searchCompanyByKeyword (String keyword);
    public void deleteCompanyByIDCompany(int id_company);
    public List<Company> returnAllCompanies();
}


