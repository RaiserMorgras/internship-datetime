package datetimeTest;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DateDayParser {
    public static String getDay(String date) {
        String[] splitDate = date.split(" ");
        if (splitDate.length != 3) {
            System.out.println("Date cannot be parsed");
            return null;
        }
        byte month, day;
        short year;
        LocalDate ld;
        try {
            month = Byte.parseByte(splitDate[0]);
            day = Byte.parseByte(splitDate[1]);
            year = Short.parseShort(splitDate[2]);
            ld = LocalDate.of(year,month,day);
        }
        catch (NumberFormatException e) {
            System.out.println("Date cannot be parsed");
            return null;
        }
        catch (DateTimeException e) {
            System.out.println("Date is incorrect");
            return null;
        }
        return ld.getDayOfWeek().name().toUpperCase();
    }
}
