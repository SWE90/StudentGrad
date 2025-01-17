/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.studentgeadeee;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author iivoiil
 */
public class StudentGeadeeeTest {
    
    public StudentGeadeeeTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testMain() {
    }
     @Test
    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGeadeee.getGrade(mark);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGeadeee.getGrade(mark);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetGrade75() {
        System.out.println("getGrade 85");
        int mark = 75;
        String expResult = "F";
        String result = StudentGeadeee.getGrade(mark);
        assertEquals(expResult, result);
    }
    @Test
    void testGrade65(){
        System.out.println("getGrade 65");
        int mark = 65;
        String expResult = "F";
        String Result = StudentGeadeee.getGrade(mark);
        assertEquals(expResult,Result);
    }
     @Test
    void testGrade56(){
        System.out.println("getGrade 56");
        int mark = 56;
        String expResult = "D";                        //this test is wrong becuse 56 it = F 
        String Result = StudentGeadeee.getGrade(mark);
        assertEquals(expResult,Result);
         System.out.println("saleh");
    }
     @Test
    void testGrade100(){
        System.out.println("getGrade 100");
        int mark = 100;
        String expResult = "A+";
        String Result = StudentGeadeee.getGrade(mark);
    }
    @Test
    void testGrade0(){
        System.out.println("getGrade 0");
        int mark = 100;
        String expResult = "A+";                      //can this test give me A+ ?? //yes i need to edit my method 
        String Result = StudentGeadeee.getGrade(mark);
    }
    //* A (90 - 100), B (80 - 89), F ( < 80 && > 100)
     @Test
     void testGrade90(){
        System.out.println("getGrade 90=A");
        int mark = 90;
        String expResult = "A";
        String Result = StudentGeadeee.getGrade(mark);
        assertEquals(expResult,Result);
  
    }
     @Test
     void testGradeF110(){
        System.out.println("getGrade F > 100 ");
        int mark = 110;
        String expResult = "F";
        String Result = StudentGeadeee.getGrade(mark);
        assertEquals(expResult,Result);
    }
     //anything > 100 give me Grade (F) and also < 60 
      @Test
     void testGradeF59(){
        System.out.println("getGrade F < 60");
        int mark = 59; 
        String expResult = "F";  //its true becuse 59 < 60 so its true to give me F 
        String Result = StudentGeadeee.getGrade(mark);
        assertEquals(expResult,Result);
    }
}