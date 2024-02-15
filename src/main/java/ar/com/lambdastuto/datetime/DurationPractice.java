package ar.com.lambdastuto.datetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationPractice {

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(5);

        Duration duration = Duration.between(start, end);
        System.out.println("Duration: "+ duration);
        System.out.println("Duration toHours(): "+ duration.toHours());

        duration = Duration.ofHours(20);
        System.out.println("duration.ToMinutes() "+ duration.toMinutes());

        LocalDateTime localDate = LocalDateTime.now();
        LocalDateTime localDate1 = localDate.plusWeeks(1);
        Duration duration1 = Duration.between(localDate, localDate1);
        System.out.println("Duration: "+ duration1);
        System.out.println("Duration toHours(): "+ duration1.toHours());
    }
}
