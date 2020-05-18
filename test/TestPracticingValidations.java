/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: TestPracticingValidations  
Date of creation: May 16th. 2020 
*/  

import BusinessLogic.PracticingValidations;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPracticingValidations {
    
    PracticingValidations practicingTest = new PracticingValidations(); 
    boolean valueExpected = true;
    boolean valueEntered;  
    
    @Test
    public void TestValidateEnrollment() {
        valueEntered = practicingTest.validateEnrollment("zS18019633"); 
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidateIndigenousLanguage() {
        valueEntered = practicingTest.validateIndigenousLanguage("Totonaca"); 
        assertEquals(valueExpected, valueEntered); 
    }
 
}
