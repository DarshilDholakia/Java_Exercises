package com.bnta.Exercises.week2_fri_intro_to_classes.src.main.java;

import java.util.Arrays;

public class DealershipClass {
    private String name;
    private int maxDisplayNumber;
    private CarClass[] currentCars;

    //--------CONSTRUCTOR 1 for an established dealership-----------
    public DealershipClass(String name,
                           int maxDisplayNumber) {
        this.name = name;
        this.maxDisplayNumber = maxDisplayNumber;
        this.currentCars = new CarClass[maxDisplayNumber];
    }

    //---------CONSTRUCTOR 2 for a brand new dealership-----------
    public DealershipClass(String name) { //this constructor ensures that when a new dealership is instantiated as an object, you can pass only the name (don't need to enter display and total cars)
        this.name = name;
    }

    //--------COUNTING CARS METHOD-----------
    public int countCars() {
        int totalCars = 0; //initialises the totalCars variable to 0
        for (int i = 0; i < this.maxDisplayNumber; i++) { //loop from 0 to whatever the maxDisplayNumber property is set
            //to for each dealership object by the user, in our case, this was set to 20.
            if (this.currentCars[i] != null) { //if the current position in the currentCars array (which is an array of
                // objects of class CarClass) is not null, increment the totalCars variable
                totalCars++;
            }
        }
        return totalCars; //this returns the totalCars int variable which will show exactly how many objects of CarClass
        //class are in the currentCars array - initially, this will return 0 because we have not added any car (using
        //the addCar() method below) objects of CarClass class to the dealership object of class DealershipClass
    }

    //--------ADDING CARS METHOD-------------
    public void addCar(CarClass newCar) {
        for (int i = 0; i < this.maxDisplayNumber; i++) {
            if (currentCars[i] == null) {
                this.currentCars[i] = newCar; //the first space in the currentCars array that is empty, add the newCar
                // to that space
                break; //once a car is added, break out from the if and for loop
            }
        }
    }

    //---------CREATING A toString() METHOD------------
    public String toString() {
        return "DealershipClass {Name = " + name + ", Display Cars = " + maxDisplayNumber + ", Current stock = "
                + Arrays.deepToString(currentCars) + "}";
    }
    //this method prints 3 properties for each dealership object: name, maxDisplayNumber, and currentCars.
    // Arrays.deepToString() was used as currentCars is an array of objects (namely newCar1, newCar2)
    // and Arrays.toString() can only be used when passing in primitive data types.

    //----------findCarByManufacturer() METHOD------------
    public CarClass findCarByManufacturer(String manufacturerInput) {
        CarManufacturer enumInput = CarManufacturer.valueOf(manufacturerInput); //converts the String input,
        //manufacturerInput into an enum because we have defined car makes as enums. .valueOf() method is a method of
        //the CarManufacturer Enum and takes string input and returns enumInput which is of datatype CarManufacturer
        CarClass output = null;
        for (int i = 0; i < this.maxDisplayNumber; i++) { //difference between this.maxDisplayNumber and just
            //maxDisplayNumber??
            if (currentCars[i].getManufacturer() == enumInput) {//if the current position in the currentCars array
                //consists of a CarClass object of which the manufacturer is equal to enumInput, the output (called
                //output) will return the CarClass object at that position where if statement is true and then breaks
                //out of the loop as we only want the first object in the currentCars array that matches
                output = currentCars[i];
                break;
            }
        }
        return output;
    }
}


