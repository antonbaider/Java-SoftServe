import java.util.Scanner;
public class Main {
    static int n1;
    static int n2;
    static int n3;
    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second number: ");
        n2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter third number: ");
        n3 = scanner.nextInt();

        if ( n1 % 2 == 0 ) {
            count++;
        }
        if ( n2 % 2 == 0 ) {
            count++;
        }
        if ( n3 % 2 == 0 ) {
            count++;
        }
        System.out.println("The quantity of the ODD numbers are: " + count);
    }
}

