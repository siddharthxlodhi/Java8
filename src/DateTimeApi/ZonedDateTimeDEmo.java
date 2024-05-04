package DateTimeApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDEmo {
    public static void main(String[] args) {
//       UTC-> Coordinated Universal Time

//        Set<String> zoneId=ZoneId.getAvailableZoneIds();
//        zoneId.forEach(System.out::println);
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getZone());

        ZonedDateTime custom=ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("America/New_York"));
        System.out.println(custom);



    }
}
