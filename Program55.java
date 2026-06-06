import java.util.Scanner;

public class Program55 {
    public static void main(String[] args) {
        //input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence:-");
        String sentence = sc.nextLine();
        System.out.println("Original Sentence:- " + sentence);
        sentence = sentence.replaceAll("\\s","");
        System.out.println("After replacement:- " + sentence);
        sc.close();
    }
}
