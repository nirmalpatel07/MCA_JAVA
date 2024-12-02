public class pro17 {
    // Instance variable
    private double radius;

    // Static variable to count the number of instances created by the default constructor
    private static int instanceCount = 0;

    // Default constructor (calls parameterized constructor)
    public pro17() {
        this(1.0);  // Chaining to the parameterized constructor
        instanceCount++;  // Increment count only for default constructor
        System.out.println("Default Constructor: Circle with radius = " + radius);
    }

    // Parameterized constructor to set the radius value
    public pro17(double radius) {
        this.radius = radius;
        System.out.println("Parameterized Constructor: Circle with radius = " + radius);
    }

    // Method to get the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Static method to display the number of instances created using default constructor
    public static void displayInstanceCount() {
        System.out.println("Number of Circle instances created using default constructor: " + instanceCount);
    }

    // Main method to demonstrate the behavior
    public static void main(String[] args) {
        // Creating Circle objects using default constructor
        pro17 circle1 = new pro17();  // This will call default constructor
        pro17 circle2 = new pro17();  // This will call default constructor
        pro17 circle3 = new pro17();  // This will call default constructor

        // Creating a Circle object using parameterized constructor
        pro17 circle4 = new pro17(5.0);  // This will call parameterized constructor

        // Display the instance count
        pro17.displayInstanceCount();
    }
}
