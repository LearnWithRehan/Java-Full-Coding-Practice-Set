import java.util.Scanner;

public class Program60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:- ");
        char ch = sc.next().charAt(0);
        String str = Character.toString(ch);
        if (Character.isUpperCase(ch)){
            System.out.println(str + " is an Uppercase Letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(str + " is a Lowercase Letter");

        } else if (Character.isDigit(ch)) {
            System.out.println(str + " is a Digit");

        }else {
            System.out.println(str + " is a special Character");
        }
        sc.close();
    }
}