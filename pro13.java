class Student {
    // Instance variables
    private int enrollmentNo;
    private String name;
    
    // Static variable
    private static int count = 0;

    // Constructor to initialize instance variables
    public Student(int enrollmentNo, String name) {
        this.enrollmentNo = enrollmentNo; // Use 'this' to refer to instance variable
        this.name = name; // Use 'this' to refer to instance variable
        count++; // Static variable can be accessed directly (without 'this')
    }

    // Method to display the student's details
    public void display() {
        System.out.println("Enrollment No: " + this.enrollmentNo); // Accessing instance variable using 'this'
        System.out.println("Name: " + this.name); // Accessing instance variable using 'this'
        
        // Static variable access without 'this' keyword (because 'count' is a class variable)
        System.out.println("Total Students Created: " + count); 
    }

    // Method to check if 'this' can access static variable
    public void checkStaticAccess() {
        // 'this' cannot access static variables directly, but it can access them indirectly
        System.out.println("Accessing static count via 'this': " + this.count);  // This works but is unnecessary.
    }

    // Static method to display the total count of students
    public static void displayCount() {
        System.out.println("Total number of Student objects created: " + count);
    }
}

public class pro13 {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student(1001, "Arun");
        Student student2 = new Student(1002, "Hiren");

        // Display student details
        student1.display();
        student2.display();

        // Check if 'this' can access static variable
        student1.checkStaticAccess();
        student2.checkStaticAccess();
        
        // Display total student count (static method)
        Student.displayCount();
    }
}
