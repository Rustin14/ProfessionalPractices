/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: PersonDataValidations
Date of creation: April 22nd. 2020 
*/

package BusinessLogic;

public class PersonDataValidations {
    
    boolean validName;
    boolean validNumber = true;
    boolean validEmail; 
    boolean validPassword; 
    boolean validSex;
    boolean validPhoneNumber;
    boolean validDocumentName;
    
    public boolean validateName (String name) {
        return validName = name.matches("^([A-ZÑ]{1}[a-zñ]+[ ]?){2,4}$");
    } 
    
    public boolean validateNumber(String number) {
        return validNumber = number.matches("[0-9]+");
    }
    
    public boolean validateEmail (String email) {
        return validEmail = email.matches("^[(A-Z)(a-z)(0-9)(/)(.)(#)(_)]{5,20}[@]{1}"
                + "[g|m|a|i|l|e|s|t|u|d|n|h|o|k]*[.|c|o|m|x|u|v]{3,6}$");
    }
    
    public boolean validatePassword (String password) {
        return validPassword = password.matches("[0-9]{0,}[(A-ZÑ)(a-zñ)(/)(.)(#)]{0,16}[0-9]{0,}"
                + "[(A-ZÑ)(a-zñ)(/)(.)(#)]{1,16}[0-9]{0,}[(A-ZÑ)(a-zñ)(/)(.)(#)]{0,16}"
                + "[0-9]{1,}[(A-ZÑ)(a-zñ)(/)(.)(#)]{0,16}");
    }
    
    public boolean validateSex (String sex) {
        return validSex = sex.matches("^[M|F|m|f]{1}[a|s|c|u|l|i|n|o|e|m]*$");
    }
    
    public boolean validatePhoneNumber (String phoneNumber) {
        return validPhoneNumber = phoneNumber.matches("^[0-9]{10}$");
    } 
    
    public boolean validateDocumentName (String documentName) {
        return validDocumentName = documentName.matches("^[A-ZÑa-zñ0-9]{1,30}[.]{1}[t|x|d|o|c|p|d|f|l|s|m|z|i]{3,5}$");
    }   
    
     
}
