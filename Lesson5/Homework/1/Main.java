package Month;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Month[] months = new Month[12];
        months[0] = new Month("January", 31);
        months[1] = new Month("February", 28);
        months[2] = new Month("March", 31);
        months[3] = new Month("April", 30);
        months[4] = new Month("May", 31);
        months[5] = new Month("June", 30);
        months[6] = new Month("July", 31);
        months[7] = new Month("August", 31);
        months[8] = new Month("September", 30);
        months[9] = new Month("October", 31);
        months[10] = new Month("November", 30);
        months[11] = new Month("December", 31);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int n = sc.nextInt();
        if (n < 1 || n > 12) {
            System.out.println("Wrong choose");
            return;
        }
        System.out.println("In " + months[n - 1].getName() + " are " + months[n - 1].getDays() + " days!");

/// 10 integers numbers
        int array[] = new int[10];
        System.out.print("Enter 10 integers number: ");
int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < 10; i++) {

            array[i] = sc.nextInt();
        }
        System.out.print ("Entered numbers:\n");
        for (int i = 0; i < 10; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length - 5; i++) {
            if (array[i] > 0) countPositive++;
        }
        for (int i = 5; i < array.length; i++) {
            if (array[i] < 0) countNegative++;
        }

        int sum = 0;
        int product = 1;

        if (countPositive == 5) {
            for (int i = 0; i < array.length - 5; i++) {
                sum += array[i];
            }
            System.out.println("First 5 numbers is positive and SUM is: \n" + sum);

        }
        else {
            System.out.println("First 5 numbers is not positive\n");
        }
        if (countNegative == 5) {
            for (int i = 5; i < array.length; i++) {
                product = product * array[i];
        }
        System.out.println("The product of second 5 negative numbers is:\n" +  product);

        }
        else {
            System.out.println("Second 5 numbers is not negative\n");
        }
        System.out.println();

       
// 5 integers numbers
        Scanner sc = new Scanner(System.in);
        int array2[] = new int[5];
        System.out.print("Enter 5 integers number: ");
        int countPositivePos;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.print ("Entered numbers:\n");
        for (int i2 = 0; i2 < array2.length; i2++) {
            System.out.print (" " + array2[i2]);
        }
        int countPositive2 = 0;
        for (int i2 = 0; i2 < array2.length; i2++) {

            if (array2[i2] >= 0) countPositive2++;
            if (countPositive2 == 2) {
            System.out.println("\nPosition of second positive number is: "+ i2);
            }

        }
        int product2 = 1;
        int min = array2[0];
        int imin = 0;
        int i3 = 0;
        while (i3 < array2.length) {
            if (array2[i3] < min) { min = array2[i3];
                imin = i3; }
            i3++; }
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " place");

        for (int i4 = 0; i4 < array2.length; i4++) {
            if (array2[i4] != 0 && array2[i4] % 2 == 0) {
                product2 *= array2[i4];
            }
        }
        System.out.print("Product = " + product2);
    }
}
