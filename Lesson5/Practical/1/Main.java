import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 5, 4};
        System.out.println("The original arr: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nSorted arr: \n"
                + Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of arr numbers: " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number to compare with arr: ");
        int number = sc.nextInt();
        int index = Arrays.binarySearch(arr, number);
        System.out.println("Position of element with value " +number+ " is " + index);
    }
}
