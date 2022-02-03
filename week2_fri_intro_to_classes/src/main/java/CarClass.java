public class CarClass {

    //this section highlights the properties of the 'CarClass' Class
    private CarManufacturer manufacturer;
    private double price;
    private CarEngine engine;

    //----CONSTRUCTOR-------
    public CarClass(CarManufacturer manufacturer,
                    double price,
                    CarEngine engine) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engine = engine;
    }

    //all the methods associated with an object of this class
    //Starting off with the GETTERS

    //this method allows user to use getManufacturer() method, and it will return the manufacturer property of the Car class
    public CarManufacturer getManufacturer() {
        return manufacturer;
    }

    //this method will return the price property of the Car class
    public double getPrice() {
        return price;
    }

    //this method will return the engine property which has been made equal to 'engine' value of datatype Engine (Enum) through the constructor
    public CarEngine getEngine() {
        return engine;
    }

    //Now moving onto the SETTERS

    public void setManufacturer(CarManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    //this toString() overrides the superclass Object's toString()
    @Override
    public String toString() {
        return "CarClass {Manufacturer = " + manufacturer + ", Price = " + price + ", Engine = " + engine + "}";
    }
}
