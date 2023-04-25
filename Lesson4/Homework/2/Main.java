import java.util.Scanner;
import static java.lang.Integer.*;
public class Main {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second number: ");
        n2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter third number: ");
        n3 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int min = n1;
        if (n2 < min) min = n2;
        if (n3 < min) min = n3;
        int max = n1;
        if (n2 > max) max = n2;
        if (n3 > max) max = n3;
        System.out.println("Max num is " + max);
        System.out.println("Min is " + min);
    }
}