package ar.com.lambdastuto.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimePractice {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: "+ localDateTime);

        localDateTime = LocalDateTime.of(2024, 12,4,6,4);
        System.out.println("localDateTime: "+ localDateTime.getDayOfYear());
        System.out.println("localDateTime: "+ localDateTime.getHour());
        System.out.println("localDateTime: "+ localDateTime.getMonth());
        System.out.println("localDateTime: "+ localDateTime.getMonthValue());

        System.out.println("localDateTime: "+ localDateTime.plusMinutes(20));
        System.out.println("localDateTime: "+ localDateTime.plusHours(3));
        System.out.println("localDateTime: "+ localDateTime.plusWeeks(1));

        System.out.println("localDateTime: "+ localDateTime.minusSeconds(300));
        System.out.println("localDateTime: "+ localDateTime.minusHours(13));
        System.out.println("localDateTime: "+ localDateTime.minusWeeks(1));
        System.out.println("localDateTime: "+ localDateTime.getDayOfYear());

        System.out.println("localDateTime: "+ localDateTime.atZone(ZoneId.of("GMT")));
        System.out.println("localDateTime: "+ localDateTime.withDayOfYear(40));

        System.out.println("toLocalDate: "+ localDateTime.toLocalDate());
        System.out.println("toLocalTime: "+ localDateTime.toLocalTime());
    }
}
