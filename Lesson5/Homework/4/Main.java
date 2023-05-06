import java.util.Random;
import java.util.Scanner;
public class Main {
    public static int getUserNumber() {
        return userNumber;
    }
    static int userNumber;
    int number;
    public static void main(String[] args) {

        Random rd = new Random();
        int number = rd.nextInt(10);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Guess the random number between 0-9: ");
            int userNumber = scanner.nextInt();

                if (number == userNumber) {
                    System.out.println("_________\nYES!\n__________ \nYou guess!\nYou entered: " + userNumber + " and the random number is also: "+ number);
                    return;
                }
                else {
                    System.out.println("Try again");
                }
        }
        while (getUserNumber() != number);
    }
}
