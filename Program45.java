import java.util.Scanner;

public class Program45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        int[][] sum = new int[rows][columns];
        //input first matrix
        System.out.println("Enter first matrix elements");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        //input second matrix
        System.out.println("Enter second matrix elements");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        //add matrices
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                sum[i][j] = firstMatrix[i][j] +
                        secondMatrix[i][j];
            }
        }
        //Display result
        System.out.println("Sum of two matrices:");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                System.out.printf(sum[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}