import java.util.Scanner;

public class Program90 {
    public static void main(String[] args) {
        //form user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        //create int variable
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        //convert int to string
        //using valueOf()
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        //print string variables
        System.out.println(str1);
        System.out.println(str2);
    }
}
