import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();
        //befor swaping
        System.out.println("First num = " + a);
        System.out.println("Secnd num = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping");
        System.out.println("a = " + a + " b = " + b);
    }
}
