import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int loop;
        Scanner sc = new Scanner(System.in);
        do {
            int array[] = new int[2];
            System.out.print("Enter 2 integers numbers: ");
            for (int i = 0; i < 2; i++) {
                array[i] = sc.nextInt();
                sum += array[i];
        }
        System.out.println("SUM is: \n" + sum);
            System.out.print("Do you want to repeat? For Yes input 1: ");
            loop = sc.nextInt();
        }
        while (loop == 1);
    }
}
