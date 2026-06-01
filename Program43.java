import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array");
        int size = sc.nextInt();
        //create array
        int[] numArray = new int[size];
        System.out.println("enter array elements");
        for (int i  = 0; i<size; i++){
            numArray[i] = sc.nextInt();
        }
        int largest = numArray[0];
        for (int num : numArray){
            if (largest < num){
                largest = num;
            }
        }
        System.out.println("Largest Elements:- " + largest);
        sc.close();
    }
}
