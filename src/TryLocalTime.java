import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TryLocalTime {
    public void localTime() {
        System.out.println("// Creation");
        LocalTime localTimeNow = LocalTime.now(); // HH:MM:SS.NS
        LocalTime localTime = LocalTime.of(12, 30, 45);
        LocalTime localTimeParse = LocalTime.parse("06:50:45");
        LocalTime localTimeFrom = LocalTime.from(LocalDateTime.now());

        System.out.println("localTimeNow = " + localTimeNow);
        System.out.println("localTime = " + localTime);
        System.out.println("localTimeParse = " + localTimeParse);
        System.out.println("localTimeFrom = " + localTimeFrom);

        System.out.println("\n// plus minus");
        System.out.println("localTime.plus(2, ChronoUnit.HOURS) = " + localTime.plus(2, ChronoUnit.HOURS));
        System.out.println("localTime.minus(30, ChronoUnit.MINUTES) = " + localTime.minus(30, ChronoUnit.MINUTES));
        System.out.println("localTime.plusHours(3) = " + localTime.plusHours(3));
        System.out.println("localTime.minusMinutes(50) = " + localTime.minusMinutes(50));

        System.out.println("\n// gets");
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getMinute() = " + localTime.getMinute());

        System.out.println("\n// checks");
        System.out.println("localTime.equals(localTimeNow) = " + localTime.equals(localTimeNow));
        System.out.println("localTime.isAfter(localTimeFrom) = " + localTime.isAfter(localTimeFrom));
        System.out.println("localTime.isBefore(localTimeNow) = " + localTime.isBefore(localTimeNow));

        System.out.println("\n// constants");
        System.out.println("LocalTime.MAX = " + LocalTime.MAX);
        System.out.println("LocalTime.MIN = " + LocalTime.MIN);
        System.out.println("LocalTime.MIDNIGHT = " + LocalTime.MIDNIGHT);
    }
}
