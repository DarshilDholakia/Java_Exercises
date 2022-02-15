package com.bnta.Exercises.oop_garage_example.src;//this file creates a standard Cars class aka POJO...

public class Cars {
    private String make;
    private String regNumber;
    private boolean isElectric;

    public Cars (String make,
                 String regNumber,
                 boolean isElectric) {
        this.make = make;
        this.regNumber = regNumber;
        this.isElectric = isElectric;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
