package Employee;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);


        Employee employee1 = new Employee();
        Employee.promtParameters(employee1);


        Employee employee2 = new Employee();
        Employee.promtParameters(employee2);


        Employee employee3 = new Employee();
        Employee.promtParameters(employee3);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}