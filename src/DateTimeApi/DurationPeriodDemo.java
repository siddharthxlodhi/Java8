package DateTimeApi;

import java.time.*;

public class DurationPeriodDemo {
    public static void main(String[] args) throws InterruptedException {

        //Duration
        Instant start=Instant.now();
        for (int i = 0; i < 1000000; i++) {
//work
        }
        Instant end=Instant.now();
        Duration duration=Duration.between(start,end);
        System.out.println(duration);

        LocalDateTime ld1=LocalDateTime.now();
        Thread.sleep(2000);
        LocalDateTime ld2=LocalDateTime.now();
        System.out.println(Duration.between(ld1,ld2));

        //Period (when
        LocalDate l1= LocalDate.now();
        LocalDate l2=LocalDate.of(2004,10,16);
        Period period = Period.between(l1, l2); //My Age
        System.out.println(period);


    }
}
