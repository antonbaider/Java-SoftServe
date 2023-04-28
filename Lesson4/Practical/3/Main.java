import java.util.Scanner;

public class Main {
    String name;

    enum Continents {
        Asia, Africa, America, Antarctica, Europe, Australia;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the country: ");

        String countries = scanner.nextLine();
        Continents country = switch (countries) {
            case "China", "India" -> Continents.Asia;
            case "Ukraine", "Poland" -> Continents.Europe;
            case "USA", "Canada" -> Continents.America;
            case "Australia" -> Continents.Australia;
            case "Kenya", "Cameroon" -> Continents.Africa;

            default -> null;
        };

        System.out.println(country);



    }
}
