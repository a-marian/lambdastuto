package ar.com.lambdastuto.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimePractice {

    public static void main(String[] args) {

        // Date and simpledateformatter
        Date  dateObj = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("DateFormat.format(date): "+ df.format(dateObj));

        df = new SimpleDateFormat("HH:mm:ss");
        System.out.println("DateFormat.format(date): "+ df.format(dateObj));

        System.out.println(Calendar.getInstance().getTime());

        //LocalTime
        LocalTime time = LocalTime.now();
        System.out.println("LocalTime: "+ time);

        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate= "+ localDate);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: "+ dateTime);
    }
}
