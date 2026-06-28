import java.util.Scanner;

public class Program92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input from users
        System.out.println("Enter first double num:-");
        double a = sc.nextDouble();
        System.out.println("Enter second double num:-");
        double b = sc.nextDouble();
        //convert double to int using typecasting
        int c = (int) a;
        int d = (int) b;
        //print
        System.out.println("First integer:- " + c);
        System.out.println("Second integer:- " + d);
        sc.close();
    }
}
