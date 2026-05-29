import java.util.Scanner;

public class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal = sc.nextInt();
        int octal = ConvertDeciToOcta(decimal);
        System.out.printf("%d in decimal = %d in octal",
                decimal,octal);
        sc.close();

    }
    public static int ConvertDeciToOcta(int decimal){
        int octalNum = 0, i = 1;
        while (decimal != 0){
            octalNum += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        return octalNum;
    }
}
