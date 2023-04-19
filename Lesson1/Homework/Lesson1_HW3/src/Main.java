import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("What is the cost $/1 min from country 1?");
        Scanner sc = new Scanner(System.in);
        double c1 = Double.parseDouble(sc.next());
        System.out.println("What is the cost $/1 min from country 2?");
        Scanner sc1 = new Scanner(System.in);
        double c2 = Double.parseDouble(sc1.next());
        System.out.println("What is the cost $/1 min from country 3?");
        Scanner sc2 = new Scanner(System.in);
        double c3 = Double.parseDouble(sc2.next());
        System.out.println("What is the duration from country 1?");
        Scanner sc3 = new Scanner(System.in);
        double t1 = Double.parseDouble(sc3.next());
        System.out.println("What is the duration from country 2?");
        Scanner sc4 = new Scanner(System.in);
        double t2 = Double.parseDouble(sc4.next());
        System.out.println("What is the duration from country 3?");
        Scanner sc5 = new Scanner(System.in);
        double t3 = Double.parseDouble(sc5.next());
        System.out.printf("Call 1 was %s minutes and costs $%s \n", c1, +(c1*t1));
        System.out.printf("Call 2 was %s minutes and costs $%s \n", c2, +(t2*c2));
        System.out.printf("Call 3 was %s minutes and costs $%s \n", c3, +(t3*c3));
        System.out.printf("Total: %s minutes and $%s \n", +(c1+c2+c3), +((t3*c3)+(t2*c2)+(t3*c3)));
    }
}