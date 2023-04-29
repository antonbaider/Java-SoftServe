import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,
                61,67,71,73,79,83,89,97,101,103,107,109,113,127,
                131,137,139,149,151,157,163,167,173,179,181,191,
                193,197,199,211,223,227,229,233,239,241,251,257,
                263,269,271};

        Scanner sc = new Scanner(System.in);
        System.out.println("Input positive integer: ");
        int number = sc.nextInt();
        int index = Arrays.binarySearch(arr, number);
        boolean found = Arrays.asList(arr).contains(index);
        if (found = true) {
            System.out.println("Is a prime number");}
            else
            {
            System.out.println("Not a prime number");
        }
        sc.close();
    }
        }
