package Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Employee1", 1, 25.5);
        employees[1] = new Employee("Employee2", 2, 225);
        employees[2] = new Employee("Employee3", 3, 110);
        employees[3] = new Employee("Employee4", 4, 43);
        employees[4] = new Employee("Employee5", 5, 99.99);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input department number: ");
        int depNumber = scanner.nextInt();
        System.out.println("Employees in department number " + depNumber + ":");
        for (Employee employee : employees) {
            if (employee.getDepNumber() == depNumber) {
                System.out.println(employee);
            }
        }
        Arrays.sort(employees, (Comparator<Employee>) (s1, s2) -> Double.compare(s2.getSalary(), s1.getSalary()));
        System.out.println("Employees arranged by salary in descending order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

