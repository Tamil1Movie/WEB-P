import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matrix size input (must be compatible for multiplication)
        System.out.print("Enter number of rows for Matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix 1 / rows for Matrix 2: ");
        int cols1_rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix 2: ");
        int cols2 = scanner.nextInt();

        // Input Matrix 1
        int[][] matrix1 = new int[rows1][cols1_rows2];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols1_rows2; j++)
                matrix1[i][j] = scanner.nextInt();

        // Input Matrix 2
        int[][] matrix2 = new int[cols1_rows2][cols2];
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < cols1_rows2; i++)
            for (int j = 0; j < cols2; j++)
                matrix2[i][j] = scanner.nextInt();

        // Matrix Addition (only if dimensions are same)
        if (rows1 == cols1_rows2 && cols1_rows2 == cols2) {
            System.out.println("\nMatrix Addition:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    int sum = matrix1[i][j] + matrix2[i][j];
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix Addition not possible: Dimensions do not match.");
        }

        // Matrix Multiplication (Matrix1 x Matrix2)
        System.out.println("\nMatrix Multiplication (Matrix1 × Matrix2):");
        int[][] product = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols1_rows2; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of Matrix 1
        System.out.println("\nTranspose of Matrix 1:");
        for (int i = 0; i < cols1_rows2; i++) {
            for (int j = 0; j < rows1; j++) {
                System.out.print(matrix1[j][i] + " ");
            }
            System.out.println();
        }

        // Transpose of Matrix 2
        System.out.println("\nTranspose of Matrix 2:");
        for (int i = 0; i < cols2; i++) {
            for (int j = 0; j < cols1_rows2; j++) {
                System.out.print(matrix2[j][i] + " ");
            }
            System.out.println();
        }
    }
}
