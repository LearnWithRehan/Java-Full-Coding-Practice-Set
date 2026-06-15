import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();
        sc.nextLine(); //new line
        //create array
        String[] array = new String[size];
        //user input
        System.out.println("Enter elements:");
        for (int i = 0; i<size; i++){
            array[i] = sc.nextLine();
        }
        //convert Array to Set
        Set<String> set = new HashSet<>(Arrays.asList(array));
        //display set
        System.out.println("Set: " + set);
        sc.close();
    }
}
