package Employee;

public class Employee {
    public String getName() {
        return name;
    }



    public int getDepNumber() {
        return depNumber;
    }


    public double getSalary() {
        return salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department number=" + depNumber +
                ", salary=" + salary +
                '}';
    }

    private  String name;
    private  int depNumber;
    private  double salary;

    public Employee(String name, int depNumber, double salary) {
        this.name = name;
        this.depNumber = depNumber;
        this.salary = salary;
    }


}
