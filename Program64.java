import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Program64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter milliseconds: ");
        long milliseconds = sc.nextLong();
        //convert millisecond to second
        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        //convert millisecond to minute
        long minute = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
        System.out.println(milliseconds + " Milliseconds " +
                seconds + "seconds");
        System.out.println(milliseconds + " Milliseconds = " +
                minute + " Minutes");
        sc.close();
    }
}
