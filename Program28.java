import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low value");
        int low = sc.nextInt();
        System.out.println("Enter high value");
        int high = sc.nextInt();
        for (int number = low + 1; number < high; ++number){
            int digits = 0;
            int result = 0;
            int originalnumber = number;
            //number of digits calculation
            while (originalnumber != 0){
                originalnumber /= 10;
                ++digits;
            }
            originalnumber = number;
            //result contains sum of nth power of its digits
            while (originalnumber != 0){
                int remainder = originalnumber % 10;
                result += Math.pow(remainder,digits);
                originalnumber /= 10;
            }
            if (result == number){
                System.out.print(number + " ");
            }
        }
        sc.close();
    }
}
