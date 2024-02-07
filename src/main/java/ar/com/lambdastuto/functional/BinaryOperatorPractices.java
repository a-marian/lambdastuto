package ar.com.lambdastuto.functional;

import java.util.Comparator;
import java.util.function.*;

public class BinaryOperatorPractices {

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a,b) -> a+b;
        System.out.println(binaryOperator.apply(2,4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(7,9));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(7, 9));

        IntBinaryOperator intBi = (a,b) -> a*b;
        System.out.println(intBi.applyAsInt(2, 4));

        LongBinaryOperator longBi = (a,b) -> a*b;
        System.out.println(longBi.applyAsLong(1000L, 2000L));

        DoubleBinaryOperator doubleUnaryOperator = (a, b) -> a * b;
        System.out.println(doubleUnaryOperator.applyAsDouble(300.10, 400.3));

    }
}
