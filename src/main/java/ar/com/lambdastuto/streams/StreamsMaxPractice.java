package ar.com.lambdastuto.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMaxPractice {

    public static void main(String[] args) {

        //
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        //max using max function
        Optional<Integer> compareTo =  numbers.stream().max(Integer::compareTo);
        System.out.println("max by method reference: " + Optional.of(compareTo));

        int reduce =  numbers.stream().reduce(0, (a,b) -> a>b?a:b);
        System.out.println("max by reduce: " + reduce);

        Optional<Integer> reduceBF =  numbers.stream().reduce((a,b) -> a>b?a:b);
        System.out.println("max by reduce Binary function: " + Optional.of(reduceBF));

        Optional<Integer> reduceMR =  numbers.stream().reduce(Integer::max);
        System.out.println("max by reduce method reference: " + Optional.of(reduceMR));
    }
}
