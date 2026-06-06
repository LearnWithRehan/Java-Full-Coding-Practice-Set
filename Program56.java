import java.util.Scanner;

public class Program56 {
    public static void main(String[] args) {
        //from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }
        for (int ele : array){
            System.out.print(ele + " ");
        }
        sc.close();

    }
}
