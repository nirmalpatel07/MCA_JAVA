// Superclass Vehicle
class Vehicle {
    // Instance variable for Vehicle type
    protected String vehicle_type;

    // Constructor to initialize vehicle type
    public Vehicle(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    // Method to display information of the vehicle
    public void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
    // Additional instance variables specific to Car
    private String model_type;
    private String company_name;

    // Constructor to initialize vehicle type, model type, and company name
    public Car(String vehicle_type, String model_type, String company_name) {
        super(vehicle_type);  // Call the superclass constructor
        this.model_type = model_type;
        this.company_name = company_name;
    }

    // Overridden method to display car details (Method Overriding)
    @Override
    public void display() {
        super.display();  // Call the superclass method to display vehicle type
        System.out.println("Model Type: " + model_type);
        System.out.println("Company Name: " + company_name);
    }
}

public class pro18 {
    public static void main(String[] args) {
        // Creating a Vehicle object
        Vehicle vehicle = new Vehicle("Truck");
        System.out.println("Information of Vehicle:");
        vehicle.display();  // Display Vehicle information

        System.out.println("\nCreating a Car object...");

        // Creating a Car object (which is a subclass of Vehicle)
        Car car = new Car("Car", "Sedan", "Toyota");
        System.out.println("\nInformation of Car:");
        car.display();  // Display Car information (method overriding)
    }
}
