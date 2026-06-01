import java.util.Scanner;

public class Program42 {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array");
        int size = sc.nextInt();
        double[] numbers = new double[size];
        System.out.println("Enter array elements");
        for (int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        double sum = 0;
        //for each loop
        for (double num : numbers){
            sum += num;
        }
        //average
        double average = sum / numbers.length;
        System.out.println("Average:- " + average);
        sc.close();
    }
}
