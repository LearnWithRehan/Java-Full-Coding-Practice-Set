import java.util.Scanner;

public class Program79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String str1 = sc.next();
        System.out.println("Enter second String");
        String str2 = sc.next();
        //condition
        if (str1.equals(str2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
        sc.close();
    }
}
