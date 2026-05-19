import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String revstr = "";
        int lenth = str.length();
        for (int i = (lenth-1); i>=0; --i){
            revstr = revstr + str.charAt(i);
        }
        if (str.toLowerCase().equals(revstr.toLowerCase())){
            System.out.println(str + " is a Palindrome String");
        }else {
            System.out.println(str + " is not a Palindrome String");
        }
        sc.close();
    }
}
