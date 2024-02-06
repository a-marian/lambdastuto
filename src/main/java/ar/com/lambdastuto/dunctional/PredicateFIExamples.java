package ar.com.lambdastuto.dunctional;

import java.util.function.Predicate;

public class PredicateFIExamples {

    public static void main(String[] args) {

        //predicate if number is greater than 10 return true other false
        Predicate<Integer> p1 = (i) -> i > 10;
        System.out.println(p1.test(100)); // true

        // predicate if the input is even number
        Predicate<Integer> p2 = (i) -> i%2 == 0;
        System.out.println(p1.and(p2).test(25)); // false

        //i > || 10  number  is even number (i % == 0)
        System.out.println(p1.or(p2).test(4));

        // i> 0 && i%2 != 0
        System.out.println(p1.and(p2.negate()).test(33)); //true
    }
}
