package ar.com.lambdastuto.java9;

import java.time.LocalDate;

public class SwitchExpressions {

    public static void main(String[] args) {

        printActions("JANUARY");
        printActions("JULY");
        printActions("NOVEMBER");

        printYieldCase("MARCH");
        printYieldCase("AUGUST");
        printYieldCase("OCTOBER");
    }

    public static void printActions(String month){
        switch (month){
            case "JANUARY", "FEBRUARY",  "MARCH" -> System.out.println("FIRST QUARTER");
            case "APRIL", "MAY", "JUN" -> System.out.println("SECOND QUARTER");
            case "JULY", "AUGUST", "SEPTEMBER" -> System.out.println("THIRD QUARTER");
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> System.out.println("FOUR QUARTER");
            default -> System.out.println("UNKOWN"); // not necessary int this case
        }
    }

    public static void printYieldCase(String month){
       var quarter =  switch (month){
            case "JANUARY", "FEBRUARY",  "MARCH" -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield(isLeapYear ? "FIRST QUARTER - LEAP YEAR": "FIRST QUARTER");
            }
            case "APRIL", "MAY", "JUN" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOUR QUARTER";
            default -> "UNKNOWN";
        };
        System.out.println(month +" from quarter: "+quarter);
    }
}
