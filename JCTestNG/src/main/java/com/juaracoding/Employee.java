package com.juaracoding;

public class Employee {
    private String name;
    private int age;
    private String address;
    private double salary;

    // Get : Menampilkan di layar
    public String getName() {
        return name;
    }

    // Menginput nama, bisa di ganti
    public void setName(String name) {
        this.name = "Daniel";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 27;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = "GBA 1 BLOK B";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
           throw new IllegalArgumentException("Sallery kurang dari 0");
        }
    }
}

