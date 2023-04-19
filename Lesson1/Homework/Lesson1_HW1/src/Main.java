import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Please, enter RADIUS of the flower bed:");
        Scanner sc = new Scanner(System.in);
        double i = Double.parseDouble(sc.next());
        System.out.println("Area of flower bed: ");
        double b = 2;
        double p = 3.14;
        double a1 = Math.pow(i, b);
        double a2 = a1*p;
        System.out.println(String.valueOf(a2));
        System.out.println("Perimeter of flower bed: ");
        double p2 = b*p*i;
        System.out.println(String.valueOf(p2));
    }
}