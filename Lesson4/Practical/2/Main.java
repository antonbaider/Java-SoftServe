import java.util.Scanner;



public class Main {
    static int n1;
    static int n2;
    static int n3;
    enum Localization {
        MONDAY("Понеділок", "Monday"),
        TUESDAY("Віторок", "Tuesday"),
        WEDNESDAY("Середа", "Wensday"),
        THURSDAY("Четвер", "Thursday"),
        FRIDAY("П'ятниця", "Friday"),
        SATURDAY("Субота", "Saturday"),
        SUNDAY("Неділя", "Sunday"),

        EN("англійська", "English"),
        UA("українська", "Ukrainian");
        private final String ua;
        private final String en;
        Localization(String ua, String en) { this.ua = ua;
            this.en = en;
        }
        public String getUa() { return ua;
        }
        public String getEn() { return en;
        }

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of the day: ");

        int days = scanner.nextInt();
        Localization days1 = switch(days) {
            case 1 -> Localization.MONDAY;
            case 2 -> Localization.TUESDAY;
            case 3 -> Localization.WEDNESDAY;
            case 4 -> Localization.THURSDAY;
            case 5 -> Localization.FRIDAY;
            case 6 -> Localization.SATURDAY;
            case 7 -> Localization.SUNDAY;
            default -> null;
        };

        System.out.println(days1.getEn());
        System.out.println(days1.getUa());

    }
}
