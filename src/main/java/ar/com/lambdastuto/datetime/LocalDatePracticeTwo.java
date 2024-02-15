package ar.com.lambdastuto.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class LocalDatePracticeTwo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("locale date origin: "+ localDate);
        //4  days from
        System.out.println("localDate plusDays(4): "+  localDate.plusDays(6));
        System.out.println("localdate now: " + localDate);
        localDate = LocalDate.now();

        System.out.println("localdate plusMonths(2): " + localDate.plusMonths(2));
        System.out.println("localdate minusDays(8): "+ localDate.minusDays(8));
        System.out.println("localDate withYear(2000) " + localDate.withYear(2000));

        System.out.println("localDate with(ChronoField): " + localDate.with(ChronoField.DAY_OF_MONTH, 14));
        System.out.println("localDate.with(TemporalAdjusters): " + localDate.with(TemporalAdjusters.lastDayOfMonth()) );
    }
}
