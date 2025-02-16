public class Car {
    // Attributes (Data Fields)
    public String make;
    public String model;
    private int year;

    // Constructor
    public Car(String carMake, String carModel, int carYear) {
        this.make = carMake;
        this.model = carModel;
        this.year = carYear;
    }

    // Overriding toString() to return all data field values as a String
    @Override
    public String toString() {
        return "Car Make: " + make + ", Model: " + model + ", Year: " + year;
    }

    public static void main(String[] args) {
        // Creating instances of Car class
        Car carShree = new Car("Hyundai", "VeraCruz", 2011);
        Car carFriend = new Car("Toyota", "Camry", 2020);

        // Replace this with your dream car details
        Car carYourName = new Car("Lamborghini", "Huracan", 2024);

        // Printing details of all car instances
        System.out.println(carShree.toString());
        System.out.println(carFriend.toString());
        System.out.println(carYourName.toString());
    }
}
