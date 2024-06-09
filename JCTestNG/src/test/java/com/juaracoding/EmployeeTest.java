package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.*;

public class EmployeeTest {
    Employee employee = new Employee();
    TaxSalary taxSalary = new TaxSalary();

    @BeforeClass
    public void setUp() {
        System.out.println("Before Class (Open Browser)");
        employee = new Employee();
        employee.setName("Daniel");
        employee.setAge(27);
        employee.setSalary(1000000);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method (Inisiasi)");
    }

    @Test
    public void testOne() {
        double expected = 1000000;
        double actual = taxSalary.calculateTaxSalary(employee.getSalary());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTwo() {
        System.out.println("Test Two");
        double expected = 900000;
        double actual = taxSalary.calculateTaxSalary(employee.getSalary());
        Assert.assertEquals(actual, expected);
    }

    @Test (expectedExceptions = IllegalAccessException.class )
    public void testTotalSalaryNegatif(){
        employee.setSalary(-5000);
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println("After Method (Screenshot)");
    }

    @AfterClass
    public void finis () {
        System.out.println("After Class (Close Browser)");

    }
}

