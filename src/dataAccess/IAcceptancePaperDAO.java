package dataAccess;

import Domain.AcceptancePaper;

public interface IAcceptancePaperDAO {
    public void saveAcceptancePaper(int id_acceptance, int id_practicing, int id_project, int id_company, byte[] paperFile, String address);
    public AcceptancePaper readAcceptancePaperByIDAcceptance (int id_acceptance, String address);
    public void deleteAcceptancePaperByIDAcceptance (int id_acceptance);
}
