public class CarMain {
    public static void main(String[] args) {
        CarClass bmw = new CarClass(CarManufacturer.BMW, 50_000, CarEngine.PETROL);

//        //testing the getters
//        System.out.println(car.getManufacturer());
//        System.out.println(car.getPrice());
//        System.out.println(car.getEngine());
//
//        //testing the setters
//        car.setManufacturer(CarManufacturer.TESLA);
//        car.setEngine(CarEngine.ELECTRIC);
//        System.out.println(car.toString());

        CarClass tesla = new CarClass(CarManufacturer.TESLA, 50_000, CarEngine.ELECTRIC);
        CarClass ford = new CarClass(CarManufacturer.FORD, 40_000, CarEngine.PETROL);
        CarClass mercedes = new CarClass(CarManufacturer.MERCEDES, 60_000, CarEngine.PETROL);
        CarClass honda = new CarClass(CarManufacturer.HONDA, 30_000, CarEngine.DIESEL);


        //testing the toString() method that I put in
        System.out.println();
    }
}
