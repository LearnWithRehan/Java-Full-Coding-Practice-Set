import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int n1 = sc.nextInt();
        System.out.println("Enter second num");
        int n2 = sc.nextInt();
        //initially set to gcd
        int gcd = 1;
        for (int i = 1; i<=n1 && i<=n2; ++i){
            //check if I perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
        sc.close();
    }
}
