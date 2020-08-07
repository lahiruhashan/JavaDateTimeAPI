import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TryLocalDate {
    public void localDate(){
        System.out.println("// Creation");
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDate = LocalDate.of(2020, 8, 16);
        LocalDate localDateParse = LocalDate.parse("2020-08-15"); //yyyy-MM-dd
        LocalDate localDateFrom = LocalDate.from(LocalDateTime.now());

        System.out.println("localDateNow = " + localDateNow);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateParse = " + localDateParse);
        System.out.println("localDateFrom = " + localDateFrom);

        System.out.println("\n// plus minus");
        System.out.println("localDate.plusDays(4) = " + localDate.plusDays(4));
        System.out.println("localDate.plus(2, ChronoUnit.MONTHS) = " + localDate.plus(2, ChronoUnit.MONTHS));
        System.out.println("localDate.minusYears(3) = " + localDate.minusYears(3));
        System.out.println("localDate.minus(4, ChronoUnit.DAYS) = " + localDate.minus(4, ChronoUnit.DAYS));

        System.out.println("\n// gets");
        System.out.println("localDate.getMonth() = " + localDate.getMonth());
        System.out.println("localDate.getMonthValue() = " + localDate.getMonthValue());
        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
        System.out.println("localDate.lengthOfMonth() = " + localDate.lengthOfMonth());
        System.out.println("localDate.atStartOfDay() = " + localDate.atStartOfDay());
        System.out.println("localDate.with(TemporalAdjusters.lastDayOfMonth()) = " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("localDate.with(TemporalAdjusters.firstDayOfMonth()) = " + localDate.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println("\n// checks");
        System.out.println("localDate.isEqual(localDateNow) = " + localDate.isEqual(localDateNow));
        System.out.println("localDateNow.isEqual(localDateFrom) = " + localDateNow.isEqual(localDateFrom));
        System.out.println("localDate.isBefore(localDateNow) = " + localDate.isBefore(localDateNow));
        System.out.println("localDate.isAfter(localDateNow) = " + localDate.isAfter(localDateNow));
        System.out.println("localDate.isLeapYear() = " + localDate.isLeapYear());

    }
}
