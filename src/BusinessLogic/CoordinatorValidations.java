/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: CoordinatorValidations
Date of creation: April 22nd. 2020 
*/ 

package BusinessLogic;

public class CoordinatorValidations extends PersonDataValidations {
    
    boolean validCompanyName; 
    boolean validProjectName; 
    boolean validStaffNumber;  
    boolean validQuotaProject;
    boolean validCubicleNumber;
    
    public boolean validateCompanyName (String companyName) {
        return validCompanyName = companyName.matches("[A-ZÑa-zñ0-9+[ ]?]{1,20}");
    }

    public boolean validateProjectName (String projectName) {
        return validProjectName = projectName.matches("([A-ZÑ]{0,1}[a-zñ]+[ ]?){1,13}");
    }
    
    public boolean validateStaffNumber (String staffNumber) {
        return validStaffNumber = staffNumber.matches("^[0-9]{5}$"); 
    }
    
    public boolean validateQuotaProject (String quotaProject) {
        return validQuotaProject = quotaProject.matches("[1-9]{1,2}"); 
    } 
            
    public boolean validateCubicleNumber (String cubicleNumber){
        return validCubicleNumber = cubicleNumber.matches("[0-9]{1,2}");
    }
}
