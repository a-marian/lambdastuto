package ar.com.lambdastuto.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantPractice {

    public static void main(String[] args) {

        Instant timestamp1 = Instant.now();
        System.out.println("timestamp: "+ timestamp1.getNano());

        Instant timestamp2 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(timestamp1, timestamp2);
        System.out.println("duration to seconds: "+ duration.toSeconds());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(timestamp1, ZoneId.systemDefault());
        System.out.println("Id= "+ localDateTime);


    }
}
