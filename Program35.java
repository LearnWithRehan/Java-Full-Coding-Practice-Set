import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        long factorial = multiplyNum(num);
        System.out.println("Factorial of "
        + num + " " + factorial);
        sc.close();
    }

    public static long multiplyNum(int num){
        if (num >= 1){
            return num * multiplyNum(num-1);
        }else {
            return 1;
        }
    }
}
