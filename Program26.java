import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low num");
        int low = sc.nextInt();
        System.out.println("Enter high num");
        int high = sc.nextInt();
        while (low < high){
            boolean flag = false;
            for (int i = 2; i<=low/2; ++i){
                //condition for nonprime num
                if (low % i == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag && low !=0 && low != 1)
                System.out.print(low + " ");
            ++low;
        }
    }
}
