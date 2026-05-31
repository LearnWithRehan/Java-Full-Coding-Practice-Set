import java.util.Scanner;

public class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentenc = sc.nextLine();
        String reversed = reverse(sentenc);
        System.out.println("The reversed sentence is: " + reversed);
    }
    public static String reverse(String sentence){
        if (sentence.isEmpty())
            return sentence;
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}
