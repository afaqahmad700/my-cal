import java.util.Scanner;

/**
 * Created by afaq on 11/18/18.
 */
public class Main {
    private Calculator obj;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Calculator obj = new Calculator();
        boolean bol = false;
        while (!bol) {
            obj.menu();
            if ( obj.storeUserOption == 1 ) {
                System.out.println("enter numbers please:");
                int x = scan.nextInt();
                int y = scan.nextInt();
                System.out.println(obj.add(x, y));
            } else if ( obj.storeUserOption == 2 ) {
                System.out.println("enter numbers please:");
                int x = scan.nextInt();
                int y = scan.nextInt();
                System.out.println(obj.subtract(x, y));
            } else if ( obj.storeUserOption == 3 ) {
                System.out.println("enter numbers please:");
                int x = scan.nextInt();
                int y = scan.nextInt();
                System.out.println(obj.multiply(x, y));
            } else if ( obj.storeUserOption == 4 ) {
                System.out.println("enter numbers please:");
                int x = scan.nextInt();
                int y = scan.nextInt();
                System.out.println(obj.divide(x, y));
            }else if ( obj.storeUserOption == 5 ){
                System.out.println("give me two number:");
                int x = scan.nextInt();
                int y = scan.nextInt();
                System.out.println(obj.modulus(x, y));
            }else if ( obj.storeUserOption == 6 ){
                System.out.println("enter values for quadratic equation:");
                double a = scan.nextDouble();
                double b = scan.nextDouble();
                double c = scan.nextDouble();
                obj.Quadratic(a, b, c);
            }else if ( obj.storeUserOption == 7 ){
                System.out.println("Enter number to find factorial:");
                long storeNumber = scan.nextLong();
                obj.factorial(storeNumber);
            }
            else if ( obj.storeUserOption == 8 ){
                System.out.println("program closed");
                System.exit(0);
            }else {
                System.out.println("please try again.");
            }
        }
    }
}
