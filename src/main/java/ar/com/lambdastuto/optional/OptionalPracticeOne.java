package ar.com.lambdastuto.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalPracticeOne {

    public static void main(String[] args) {

        // Integer[] numbers =new Integer[10];
        // int number = numbers[1].intValue();
        // System.out.println("number= "+ number);

        Integer[] integers= new Integer[10];
        Optional<Integer> checkNullInt = Optional.ofNullable(integers[1]);
        int result = checkNullInt.orElse(-1);
        System.out.println("result: "+ result);

        result = checkNullInt.orElseGet(() -> -1);
        System.out.println(" result - orElseGet= "+ result);

        Optional<Double> optional = average(90,100, 80, 75);
        optional.ifPresent(System.out::println);
        optional.ifPresentOrElse(
                (value)
                        -> System.out.println(
                                "Value is present, its: "
                                        + value),
                ()
                        -> System.out.println(
                        "Value is empty"));

        System.out.println(optional.orElseThrow());

        System.out.println(optional.orElse(Double.NaN));
        System.out.println(optional.orElseGet(Math::random));

        Optional<Double> empty = average();
        System.out.println(empty.orElseThrow(() -> new IllegalArgumentException("empty value")));

    }

    public static Optional<Double> average(int... scores){
        if(scores.length == 0) return Optional.empty();
        int sum = Arrays.stream(scores).sum();
        return Optional.of((double) sum/scores.length);
    }
}
