import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a text containing several instances of US currency format: \n");
        String text = scanner.nextLine();
        String pattern = "\\$\\d+(\\.\\d{2})?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        m.reset();
        System.out.println("All the occurrences of US currency format: ");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
