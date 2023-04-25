import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {
    private static float n1;
    private static float n2;
    private static float n3;
    private static int count = 0;

    public Main() {
        int count = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter second number: ");
        n2 = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter third number: ");
        n3 = Float.parseFloat(scanner.nextLine());
        scanner.close();

        if ((n1 > -5) && (n1 < 5)) {
            count++;
        }
        if ((n2 > -5) && (n2 < 5)) {
            count++;
        }
        if ((n3 > -5) && (n3 < 5)) {
            count++;
        }
        System.out.println("The quantity of numbers that belong to the range [-5, 5]: " + count);
    }
}

