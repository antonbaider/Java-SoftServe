import static java.time.Year.isLeap;
// 3. Create a method that takes a year as a parameter and returns true if the year is a leap year.
public class YearIsLeap {
    public static boolean YearIsLeap(int d){
    return (boolean) isLeap(d);
    }
    public static void main(String[] args) {
         System.out.println("Is 2023 leap year? Answer is: "+ YearIsLeap(2023));
        }
    }
