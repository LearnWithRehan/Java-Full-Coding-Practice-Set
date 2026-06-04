import java.util.Scanner;

public class Program48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        int row = sc.nextInt();
        System.out.println("Enter num of columns");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter matrix elements");
        for (int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n Original Matrix");
        for (int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] transpose = new int[column][row];
        for (int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("\n Transpose Matrix");
        for (int i = 0; i<column; i++){
            for (int j=0; j<row; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}