/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: PracticingValidations
Date of creation: April 22nd. 2020 
*/

package BusinessLogic;

public class PracticingValidations extends PersonDataValidations {
    
    boolean validEnrollment; 
    boolean validIndigenousLanguage; 
    
    public boolean validateEnrollment (String enrollment) {
        return validEnrollment = enrollment.matches("^[z|Z]{1}[s|S]{1}[0-9]{8}$"); 
    }
  
    public boolean validateIndigenousLanguage (String indigenousLanguage) {
        return validIndigenousLanguage = indigenousLanguage.matches("([A-ZÑ]{1}[a-zñ]+[ ]?){1,2}"); 
    }

    
}
