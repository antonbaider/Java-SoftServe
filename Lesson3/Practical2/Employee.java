package Employee;
import static Employee.Main.SCANNER;
public class Employee {
    private static int totalSum;
    private String name;
    private int rate;
    private int hours;
    public Employee() {
    }
    public Employee(String name) {
        this.name = name;
    }
    public Employee(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }
    static Employee employee;
    public double getSalary() {
        return (double) rate*hours;
    }
    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public static int getTotalSum() {
        return totalSum;
    }
    public static void setTotalSum(int totalSum) {
        Employee.totalSum = totalSum;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", Total sum =" + getBonuses() +
                '}';
    }

    public double getBonuses() {
        return totalSum + (getSalary() * 0.1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void promtParameters(Employee employee) {
        System.out.println("Input name");
        String name = SCANNER.nextLine();
        employee.setName(name);
        System.out.println("Input rate for " + employee.getName());
        int rate = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setRate(rate);
        System.out.println("Input hours for " + employee.getName());
        int hours = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setHours(hours);
    }
}
