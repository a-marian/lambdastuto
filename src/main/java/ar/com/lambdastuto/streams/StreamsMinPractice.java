package ar.com.lambdastuto.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinPractice {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        //min using min() function
        Optional<Integer> compareTo =  numbers.stream().min(Integer::compareTo);
        System.out.println("min by method reference: " + Optional.of(compareTo));

        // this example will always give 0 because identity value is lower than low value in list
        int reduce =  numbers.stream().reduce(0, (a,b) -> a<b?a:b);
        System.out.println("min by reduce: " + reduce);

        Optional<Integer> reduceBF =  numbers.stream().reduce((a,b) -> a<b?a:b);
        System.out.println("min by reduce Binary function: " + Optional.of(reduceBF));

        Optional<Integer> reduceMR =  numbers.stream().reduce(Integer::min);
        System.out.println("min by reduce method reference: " + Optional.of(reduceMR));
    }
}
