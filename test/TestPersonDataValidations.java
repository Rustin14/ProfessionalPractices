/*
Intitution: Universidad Veracruzana 
File creator: Mario Dorantes
Class name: TestPersonDataValidations
Date of creation: May 16th. 2020 
*/ 

import BusinessLogic.PersonDataValidations;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPersonDataValidations {
    
    PersonDataValidations personTest = new PersonDataValidations(); 
    boolean valueExpected = true;
    boolean valueEntered; 
   
    @Test
    public void TestValidateName() {
        valueEntered = personTest.validateName("Mario Eduardo Dorantes Hernandez"); 
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidateIDNumber() {
        valueEntered = personTest.validateIDNumber("118");
        assertEquals(valueExpected, valueEntered);
    }
    
    @Test 
    public void TestValidateEmail() {          
        valueEntered = personTest.validateEmail("zS18019633@estudiantes.uv.mx"); 
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidatePassword() {
        valueEntered = personTest.validatePassword("H4ckM3"); 
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidateSex() {
        valueEntered = personTest.validateSex("Masculino");
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidatePhoneNumber() {
        valueEntered = personTest.validatePhoneNumber("2281223813"); 
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test 
    public void TestValidateDocumentName() {
        valueEntered = personTest.validateDocumentName("Tarea.pdf"); 
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidateTitle() {
        valueEntered = personTest.validateTitle("Titulo de Algo");
        assertEquals(valueExpected, valueEntered);
    } 
    
    @Test
    public void TestValidateDateDay() {
        valueEntered = personTest.validateDateDay("26");
        assertEquals(valueExpected, valueEntered);
    }
    
    @Test
    public void TestValidateDateYear(){
        valueEntered = personTest.validateDateYear("2000");
        assertEquals(valueExpected, valueEntered); 
    }
    
    @Test
    public void TestValidateDateMonth(){
        valueEntered = personTest.validateDateMonth("Mayo");
        assertEquals(valueExpected, valueEntered);
    }
}
