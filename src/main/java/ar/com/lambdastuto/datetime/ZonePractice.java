package ar.com.lambdastuto.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonePractice {

    public static void main(String[] args) {

        //ZoneId getAvailableZoneIds
       // ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        System.out.println("America/Danmarkshavn: " + ZonedDateTime.now(ZoneId.of("America/Danmarkshavn")));
        System.out.println("Asia/Tokyo: " + ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));

        //convert zone to localDate
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: "+ localDateTime );

        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println("localDateTime.atZone(ZoneId.of): " + zonedDateTime);

        System.out.println(localDateTime.atOffset(ZoneOffset.ofHours(-10)));

    }
}
