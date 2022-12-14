package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {
    public static void main(String[] args) {


    /*
    How many days passed since you were born
    CurrentDate - DateOfBirth

    How many years past
    How many months past
    How weeks months past
    How days months past
     */

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1985, Month.JULY, 5);

        System.out.println(today);
        System.out.println(dateOfBirth);

        System.out.println(Period.between(dateOfBirth, today).getYears()); // 37
        System.out.println(Period.between(dateOfBirth, today).getMonths()); // 5
        System.out.println(Period.between(dateOfBirth, today).getDays()); // 6

        // Using ChronoUnit
        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today)); // 37
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today)); // 449
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today)); // 1953
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today)); // 13673
        System.out.println(ChronoUnit.DECADES.between(dateOfBirth, today)); // 3


        LocalTime localTime1 = LocalTime.of(12, 44, 15);
        LocalTime localTime2 = LocalTime.of(13, 45, 45);

        System.out.println(Duration.between(localTime1, localTime2).getSeconds());

        //ChronoUnit
        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2)); // 1
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2)); // 61
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2)); // 3690





    }
}
