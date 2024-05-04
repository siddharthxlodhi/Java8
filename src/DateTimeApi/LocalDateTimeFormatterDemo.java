package DateTimeApi;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter myDateTimeFormater =DateTimeFormatter.BASIC_ISO_DATE;
       String formattedDate= myDateTimeFormater.format(LocalDateTime.now());
        System.out.println(formattedDate);

        String date="20041016";
        LocalDate localDate=LocalDate.parse(date,myDateTimeFormater);
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formattedDate1=dateTimeFormatter.format(ZonedDateTime.now());
        System.out.println(formattedDate1);



    }
}
