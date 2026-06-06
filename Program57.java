import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date(yyyy-MM-dd): ");
        String strdate = sc.nextLine();
        LocalDate date = LocalDate.parse(strdate, DateTimeFormatter.ISO_DATE);
        System.out.println("Parsed Date: " + date);
        sc.close();
    }
}
