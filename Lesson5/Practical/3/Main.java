import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
         //   System.out.println(arr[i]);
            divide(arr);
        }


        int max = arr[0];
        int imax = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum positive number is = [" + max + "]");

    }
    private static void divide(int[] arr) {
        int positive = 0;
        int negative = 0;
        for (int elem : arr) {
            if (elem > 0) positive++;
            else if (elem < 0) negative++;
        }

        int[] allPositive = new int[positive];
        int[] allNegative = new int[negative];
        positive = 0;
        negative = 0;
        int countNeg = 0;
        int countPos = 0;
        for (int elem : arr) {
            if (elem > 0) {
                countPos++;
                allPositive[positive++] = elem;
            } else if (elem < 0) {
                allNegative[negative++] = elem;
                countNeg++;
                }
            }

            int sumNeg = 0;
            for (int a = 0; a < allNegative.length; a++) {
                sumNeg += allNegative[a];


                int sumPos = 0;
                for (int b = 0; b < allPositive.length; b++) {
                    sumPos += allPositive[b];
                }

                System.out.println("Positive: " + Arrays.toString(allPositive));
             System.out.println("Negative: " + Arrays.toString(allNegative));
                System.out.println("Sum negative = " + Arrays.toString(new int[]{sumNeg}) +
                        "\nNegative numbers: " + countNeg);
                System.out.println("Sum positive = " + Arrays.toString(new int[]{sumPos}) +
                        "\nPositive numbers: " + countPos);

                if (countPos>countNeg) {
                    System.out.println("There are more positive values in the array.");
                }
                if (countPos<countNeg) {
                    System.out.println("There are more negative values in the array.");
                }
                if (countPos==countNeg) {
                    System.out.println("There are an equal number of positive and negative values in the array.");
                }
            }
    }
    }
