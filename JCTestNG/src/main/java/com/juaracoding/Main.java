package com.juaracoding;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 100/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Lanjutkan");
    }
}