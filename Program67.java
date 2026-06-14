import java.util.ArrayList;
import java.util.Scanner;

public class Program67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> languages = new ArrayList<>();
        System.out.print("How many languages do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();//new line
        //user input
        for (int i=1; i<=n; i++){
            System.out.print("Enter Language " + i + ": ");
            String language = sc.nextLine();
            languages.add(language);
        }
        System.out.println("\nArrayList: " + languages);

        //create String Array
        String[] arr = new String[languages.size()];
        //convert  ArrayList to Array
        languages.toArray(arr);
        System.out.print("Array: ");
        for (String item : arr){
            System.out.print(item + " ");
        }
        sc.close();
    }
}