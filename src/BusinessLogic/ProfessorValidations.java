package BusinessLogic;

/**
 *
 * @author mario
 */
public class ProfessorValidations extends PersonDataValidations {
    
    boolean validTurn; 
    boolean validQualification;
    
    public boolean validateTurn (String turn) {
        return validTurn = turn.matches("^[M|m|V|v]{1}[a|t|u|i|n|o|e|s|p|r|t]*$"); 
    }
    
    public boolean validateQualification (String qualification){
        return validQualification = qualification.matches("^[0-9]{1,2}[.]{1}[0-9]{1,2}$"); 
    }
    
}
