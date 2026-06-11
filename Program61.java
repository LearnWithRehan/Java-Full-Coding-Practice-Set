import java.util.Scanner;

public class Program61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements:- ");
        for (int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter number to search:- ");
        int found = sc.nextInt();
        boolean isFound = false;
        for (int n : array){
            if (n == found){
                isFound = true;
                break;
            }
        }
        if (isFound){
            System.out.println(found + " number is available");
        }else {
            System.out.println(found + " number is not available");
        }
        sc.close();
    }
}