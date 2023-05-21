import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input five words, please:");
      String s = sc.nextLine();
        if (!s.isEmpty()) {

            String[] arr = s.split (" ");
            for (String w : arr) {
                System.out.println (w);
            }
           String x=null;
            x=arr[0];
            int i =0,j = 0;
            for( i = 0; i < arr.length; i = j)
            {
                for( j =i+1; j < arr.length; j++)
                {
                    if(x.length() < arr[j].length())
                    {
                        x = arr[j];
                        break;
                    }
                }
            }
            System.out.println("The longest string is: " + x + " and it's length is: " + x.length());

            String s2 = arr[1];
            StringBuffer sa = new StringBuffer(s2);
            sa.reverse();
            System.out.println(sa);
            System.out.println("The second word is: " + arr[1] + "And it's reverse is: " + sa);
        }
        }
    }
