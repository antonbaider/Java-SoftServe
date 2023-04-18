import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        var i = sc.next();
        System.out.printf("Where do you live, %s? \n", i);
        Scanner sc1 = new Scanner(System.in);
        var i1 = sc1.next();
        System.out.printf("%s lives in %s", i, i1);
    }
}