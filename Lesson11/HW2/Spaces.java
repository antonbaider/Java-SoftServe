import java.util.Arrays;
import java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input words with many spaces, please:");
        String s = sc.nextLine();

        print(s.split("\\s+"));

    }
    static void print(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
