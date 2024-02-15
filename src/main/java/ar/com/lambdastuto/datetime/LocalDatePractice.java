package ar.com.lambdastuto.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class LocalDatePractice {

    public static void main(String[] args) {

        //creating localdate
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: "+ localDate);

        // using day of the year
        localDate = LocalDate.ofYearDay(2024, 40);
        System.out.println("day of year; " + localDate);

        localDate = LocalDate.of(2020, 05, 14);
        System.out.println("day of :" + localDate);

        localDate = LocalDate.ofInstant(Instant.now(), ZoneId.of("Asia/Kolkata"));
        System.out.println(" of instant: "+ localDate);

        System.out.println("localDate getDayOfMonth: "+ localDate.getDayOfMonth());
        System.out.println("localDate getDayOfWeek: "+ localDate.getDayOfWeek());
        System.out.println("localDate getMonthValue: "+ localDate.getMonthValue());
        System.out.println("localDate getYear: "+ localDate.getYear());
        System.out.println("localdate ALIGNED_WEEK_OF_MONTH = "+ localDate.get(ChronoField.ALIGNED_WEEK_OF_MONTH));


    }
}
