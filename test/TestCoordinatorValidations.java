/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: TestCoordinatorValidations
Date of creation: May 16th. 2020 
*/  

import BusinessLogic.CoordinatorValidations;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCoordinatorValidations {
    
    CoordinatorValidations coordinatorTest = new CoordinatorValidations(); 
    boolean valueExpected = true;
    boolean valueEntered; 
    
    @Test
    public void TestValidateCompanyName() {
        valueEntered = coordinatorTest.validateCompanyName("CODE Mexico"); 
        assertEquals(valueExpected, valueEntered);
    }
    
    @Test 
    public void TestValidateProjectName() {
        valueEntered = coordinatorTest.validateProjectName("Construccion de Sistema de Practicas Profesionales");
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidateStaffNumber() {
        valueEntered = coordinatorTest.validateStaffNumber("26138");
        assertEquals(valueExpected, valueEntered); 
    }
    
}
