package ar.com.lambdastuto.streams;

import java.util.Random;
import java.util.stream.LongStream;

public class LongStreams {

    public static void main(String[] args) {

        System.out.println("----of()----");
        LongStream numbers = LongStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);

        //iterate
        System.out.println("----iterate()---");
        numbers = LongStream.iterate(0, i -> i+2).limit(5);
        numbers.forEach(System.out::println);

        //random generator
        System.out.println("---generate()----");
        numbers = LongStream.generate(new Random()::nextLong).limit(5);
        numbers.forEach(System.out::println);

        //range()
        System.out.println("-----range()-----");
        numbers = LongStream.range(1,5);
        numbers.forEach(System.out::println);

        //rangeClosed
        System.out.println("----rangeClosed()---");
        numbers = LongStream.rangeClosed(1,5);
        numbers.forEach(System.out::println);

    }
}
