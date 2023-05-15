package homework.task4;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    static int userNumber;
    static Scanner scanner = new Scanner(System.in);

    public static int getUserNumber() {
        return userNumber;
    }

    public static void main(String[] args) {

        Random rd = new Random();
        int number = rd.nextInt(10);

        do {
            System.out.print("Guess the random number between 0-9: ");
            userNumber = scanner.nextInt();

            if (number == userNumber) {
                System.out.println("_________\nYES!\n__________ \nYou guess!\nYou entered: " + userNumber +
                    " and the random number is also: " + number);
                return;
            } else if (userNumber > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }
        while (getUserNumber() != number);
    }
}
