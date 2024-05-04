package DateTimeApi;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now(); //CurrentDate
        System.out.println(today);
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());

//        plusDays()
//        plusWeeks()
//        plusMonths()
//        plusYears()
//        minusDays()            ->These can be performed
//        minusWeeks()
//        minusMonths()
//        minusYears()
        LocalDate yesterday=today.minusDays(1);
        if(today.isAfter(yesterday)){
            System.out.println("yes");
        }


        LocalDate customDate=LocalDate.of(2004,10,16); //Custom DAte
        LocalDate myDate = customDate.plusYears(20);
        System.out.println(myDate);



    }
}
