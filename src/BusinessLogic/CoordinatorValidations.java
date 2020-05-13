package BusinessLogic;

/**
 *
 * @author mario
 */
public class CoordinatorValidations extends PersonDataValidations {
    
    boolean validCompanyName; 
    boolean validProjectName; 
    
    public boolean validateCompanyName (String companyName) {
        return validCompanyName = companyName.matches("[A-ZÑa-zñ0-9+[ ]?]{1,20}");
    }

    public boolean validateProjectName (String projectName) {
        return validProjectName = projectName.matches("([A-ZÑ]{0,1}[a-zñ]+[ ]?){1,13}");
    }
            
}
