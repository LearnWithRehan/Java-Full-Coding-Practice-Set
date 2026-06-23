import java.util.Scanner;

public class Program82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:-");
        String str = sc.nextLine();
        boolean numeric = true;
        try {
            Double.parseDouble(str);
        }catch (NumberFormatException e ){
            numeric = false;
        }
        if (numeric)
            System.out.println(str + " is a number");
        else
            System.out.println(str + " is not a number");
        sc.close();
    }
}
