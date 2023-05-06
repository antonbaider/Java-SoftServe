import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    public Employee(String employeeId,String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    String employeeId;
    String name;
    interface Payment {
       public double calculatePay();
    }
}
class SalariedEmployee extends Employee implements Employee.Payment {
    private String socialSecurityNumber;
private double monthlyPay;
    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId,name);
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    @Override
    public double calculatePay() {
        return monthlyPay;
    }
}
class ContractEmployee extends Employee implements Employee.Payment {
    private String federalTaxIdMember;
    private double monthlyPay;
    public ContractEmployee(String employeeId, String name, int federalTaxIdMember) {
        super(employeeId,name);
        this.federalTaxIdMember = String.valueOf(federalTaxIdMember);
    }
    public String federalTaxIdMember() {
        return federalTaxIdMember;
    }
    @Override
    public double calculatePay() {
        return monthlyPay;
    }
}
class HourlyPaidWorker extends SalariedEmployee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyPaidWorker(String employeeId, String name, String socialSecurityNumber, double hourlyRate, double hoursWorked) {
        super(employeeId, name, socialSecurityNumber);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyPaidWorker{" +
                "hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                ", employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
class FixedPaidWorker extends ContractEmployee {
    private double fixedMonthlyPayment;

    public FixedPaidWorker(String employeeId, String federalTaxId, String number, double fixedMonthlyPayment) {
        super(employeeId, federalTaxId, 0);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "FixedPaidWorker{" +
                "fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}
public class Employee2 {
    public static void main(String[] args) {
         List<Employee> employees = new ArrayList<>();
        employees.add(new HourlyPaidWorker("111", "STEPAN", "1112", 33, 87));
        employees.add(new HourlyPaidWorker("222", "GALYNA", "2221", 23, 40));
        employees.add(new FixedPaidWorker("333", "PETRO", "1212", 13, 22));
            System.out.println(employees);
    }
}
