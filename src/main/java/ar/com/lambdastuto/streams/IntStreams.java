package ar.com.lambdastuto.streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreams {

    public static void main(String[] args) {
        IntStream numbers = IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);
        System.out.println("-------");

        //iterate
        numbers = IntStream.iterate(0, i -> i+2).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("------------");

        //random generator
        numbers = IntStream.generate(new Random()::nextInt).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("------------");

        //range()
        numbers = IntStream.range(1,5);
        numbers.forEach(System.out::println);
        System.out.println("------------");

        //rangeClosed
        numbers = IntStream.rangeClosed(1,5);
        numbers.forEach(System.out::println);
        System.out.println("------------");


    }
}
