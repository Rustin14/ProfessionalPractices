/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: ProfessorValidations 
Date of creation: April 22nd. 2020 
*/

package BusinessLogic;

public class ProfessorValidations extends PersonDataValidations {
    
    boolean validTurn; 
    boolean validQualification;
    boolean validStaffNumber; 
    boolean validCubicleNumber;
    
    public boolean validateTurn (String turn) {
        return validTurn = turn.matches("^[M|m|V|v]{1}[a|t|u|i|n|o|e|s|p|r|t]*$"); 
    }
    
    public boolean validateQualification (String qualification) {
        return validQualification = qualification.matches("^[0-9]{1,2}[.]{1}[0-9]{1,2}$"); 
    }
    
    public boolean validateStaffNumber (String staffNumber) {
        return validStaffNumber = staffNumber.matches("^[0-9]{5}$"); 
    }
    
    public boolean validateCubicleNumber (String cubicleNumber){
        return validCubicleNumber = cubicleNumber.matches("^[0-9]{1,3}$");
    }
    
}
