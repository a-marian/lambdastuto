package ar.com.lambdastuto.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * The reduce() method combines a stream into a single object. It is really a reduction,
 * which means it  processes all elements. The three method signature are:
 * public T reduce(T identity, BinaryOperator<T> accumulator)
 * public Optional<T> reduce(BinaryOperator<T> accumulator)
 * public <U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner)
 * */
public class StreamsReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int results = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(results);

        Optional resultTwo = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(resultTwo);
    }
}
