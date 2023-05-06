import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Car {
    String type;
    int year;
    double engine;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public Car(String type, int year, double engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    public static void main(String[] args) {
       Car[] cars = new Car[4];
        cars[0] = new Car("SUV", 2023, 2.0);
        cars[1] = new Car("Sedan", 2022, 1.6);
        cars[2] = new Car("Roadster", 2020, 2.2);
        cars[3] = new Car("Lift-back", 2021, 1.8);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year of cars (2020-2023): ");
        int year = scanner.nextInt();
        System.out.println("Cars by year " + year + ":");
        for (Car car : cars) {
            if (car.getYear() == year) {
                System.out.println(car);
            }
        }
        Arrays.sort(cars, (Comparator<Car>) (s1, s2) -> Double.compare(s2.getYear(), s1.getYear()));
        System.out.println("Cars by years in descending order:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
