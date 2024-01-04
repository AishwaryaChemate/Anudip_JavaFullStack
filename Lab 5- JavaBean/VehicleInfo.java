package zpracticals.lab5;
//Show constructor overloading in Vehicle class
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor with no parameters
    public Vehicle() {
        System.out.println("This is vehicle constructor with no parameters...");
    }

    // Constructor with brand and model parameters
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        
    }

    // Constructor with brand, model, and year parameters
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
    	System.out.println("*****Information of Vehicles******");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}

public class VehicleInfo {
    public static void main(String[] args) {
    	
        // Creating vehicles using different constructors
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Toyota", "Fortuner");
        Vehicle vehicle3 = new Vehicle("Honda", "Verna", 2023);

        
        vehicle1.displayInfo();
        vehicle2.displayInfo();
        vehicle3.displayInfo();
    }
}
