import java.util.Scanner;

public class Program51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to enter?");
        int n = sc.nextInt();
        sc.nextLine(); //consume newline
        String[] words = new String[n];
        System.out.println("Enter " + n + " words: ");
        for (int i = 0; i<n; i++){
            words[i] = sc.nextLine();
        }
        //sorting in Lexicographical order
        for (int i = 0; i<n-1; i++){
            for (int j = i + 1; j<n; j++){
                if (words[i].compareTo(words[j])> 0){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("\n Words in Lexicographical order:");
        for (int i = 0; i<n; i++){
            System.out.println(words[i]);
        }
        sc.close();
    }
}