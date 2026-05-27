import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum = addNumbers(num);
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(int number){
        if (number != 0){
            return number + addNumbers(number-1);
        }else {
            return number;
        }
    }
}
