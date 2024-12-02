// pro8.java
import java.util.Scanner;

public class pro8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions and elements of the first matrix
        System.out.print("Enter rows and columns for the first matrix: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int[][] mat1 = new int[rows1][cols1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Input dimensions and elements of the second matrix
        System.out.print("Enter rows and columns for the second matrix: ");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. Number of columns of the first matrix must equal number of rows of the second matrix.");
            return;
        }
        int[][] mat2 = new int[rows2][cols2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Multiply the matrices
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
