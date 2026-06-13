import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        //list1 input
        System.out.print("How many elements in List1? ");
        int n1 = sc.nextInt();
        sc.nextLine();//consume new line
        System.out.println("Enter elements for list1:");
        for (int i = 0; i<n1; i++){
            list1.add(sc.nextLine());
        }
        //list2 input
        System.out.print("How many elements in list2? ");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter elements for List2:");
        for (int i = 0; i<n2; i++){
            list2.add(sc.nextLine());
        }
        //join lists
        List<String> joined = new ArrayList<>();
        joined.addAll(list1);
        joined.addAll(list2);
        //output
        System.out.println("\nList1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Joined List: " + joined);
        sc.close();
    }
}