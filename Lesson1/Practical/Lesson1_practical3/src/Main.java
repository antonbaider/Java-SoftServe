import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Print a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Print b");
        Scanner sc2 = new Scanner(System.in);
        double b = sc2.nextInt();
        System.out.println("a + b = " +(a+b));
        System.out.println("a - b = " +(a-b));
        System.out.println("a * b = " +(a*b));
        System.out.println("a / b = " +(a/b));
    }
}