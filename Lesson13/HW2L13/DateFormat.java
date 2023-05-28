// Create a method to validate a date according to the format "mm.dd.yy".

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static String DateForm() {
        Format f = new SimpleDateFormat("MM/dd/yy");
        String strDate = f.format(new Date());

        String d = strDate;

        return d;
    }

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(DateForm());
        // Press Ctrl+R or click the green arrow button in the gutter to run the code.

        }
    }
