// Program to calculate row-wise sum for a matrix with varied column lengths
import java.util.Scanner;

class Matrix {
    int[][] array; // 2D array to hold matrix values

    // Constructor to initialize the matrix
    public Matrix(int rows) {
        array = new int[rows][];
    }

    // Method to input matrix values
    public void inputMatrix(Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            array[i] = new int[cols]; // Initialize each row with its column size

            System.out.println("Enter " + cols + " values for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }

    // Method to calculate and print the sum of each row
    public void printRowSums() {
        System.out.println("Row-wise sums:");
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int value : array[i]) {
                sum += value;
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }
}

public class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();

        // Create Matrix object
        Matrix matrix = new Matrix(rows);

        // Input matrix values
        matrix.inputMatrix(sc);

        // Calculate and print row-wise sums
        matrix.printRowSums();

        sc.close();
    }
}
