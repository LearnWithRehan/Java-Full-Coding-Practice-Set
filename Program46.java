import java.util.Scanner;

public class Program46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first matrix size
        System.out.println("Enter rows of first matrix");
        int r1 = sc.nextInt();
        System.out.println("Enter column of first matrix");
        int c1 = sc.nextInt();
        System.out.println("Enter rows of second matrix");
        int r2 = sc.nextInt();
        System.out.println("Enter column of second matrix");
        int c2 = sc.nextInt();
        //check multiplication condition
        if (c1 != r2){
            System.out.println("Matrix multiplication is not possible");
            return;
        }
        int[][] firstMatrix = new int[r1][c1];
        int[][] secondMatrix = new int[r2][c2];
        int[][] product = new int[r1][c2];
        //input first matrix
        System.out.println("Enter elements of first matrix");
        for (int i = 0; i<r1; i++){
            for (int j = 0; j<c1; j++){
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        //input second matrix
        System.out.println("Enter elements of second matrix");
        for (int i =0; i<r2; i++){
            for (int j = 0; j<c2; j++){
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        //matrix multiplication
        for (int i =0; i<r1; i++){
            for (int j = 0; j<c2; j++){
                for (int k = 0; k<c1; k++){
                    product[i][j] += firstMatrix[i][k] *
                            secondMatrix[k][j];
                }
            }
        }
        //Display Result
        System.out.println("\n Multiplication of two matrix");
        for (int i = 0; i<r1; i++){
            for (int j = 0; j<c2; j++){
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();

    }
}
