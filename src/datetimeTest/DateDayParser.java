package datetimeTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateDayParser {
    public static String getDay(String date) {
        try {
            LocalDate ld = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM dd yyyy"));
            return ld.getDayOfWeek().name().toUpperCase();
        }
        catch (DateTimeParseException e) {
            System.out.println("Input " + date + " cannot be parsed as date");
            return null;
        }
    }
}
