import java.time.Year;
import java.util.Scanner;
import java.lang.String;
public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public Person() {}
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge() {
        int year = Year.now().getValue();
        return year - birthYear;
    }
    public void input() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        birthYear = scanner.nextInt();
    }
    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }
    public void changeName(String firstName, String lastName){
        firstName = lastName;
        lastName = firstName;
    }
    public static void main(String[] args) {

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter information for person " + (i + 1));
            people[i] = new Person();
            people[i].input();
        }
        for (Person person : people) {
            System.out.println("Information");
            Person[] person1 = people;
            person.output();
        }
    }
}



