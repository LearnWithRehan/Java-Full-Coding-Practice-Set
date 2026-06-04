import java.util.Scanner;

public class Program49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.print("Entar a character in to find frequency:-  ");
        char ch = sc.next().charAt(0);
        //frequency stroe
        int frequency = 0;
        for (int i = 0; i<str.length(); i++){
            if (ch == str.charAt(i)){
                //frequency increase by 1
                frequency++;
            }
        }
        System.out.println("Frequency of " + ch + "=" + frequency);
        sc.close();
    }
}