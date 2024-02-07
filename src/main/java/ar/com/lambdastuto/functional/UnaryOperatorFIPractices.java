package ar.com.lambdastuto.functional;

import java.util.function.*;

public class UnaryOperatorFIPractices {

    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = i  -> i *10;
        System.out.println(unaryOperator.apply(100));

        Function<Integer, Integer> function = i -> i*10;
        System.out.println(function.apply(100));

        IntUnaryOperator intUnaryOperator = i -> i * 10;
        System.out.println(intUnaryOperator.applyAsInt(100));

        LongUnaryOperator longUnaryOperator = l -> l * 10;
        System.out.println(longUnaryOperator.applyAsLong(1000L));

        DoubleUnaryOperator doubleUnaryOperator = d -> d * 10;
        System.out.println(doubleUnaryOperator.applyAsDouble(1000.50));

    }
}
