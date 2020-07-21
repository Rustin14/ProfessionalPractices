/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: TestProfessorValidations   
Date of creation: May 16th. 2020 
*/         

import BusinessLogic.ProfessorValidations;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestProfessorValidations {
    
    ProfessorValidations professorTest = new ProfessorValidations(); 
    boolean valueExpected = true;
    boolean valueEntered;  
    
    @Test
    public void TestValidateTurn() {
        valueEntered = professorTest.validateTurn("Vespertino"); 
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidateQualification() {
        valueEntered = professorTest.validateQualification("9.50"); 
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidateStaffNumber() {
        valueEntered = professorTest.validateStaffNumber("51278");
        assertEquals(valueExpected, valueEntered); 
    } 
    
    @Test
    public void TestValidateCubicleNumber(){
        valueEntered = professorTest.validateCubicleNumber("18");
        assertEquals(valueExpected, valueEntered);
    }

}
