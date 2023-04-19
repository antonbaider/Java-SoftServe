// Lesson 1 Practical 2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Please, enter number 1:");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Please, enter number 2:");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("Please, enter number 3:");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        System.out.println("You have entered: (from 3 to 1)");
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        double i = (a+b+c)/3;
        System.out.println("Avvarage of 3 is:");
        System.out.println(i);
    }
}