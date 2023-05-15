package homework.task2;

import java.util.Scanner;
public class SumCalculation {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sum ;
        int loop;

        do {
            sum = 0;
            int array[] = new int[2];
            System.out.print("Enter 2 integers numbers: ");
            for (int i = 0; i < 2; i++) {
                sum += sc.nextInt();
        }
        System.out.println("SUM is: \n" + sum);
            System.out.print("Do you want to repeat? For Yes input 1: ");
            loop = sc.nextInt();
        }
        while (loop == 1);
    }
}
