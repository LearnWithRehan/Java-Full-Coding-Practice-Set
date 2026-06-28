import java.util.Scanner;

public class Program93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:- ");
        String str = sc.nextLine();

        //handle exceptions
        try{
            double num = Double.parseDouble(str);
            System.out.println("Double value:- " + num);
        }catch (NumberFormatException e){
            System.out.println("invalid input! please enter a valid num");
        }

        sc.close();
    }
}
