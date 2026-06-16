import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class Program74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        try {
           int result = num1 / num2;
            System.out.println("Result: " + result);
        }catch (Exception e){
            //convert stack to string
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String exceptionAsString = sw.toString();
            System.out.println("\nStack Trace as String:");
            System.out.println(exceptionAsString);
        }
        sc.close();
    }
}