import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Number of terms");
        int num = sc.nextInt();
        int first =0, second = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i<=num; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
