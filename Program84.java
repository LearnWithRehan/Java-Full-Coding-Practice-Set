import java.util.Scanner;

public class Program84 {
    public static void main(String[] args) {
        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        //create int variables
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        //convert int to char
        //typecasting
        char a = (char) num1;
        char b = (char) num2;
        //print value
        System.out.println(a);
        System.out.println(b);
    }
}
