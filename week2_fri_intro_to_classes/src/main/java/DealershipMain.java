package com.bnta.Exercises.week2_fri_intro_to_classes.src.main.java;

public class DealershipMain {
    public static void main(String[] args) {
        DealershipClass dealership1 = new DealershipClass("Dealership 1", 20); //creating a new
        // object called "dealership1" which is of the class DealershipClass and requires 2 inputs: name and
        // maxDisplayNumber
        System.out.println(dealership1.countCars()); //returns 0 because the currentCars array, at this point, has 0
        //objects within (and it has been set to a size of 20 using "this.currentCars = new CarClass[maxDisplayNumber]"

        //--------CREATING NEW OBJECTS OF CLASS CarClass----------
        CarClass newCar1 = new CarClass(CarManufacturer.MERCEDES, 70_000, CarEngine.PETROL);
        CarClass newCar2 = new CarClass(CarManufacturer.TESLA, 60_000, CarEngine.ELECTRIC);
        CarClass newCar3 = new CarClass(CarManufacturer.BMW, 40_000, CarEngine.PETROL);
        CarClass newCar4 = new CarClass(CarManufacturer.HONDA, 20_000, CarEngine.DIESEL);
        CarClass newCar5 = new CarClass(CarManufacturer.VOLKSWAGEN, 30_000, CarEngine.PETROL);
        CarClass newCar6 = new CarClass(CarManufacturer.FORD, 30_000, CarEngine.DIESEL);


        dealership1.addCar(newCar1); //this adds the newCar1 object (of class CarClass created above) to the dealership1
        //object through the use of the addCar() method
        System.out.println(dealership1.countCars()); //prints out the number of cars in dealership1's currentCars array,
        // returns 1 because only newCar1 has been added to this array
        dealership1.addCar(newCar2);
        System.out.println(dealership1.countCars());


        System.out.println(dealership1.toString()); // prints each of the properties (name, maxDisplayNumber, currentCars)
        // for the dealership in question, which in this case is Dealership 1.

        //----------TESTING THE findCarByManufacturer() METHOD------------
        dealership1.addCar(newCar3);
        dealership1.addCar(newCar4);
        dealership1.addCar(newCar5);
        dealership1.addCar(newCar6);
        System.out.println(dealership1.toString());
        System.out.println(dealership1.findCarByManufacturer("HONDA"));

    }
}
