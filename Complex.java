import java.util.Scanner;

public class Complex {
    double real;
    double imag;
    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of first complex num");
        double real1 = sc.nextDouble();
        System.out.println("Enter imaginary part of first comples num ");
        double img1 = sc.nextDouble();
        System.out.println("Enter real part of second complex num");
        double real2 = sc.nextDouble();
        System.out.println("Enter imaginary part of second complex num");
        double imag2 = sc.nextDouble();
        Complex n1 = new Complex(real1,img1);
        Complex n2 = new Complex(real2, imag2);
        Complex temp = add(n1,n2);
        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
        sc.close();
    }

    public static Complex add(Complex n1, Complex n2){
        Complex temp = new Complex(0.0,0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        return temp;
    }

}