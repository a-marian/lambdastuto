package ar.com.lambdastuto.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsBoxingUnboxing {

    public static void main(String[] args) {

        IntStream numbers = IntStream.rangeClosed(0, 1000); // primitive int stream
        List<Integer> integers = numbers.boxed().collect(Collectors.toList());
        integers.forEach(System.out::println);

        Optional<Integer> sum = integers.stream().reduce((a, b) ->  a + b);
        sum.ifPresent(System.out::println);

        int otherSum = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(otherSum);
    }
}
