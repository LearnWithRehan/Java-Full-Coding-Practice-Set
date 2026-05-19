import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        boolean flag = false;
        //0 and 1 are not prime num
        if (num == 0 || num == 1){
            flag = true;
        }

        for (int i = 2; i<=num/2; ++i){
            //condition for nonprime num
            if (num % i == 0){
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(num + " is a prime num");
        }else {
            System.out.println(num + " is not a prime num");
        }
        sc.close();
    }
}
