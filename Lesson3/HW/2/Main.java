import java.util.Scanner;

public class Main {
    public double a;
    public double b;
    public double c;

    public Main() {

    }

    public static double getMinValue(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = getNumber(scanner, "Enter A: ");

        double b = getNumber(scanner, "Enter B: ");

        double c = getNumber(scanner, "Enter C: ");

        double min = getMinValue(a, b, c);


        System.out.println("The minimum number is: " + min);


        scanner.close();
    }

}
