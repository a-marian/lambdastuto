package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructors;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamsAgregateFunctions {

    public static void main(String[] args) {

        //sum
        int sum = IntStream.rangeClosed(0,100).sum();
        System.out.println("sum of 100 numbers"+ sum);

        //min
        OptionalInt min = IntStream.rangeClosed(0,1000).min();
        System.out.println("min of 1000 numbers: "+ min);

        //max
        OptionalInt max = IntStream.rangeClosed(0,1000).max();
        System.out.println("max of 1000 numbers: "+ max);

        //average
        OptionalDouble average = LongStream.rangeClosed(0, 1000).asDoubleStream().average();
        System.out.println("Average is: "+ average.getAsDouble());


    }
}
