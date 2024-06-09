package com.juaracoding;

import org.testng.annotations.*;

public class ProcedureTest {

    // Anotasi testing
    @BeforeClass
    public void setUp(){
        System.out.println("Before Class (Open Browser)");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method (Inisiasi)");
    }

    @Test
    public void testOne(){
        System.out.println("Test One");
    }

    @Test
    public void testTwo(){
        System.out.println("Test Two");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method (Screenshot)");
    }
    @AfterClass
    public void finis() {
        System.out.println("After Class (Close Browser)");
    }

}
