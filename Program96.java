import java.util.Arrays;
import java.util.Scanner;

class Program96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:-");
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i<n - 1; i++){
            for (int j =0; j<n-i-1; j++){
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}