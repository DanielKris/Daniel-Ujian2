package com.juaracoding;

public class TaxSalary {
    double taxSalary = 0;

    public double calculateTaxSalary(double salary){
        taxSalary = salary * 0.1;
        return taxSalary;
    }
    public double totalSalary(double salary){
        return salary - calculateTaxSalary(salary);
    }
}
