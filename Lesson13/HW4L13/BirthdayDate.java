import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
// 4. Create a variable "birthday" of type "LocalDate" and set it to the date of your birthday. Then create a method that takes a "LocalDate" object as a parameter, and prints the day of the week it falls on, as well as the day of the week after 6 months and 12 months have passed.
//**Additionally, the method should only print the day of the week in English if the default locale is set to English. Otherwise, it should print the day of the week in the language of the default locale. Finally, the method should handle any exceptions that may occur during the date calculation process and print an appropriate error message.
public class BirthdayDate {
        public static String DayOfWeeks (LocalDate birthday) {
            try {
                DayOfWeek day = birthday.getDayOfWeek();
                Locale defaultLocale = Locale.UK;
                String dayOfWeekName = day.getDisplayName(TextStyle.FULL, defaultLocale);
                return dayOfWeekName;
            }
            catch (Exception e) {
                System.out.println("Alarm " + e.getMessage());
            }
            return null;
        }
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1990, 4, 26);
        System.out.println("My birthday ("+birthday+") was on " + DayOfWeeks(birthday));
        System.out.println("After 6 months it was " + birthday.plusMonths(6).getDayOfWeek());
        System.out.println("After 12 months it was " + birthday.plusMonths(12).getDayOfWeek());
    }
}
