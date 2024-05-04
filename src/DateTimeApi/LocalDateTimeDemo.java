package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now= LocalDateTime.now();
        System.out.println(now);

//        plusYears()
//        plusMonths()
//        plusDays()
//        plusHours()
//        plusMinutes()
//        plusSeconds()
//        plusNanos()
//        minusYears()
//        minusMonths()
//        minusDays()
//        minusHours()
//        minusMinutes()
//        minusSeconds()
//        minusNanos()

        LocalDateTime myDateTime = LocalDateTime.parse("2024-05-03T10:02:51.461802"); //CustomDateTime
        if(now.isAfter(myDateTime)){
            System.out.println("yes");
        }
    }
}
