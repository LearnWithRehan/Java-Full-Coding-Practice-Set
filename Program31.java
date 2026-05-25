import java.util.Scanner;

public class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Positive Number");
        int number = sc.nextInt();
        System.out.print("Factors of " + number+ " are:- ");
        //loop runs from 1 to number
        for (int i=1; i<=number; ++i){
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
