import java.util.Scanner;

public class Program91 {
    public static void main(String[] args) {

        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        //create int variables
        int a = sc.nextInt();
        System.out.println("Enter second value");
        int b= sc.nextInt();
        //convert int into double
        //using typecasting
        double c = a;
        double d = b;
        System.out.println("Double value " + c);
        System.out.println("Double value " + d);
        sc.close();
    }
}
