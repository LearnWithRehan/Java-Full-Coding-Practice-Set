import java.util.Scanner;

public class Program47 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        // Matrix multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] firstMatrix = new int[r1][c1];
        int[][] secondMatrix = new int[r2][c2];

        // Input First Matrix
        System.out.println("Enter elements of First Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }

        // Input Second Matrix
        System.out.println("Enter elements of Second Matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }

        int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);

        displayProduct(product);

        sc.close();
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix,
                                           int r1, int c1, int c2) {

        int[][] product = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void displayProduct(int[][] product) {
        System.out.println("\nProduct of two matrices:");

        for (int[] row : product) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}