import java.util.Scanner;

import static java.lang.Double.sum;

public class Main {
    public double sideA;
    public double sideB;
    public double sideC;

    public Main() {

    }
    public static double getArea(double sideA, double sideB, double sideC) {
        double p = (double) (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideA = getNumber(scanner, "Enter the side A: ");

        double sideB = getNumber(scanner, "Enter the side B: ");

        double sideC = getNumber(scanner, "Enter the side B: ");

        double area = getArea(sideA, sideB, sideC);


        System.out.println("The area of a triangle is: " + area);


        scanner.close();
    }

}
