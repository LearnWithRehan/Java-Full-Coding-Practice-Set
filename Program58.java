import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal num:-  ");
        double num = sc.nextDouble();
        System.out.format("Formatted value: %.2f", num);
        sc.close();
    }
}
