package ar.com.lambdastuto.streams;

import java.util.Random;
import java.util.stream.Stream;

public class SteamsGenerate {

    public static void main(String[] args) {

        //of()
        System.out.println("---of()---");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);


        //iterate, generate stream of numbers multiple of 2
        System.out.println("---iterate()--");
        Stream<Integer> streamIterate = Stream.iterate(0, i -> i+2).limit(10);
        streamIterate.forEach(System.out::println);

        //generate
        System.out.println("---generate()--");
        Stream<Integer> streamGenerate = Stream.generate(new Random()::nextInt);
        streamGenerate.forEach(System.out::println);
    }
}
