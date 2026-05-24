import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low value");
        int low = sc.nextInt();
        System.out.println("Enter High value");
        int high = sc.nextInt();
        while (low < high){
            if (checkPrimeNum(low))
                System.out.print(low + " ");
            ++low;
        }
        sc.close();
    }
    //create function
    public static boolean checkPrimeNum(int num){
        boolean flag = true;
        for (int i = 2; i<=num/2; ++i){
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
