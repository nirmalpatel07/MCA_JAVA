class Rectangle {
    // Instance variables
    private double length;
    private double width;

    // Static variable to count the number of Rectangle objects created
    private static int count = 0;

    // Instance initializer block
    {
        System.out.println("Instance Initializer Block: This block runs when an object is created.");
    }

    // Static initializer block
    static {
        System.out.println("Static Initializer Block: This block runs when the class is loaded.");
    }

    // Default constructor
    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
        count++;  // Increment count when an object is created
        System.out.println("Default constructor: Length = " + length + ", Width = " + width);
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        count++;  // Increment count when an object is created
        System.out.println("Parameterized constructor: Length = " + length + ", Width = " + width);
    }

    // Copy constructor
    public Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
        count++;  // Increment count when an object is created
        System.out.println("Copy constructor: Length = " + length + ", Width = " + width);
    }

    // Method to calculate area of the rectangle
    public double area() {
        return this.length * this.width;
    }

    // Method to display the values of the instance variables
    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
    }

    // Static method to display the total count of objects created
    public static void displayCount() {
        System.out.println("Total number of Rectangle objects created: " + count);
    }
}

public class pro14 {
    public static void main(String[] args) {
        // Creating Rectangle objects using different constructors
        System.out.println("Creating Default Rectangle Object:");
        Rectangle r1 = new Rectangle();
        r1.display();
        System.out.println("Area of Rectangle 1: " + r1.area());
        System.out.println();

        System.out.println("Creating Parameterized Rectangle Object:");
        Rectangle r2 = new Rectangle(5.0, 3.0);
        r2.display();
        System.out.println("Area of Rectangle 2: " + r2.area());
        System.out.println();

        System.out.println("Creating Copy of Rectangle Object:");
        Rectangle r3 = new Rectangle(r2);  // Copy constructor
        r3.display();
        System.out.println("Area of Rectangle 3: " + r3.area());
        System.out.println();

        // Display the total count of Rectangle objects created
        Rectangle.displayCount();
    }
}
