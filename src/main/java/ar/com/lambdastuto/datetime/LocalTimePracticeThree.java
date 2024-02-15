package ar.com.lambdastuto.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimePracticeThree {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.MIDNIGHT;
        System.out.println("localTime= "+ localTime);

        localTime = LocalTime.of(18, 18);
        System.out.println("locaTime= "+ localTime);

        localTime = LocalTime.now();
        System.out.println("locaTime= "+ localTime);

        localTime = LocalTime.of(15, 20,25, 30);
        System.out.println("localtime: " + localTime);

        //get
        System.out.println("localtime getHour(): "+ localTime.getHour());
        System.out.println("localtime getMinute(): "+ localTime.getMinute());
        System.out.println("localtime getSecond(): "+ localTime.getSecond());
        System.out.println("localtime getNano(): "+ localTime.getNano());

        System.out.println("locatime get(SECOND_OF_DAY): "+ localTime.get(ChronoField.SECOND_OF_DAY));


    }
}
