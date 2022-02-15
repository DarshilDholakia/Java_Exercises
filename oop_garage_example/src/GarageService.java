package com.bnta.Exercises.oop_garage_example.src;//this is a Service class which is a type of class that performs business logic
//this GarageService class, in particular, performs the following functions:

//1. countCar() - counts the number of cars present in a given Garage object
//2. addCar() - first, checks how many cars there are in the garage. Then, adds an array of cars to the first null space
//found in the garage object. If garage is not open or is full, it throws an exception.
//3. countEmptySpace() - counts how many empty spaces there are in an instance of Garage Class, if any
//4. filterByElectric() - allows user to check which cars in the garage are electric
//5. cleanGarage() - this removes the cars present in the garage, returns a cleaned statement, puts back the cars as
//they were

import java.util.Arrays;

public class GarageService {
    //this class does not need a constructor as this class will only contain methods that we want to be able to perform
    //on the cars and garage e.g. addCar, removeCar, cleanGarage etc...
    //this class performs the business logic (all business logic performing classes don't have constructors?)


    public int countCar(Garage garage) {
        int carCounter = 0;
        for (int i = 0; i < garage.getCapacity(); i++) {
            if (garage.getCurrentCars() != null) {
                carCounter++;
            }
        }
        return carCounter;
    }

    public void addCar(Garage garage, Cars[] cars) {

        //this checks for how many cars are currently in the garage.getCurrentCars() array and increments the
        //testCounter everytime a space in garage.getCurrentCars() array is not null
        if (garage.isOpen()) {
            int testCounter = 0;
            for (int i = 0; i < garage.getCurrentCars().length; i++) {
                if (garage.getCurrentCars()[i] != null) {
                    testCounter++;
                }
            }

            //below checks that there is space in the garage, if so, places 'car' in the first null space found
            //in the garage.currentCars() array
            int index = 0;
            if (testCounter < garage.getCurrentCars().length) { //if there is space in the garage...
                for (int i = 0; i < garage.getCurrentCars().length; i++) {
                    if (garage.getCurrentCars()[i] == null && index < cars.length) { //if current position in
                        //garage.getCurrentCars() array is vacant i.e. null AND the index number is smaller than the
                        //length of the input cars array (this is to make sure that if all cars in cars array have been
                        //looped through, the main for loop is broken through.
                        garage.getCurrentCars()[i] = cars[index++];
                    } else {
                        break;
                    }
                }

            } else {
                throw new IllegalStateException(garage.getName() + " is full, please try again later.");
            }
        } else {
            throw new IllegalStateException(garage.getName() + " is not open, please open before continuing.");
        }
    }

    public int countEmptySpaces(Garage garage) {
        int emptySpacesCounter = 0;
        for (int i = 0; i < garage.getCurrentCars().length; i++) {
            if (garage.getCurrentCars()[i] == null) {
                emptySpacesCounter++;
            }
        }
        return emptySpacesCounter;
    }

    public Cars[] filterByElectric(Garage garage, boolean isElectric) {
        int electricCarCount = 0;
        int nonElectricCount = 0;
        for (Cars currentCar : garage.getCurrentCars()) {
            if (currentCar != null) {
                if (currentCar.isElectric()) {
                    electricCarCount++;
                }
            }
        }

        Cars[] electricCarArray = new Cars[electricCarCount];

        int index = 0;
        for (Cars currentCar : garage.getCurrentCars()) {
            if (currentCar != null) {
                if (currentCar.isElectric()) {
                    electricCarArray[index++] = currentCar;
                }
            }
        }
        return electricCarArray;
    }

    public void cleanGarage(Garage garage, Cars[] cars) {
        for (int i = 0; i < garage.getCurrentCars().length; i++) {
            if (garage.getCurrentCars()[i] != null) {
                garage.getCurrentCars()[i] = null;
            }
        }
        System.out.println(Arrays.toString(garage.getCurrentCars()));
        System.out.println(garage.getName() + " is now clean. Please wait while the cars are now put back...");

        addCar(garage, cars);
        System.out.println(Arrays.toString(garage.getCurrentCars()));
    }

}
