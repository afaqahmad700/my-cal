import java.util.Scanner;

/**
 * Created by afaq on 11/18/18.
 */
public class Calculator {

    protected int storeUserOption;

    protected void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nMenu:\nplease select operation to perform:\n 1.add \n 2.subtract " +
                "\n 3.multiply \n 4.divide \n 5.modulus \n 6.Quadratic Formula\n 7.Factorial \n 8.exit\n");
        storeUserOption = scan.nextInt();
    }

    protected int add(int a, int b) {
        return a + b;
    }

    protected int subtract(int a, int b) {
        return a - b;
    }

    protected int multiply(int a, int b) {
        return a * b;
    }

    protected int divide(int a, int b) {
        return a / b;
    }

    protected int modulus(int a, int b) {
        return a % b;
    }

    protected void Quadratic(double a, double b, double c) {
        double root1, root2;
        double determinant = Math.pow(b,2) - 4 * a * c;
        if ( determinant > 0 ) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = " + root1 + " root2 =" + root2);
        }else if ( determinant == 0 ) {
            root1 = root2 = -b / (2 * a);
            System.out.println("root1 = " + root1 + " root2 = " + root2);
        }else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("root1 = + " + realPart + imaginaryPart + " root2 = " + realPart + imaginaryPart);
        }
    }
    protected void factorial(long number){
        long i,f=1;
        for (i=1; i<=number; i++){
            f *= i;
        }
        System.out.println("The Factorial of a "+ number + " is: " + f);
    }
}
