package ar.com.lambdastuto.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreams {

    public static void main(String[] args) {

        System.out.println("----of()----");
        DoubleStream numbers = DoubleStream.of(1.5,2.3,3.1,4.4,5.8);
        numbers.forEach(System.out::println);

        //iterate
        System.out.println("----iterate()---");
        numbers = DoubleStream.iterate(0, i -> i+2.2).limit(5);
        numbers.forEach(System.out::println);

        //random generator
        System.out.println("---generate()----");
        numbers = DoubleStream.generate(new Random()::nextDouble).limit(5);
        numbers.forEach(System.out::println);

        //range()
        System.out.println("-----range()-----");
        numbers = LongStream.range(1,5).asDoubleStream();
        numbers.forEach(System.out::println);

        //rangeClosed
        System.out.println("----rangeClosed()---");
        numbers = LongStream.rangeClosed(1,5).asDoubleStream();
        numbers.forEach(System.out::println);
    }
}
