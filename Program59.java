import java.util.Arrays;
import java.util.Scanner;

public class Program59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first array size
        System.out.print("Enter size of first array: ");
        int aLen = sc.nextInt();
        int[] array1 = new int[aLen];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i<aLen; i++){
            array1[i] = sc.nextInt();
        }
        //second array size
        System.out.print("Enter size of second array: ");
        int bLen = sc.nextInt();
        int[] array2 = new int[bLen];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i<bLen; i++){
            array2[i] = sc.nextInt();
        }
        //Merge Arrays
        int[] result = new int[aLen + bLen];
        System.arraycopy(array1, 0, result,0,aLen);
        System.arraycopy(array2,0,result,aLen,bLen);
        System.out.println("Merged Array: " + Arrays.toString(result));
        sc.close();
    }
}