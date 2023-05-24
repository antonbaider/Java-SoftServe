

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex {
    double a;
    double b;

    public Ex() {
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter div number: ");

        try {
            double b = sc.nextDouble();
            System.out.println(div(22.0, b));
        } catch (ArithmeticException var4) {
            System.out.println("Division by 0");
        } catch (NumberFormatException | InputMismatchException var5) {
            System.err.println("Wrong number");
        } catch (Exception var6) {
            System.err.println("Something else...");
        }

    }
}
