import java.time.*;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

public class TryPeriodAndDuration {
    public void periodAndDuration() {
        Period periodOf = Period.of(2, 10, 15);
        Period periodParse = Period.parse("P1Y2M13D");
        Period periodOfDays = Period.ofDays(730);
        Period periodParseYears = Period.parse("P3Y");
        Period periodBetween = Period.between(LocalDate.of(2020, 12, 30), LocalDate.of(2022, 10, 15));
        Period periodChrono = Period.from(ChronoPeriod.between(LocalDate.of(2020, 12, 30), LocalDate.of(2022, 10, 15)));

        long chronoDays = ChronoUnit.DAYS.between(LocalDate.of(2020, 12, 30), LocalDate.of(2022, 10, 15));
        LocalDate localDate = LocalDate.of(2020, 2, 3);
        System.out.println("localDate.until(LocalDate.now(), ChronoUnit.DAYS) = " + localDate.until(LocalDate.now(), ChronoUnit.DAYS));

        System.out.println("periodOf = " + periodOf);
        System.out.println("periodParse = " + periodParse);
        System.out.println("periodOfDays = " + periodOfDays);
        System.out.println("periodParseYears = " + periodParseYears);
        System.out.println("periodBetween = " + periodBetween);
        System.out.println("periodChrono = " + periodChrono);
        System.out.println("chronoDays = " + chronoDays);

        System.out.println("localDate.plus(periodParse) = " + localDate.plus(periodParse));
        System.out.println("localDate.minus(chronoDays, ChronoUnit.DAYS) = " + localDate.minus(chronoDays, ChronoUnit.DAYS));

        Duration durationOf = Duration.of(10, ChronoUnit.MINUTES);
        Duration durationParse = Duration.parse("PT1H3M34S");
        Duration durationOfDays = Duration.ofDays(15);
        Duration durationNano = Duration.parse("PT34.6S");
        Duration durationBetween = Duration.between(LocalTime.of(15, 15), LocalTime.of(15, 16));

        System.out.println("durationOf = " + durationOf);
        System.out.println("durationParse = " + durationParse);
        System.out.println("durationOfDays = " + durationOfDays);
        System.out.println("durationNano = " + durationNano);
        System.out.println("durationBetween = " + durationBetween);

        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 12, 12, 0, 0);
        System.out.println("localDateTime.plus(durationBetween) = " + localDateTime.plus(durationBetween));
        System.out.println("localDateTime.minus(durationParse) = " + localDateTime.minus(durationParse));
    }
}
