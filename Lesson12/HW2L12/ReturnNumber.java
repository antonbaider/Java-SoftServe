import hw2l12.ArgumentOutOfRangeException;

import java.util.InputMismatchException;
import java.util.Scanner;

// Create a method readNumber(int start, int end), that read from console integer number and
// return it, if it is in the range [start...end].
// If an invalid number or non-number text is read, the method should throw an exception.
//Using this method write a method main(), that must enter 10 numbers: a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
public class ReturnNumber {

    public void ReadNumber(int start, int end)
    {
        try
        {
            Scanner sc = new Scanner (System.in);
            int [] arr = new int [10];
            int j = 1;
            for(int i = 0; i < 10; i++, j++)
            {
                System.out.println("Input number " + j + ":");
                arr[i] = sc.nextInt();
            }
            for(int k = 0; k < 10; k++) {


                if (start < arr[k] && arr[k] < end) {
                    System.out.println(k+ " in the range [start...end]!");
                }
                else {
                    throw new ArgumentOutOfRangeException(k+ " NOT in the range [start...end]!");
                }
            }
        }
        catch (NumberFormatException | InputMismatchException var5) {
            System.err.println("Wrong number");
        } catch (Exception var6) {
            System.err.println("Something else...");
        } catch (ArgumentOutOfRangeException e) {
            throw new RuntimeException(" NOT in the range [start...end]!");

        }
    }
}

class Range {
    public static void main(String[] args) {
        {
            ReturnNumber range = new ReturnNumber();
            range.ReadNumber(1, 99);

        }
    }
}