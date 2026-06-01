import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {
        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number");
        int base = sc.nextInt();
        System.out.println("Enter power number");
        int powerRaised = sc.nextInt();
        int result = power(base,powerRaised);
        System.out.println(base + "^" +
                powerRaised + "=" + result);

    }
    public static int power(int base, int powerRaised){
        if (powerRaised != 0){
            //recursive call to poer()
            return (base * power(base,powerRaised-1));
        }else {
            return 1;
        }
    }
}
