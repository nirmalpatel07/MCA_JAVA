class Student {
    // Instance variables
    private int enrollmentNo;
    private String name;
    private String gender;
    private double marks;
    
    // Static variable to count number of Student objects created
    private static int count = 0;

    // Constructor 1: Initializes all instance variables
    public Student(int enrollmentNo, String name, String gender, double marks) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
        count++; // Increment the count whenever a new object is created
    }

    // Constructor 2: Calls Constructor 1 using constructor chaining
    public Student(int enrollmentNo, String name, String gender) {
        this(enrollmentNo, name, gender, 0.0); // Default marks to 0.0
    }

    // Constructor 3: Calls Constructor 2 using constructor chaining
    public Student(int enrollmentNo, String name) {
        this(enrollmentNo, name, "Not Specified"); // Default gender to "Not Specified"
    }

    // Method to display all the details of the student
    public void display() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Marks: " + marks);
    }

    // Static method to display the total count of Student objects created
    public static void displayCount() {
        System.out.println("Total number of Student objects created: " + count);
    }
}

public class pro12 {
    public static void main(String[] args) {
        // Create Student objects using different constructors
        Student student1 = new Student(1001, "Arun", "Male", 85.5);
        Student student2 = new Student(1002, "Hiren", "Male");
        Student student3 = new Student(1003, "Neha");

        // Display student details
        System.out.println("Student 1 Details:");
        student1.display();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.display();
        System.out.println();

        System.out.println("Student 3 Details:");
        student3.display();
        System.out.println();

        // Display total count of students created
        Student.displayCount();
    }
}
