import java.util.Scanner;

import static java.lang.Double.sum;

public class Main {
    public double numberA;
    public double numberB;
    private static int count = 0;
    public Main() {
        count++;
    }
    public static double getTotal(double numberA, double numberB) {
        return sum(numberA, numberB);
    }

    public static double getAverage(double numberA, double numberB) {
        return sum(numberA, numberB) / count;
    }

    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numberA = getNumber(scanner, "Enter the number A: ");
        count++;
        double numberB = getNumber(scanner, "Enter the number B: ");
        count++;
        double sum = getTotal(numberA, numberB);
        double avg = getAverage(numberA, numberB);

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + avg);

        scanner.close();
    }

}
