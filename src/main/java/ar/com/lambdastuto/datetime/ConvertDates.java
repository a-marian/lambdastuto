package ar.com.lambdastuto.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDates {

    public static void main(String[] args) {

        //converting util.Date() to LocalDateTime
        Date date = new Date();
        LocalDateTime localDateTime =  date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime: " + localDateTime);

        //convert sql.Date() to  LocalDate
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = sqlDate.toLocalDate();
        System.out.println("localDate = "+ localDate);


    }
}
