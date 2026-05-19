import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base num");
        int base = sc.nextInt();
        System.out.println("Enter exponent num");
        int exponent = sc.nextInt();
        long result = 1;
        while (exponent != 0){
            result *= base;
            --exponent;
        }
        System.out.println(result);
    }
}
