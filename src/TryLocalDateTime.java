import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TryLocalDateTime {
    public void localDateTime() {
        System.out.println("// creation");
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        LocalDateTime localDateTimeOf = LocalDateTime.of(2020, Month.JULY, 12, 10, 45);
        LocalDateTime localDateTimeParse = LocalDateTime.parse("2020-07-12T10:45");

        System.out.println("localDateTimeNow = " + localDateTimeNow);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTimeOf = " + localDateTimeOf);
        System.out.println("localDateTimeParse = " + localDateTimeParse);

        System.out.println("\n// plus minus");

        System.out.println("localDateTimeOf.plus(2, ChronoUnit.DAYS) = " + localDateTimeOf.plus(2, ChronoUnit.DAYS));
        System.out.println("localDateTimeOf.minus(2, ChronoUnit.YEARS) = " + localDateTimeOf.minus(2, ChronoUnit.YEARS));
        System.out.println("localDateTimeOf.minusMonths(4) = " + localDateTimeOf.minusMonths(4));

        System.out.println("\n// checks");

        System.out.println("localDateTimeOf.isEqual(localDateTimeParse) = " + localDateTimeOf.isEqual(localDateTimeParse));
        System.out.println("localDateTime.isBefore(localDateTimeOf) = " + localDateTime.isBefore(localDateTimeOf));
        System.out.println("localDateTime.isAfter(localDateTimeOf) = " + localDateTime.isAfter(localDateTimeOf));

        System.out.println("\n// constants");

        System.out.println("LocalDateTime.MAX = " + LocalDateTime.MAX);
        System.out.println("LocalDateTime.MIN = " + LocalDateTime.MIN);

    }
}
