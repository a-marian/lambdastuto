package ar.com.lambdastuto.functional;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateFIExample3 {
    public static void main(String[] args) {
        IntPredicate p1 = (i) -> i > 100;
        System.out.println(p1.test(100));

        LongPredicate longPredicate = (i) -> i > 100L;
        System.out.println(longPredicate.test(1111111L));

        DoublePredicate doublePredicate1 = (n) -> n > 100;
        //DoublePredicate doublePredicate2 = (n) ->
        System.out.println(doublePredicate1.test(34.0));
    }
}
