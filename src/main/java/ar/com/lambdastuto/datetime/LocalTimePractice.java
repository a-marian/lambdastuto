package ar.com.lambdastuto.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimePractice {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime.plusHours(2): "+ localTime.plusHours(2));
        System.out.println("localTime.plusMinutes(5): " + localTime.plusMinutes(5));
        System.out.println("localTime.plusSeconds(100): " + localTime.plusSeconds(100));
        System.out.println("localTime.plusNanos(10000): "+ localTime.plusNanos(10000));

        System.out.println("localTime.minus: " + localTime.minus(20, ChronoUnit.MINUTES) );
        System.out.println("localTime.minusHours: " + localTime.minusHours(1) );
        System.out.println("localTime.minusMinutes: " + localTime.minusMinutes(20) );
        System.out.println("localTime.plusNanos: " + localTime.plusNanos(10000000) );
    }
}
