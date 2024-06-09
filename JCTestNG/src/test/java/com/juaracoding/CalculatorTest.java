package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    double a = 10, b = 5;

    @Test
    public void testAdd() {
        calculator.add(10, 5);
        double expected = 15; //  nilai yang harus Muncul di penjumlahan = 15
        double actual = calculator.add(10, 5);
        // Validasi
        // Menggunakan Polymorphim (Method Overloading)
        // cara 1  Assert.assertEquals(actual, expected);
        // cara 2
        Assert.assertEquals(calculator.add(10, 5), 15);
    }
    @Test
    public void testSubtract() {
        double expected = 15;
            calculator.subtract(10, 5);
            Assert.assertEquals(calculator.subtract(10, 5), 5);
        }
        // assert
        @Test
    public void numberGreaterThanTest(){
        int number = 21;
        boolean actual = number > 15;
        Assert.assertTrue(actual);
        }
        @Test
        public void compareString(){
        String text = "Berhasil Login";
        String expected = "Login";
        Assert.assertTrue(text.equals("Berhasil Login"));
        // Bila teksnya panjang menggunakan =  Assert.assertTrue(text.contains(expected));
        }

    }

