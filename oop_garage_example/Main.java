import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //create Person, Car, Garage, and Garage Service classes
        //Person, Car, Garage are all POJOs (Plain-Old Java Objects)
        //Garage Service class carries out all the functions (conducts all the business logic)
        //all of these are called upon through this file, the Main class

        // Garage Service class performs all business logic for the following:
        // 1. add cars - DONE
        // 2. how many cars in the garage - DONE
        // 3. number of free spots in garage - DONE
        // 4. Open and close garage - DONE
        // 5. filter electric cars - DONE
        // 6. filter non electric cars - DONE
        // 7. Clean garage. Remove all cars and put them back and in between print garage cleaned - DONE
        // 8. Create GarageDAO class and store current cars in garage to a file
        // 9. Create a second method to read cars from a file

        //--------CREATING 'Cars' INSTANCES/OBJECTS------------
        Cars car1 = new Cars("Tesla", "1234", true); //creating instance car1
        Cars car2 = new Cars("BMW", "4321", false); //creating instance car2

        Cars[] darshilCars = {car1, car2}; //putting all cars owned by Darshil in darshilCars array

        Person darshil = new Person("Darshil", 23, "darshil@email.com", darshilCars); //creating an
        // instance of class 'Person' named 'darshil'. Final parameter is array 'darshilCars' highlighting which cars
        //are owned by "Darshil"
        System.out.println(darshil.toString()); //printing the Person object 'darshil'



        Garage garage1 = new Garage("Garage1", darshil, 5); //creating instance of class 'Garage' named
        // garage1
        GarageService garageService = new GarageService(); //creating garageService instance
        garage1.setOpen(true); //when addCar() method was originally run without this line, an IllegalStateException was
        //thrown saying the garage is closed. This opens it.
        garageService.addCar(garage1, darshilCars); //this adds darshilCars array from above to garage1

        System.out.println(garage1.toString());

        Cars[] electricCars = garageService.filterByElectric(garage1, true); //this filters through all cars in
        //garage 1 and returns all the cars that are electric
        System.out.println(Arrays.toString(electricCars));

        garageService.cleanGarage(garage1, darshilCars); //this cleans garage1 and after emptying out the garage, adds
        //back darshilCars into the garage1



    }
}

