import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("ASCII Value is: " + ascii);
    }
}
