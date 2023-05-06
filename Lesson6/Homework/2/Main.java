
  public class Employee {
      private String name;
      private int age;
      private double salary;

      public Employee(String name, int age, double salary) {
          this.name = name;
          this.age = age;
          this.salary = salary;
      }

      public String report() {
          return String.format("Name: %s, Age: %d," + "Salary: \u20B4 %.2f.", name, age, salary);
      }
  }
      class Developer extends Employee{

          @Override
          public String report() {
              return super.report();
          }

          public Developer(String name, int age, double salary) {
              super(name, age, salary);
          }



    public static void main(String[] args) {
          Employee employee = new Employee("Petro", 30,  50000);
          Developer developer = new Developer("Slavko", 25,  40000);

          System.out.println(employee.report());
          System.out.println(developer.report());
}
          }
