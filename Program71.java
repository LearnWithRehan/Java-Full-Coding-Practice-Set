import java.util.Scanner;

public class Program71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of bytes: ");
        int size = sc.nextInt();
        byte[] bytes = new byte[size];
        //user input
        System.out.println("Enter byte value:-");
        for (int i =0; i<size; i++){
            bytes[i] = sc.nextByte();
        }
        //convert to Hexadecimal
        System.out.print("Hexadecimal Output: ");
        for (byte b : bytes){
            String st = String.format("%02X", b);
            System.out.print(st + " ");
        }
        sc.close();
    }
}
