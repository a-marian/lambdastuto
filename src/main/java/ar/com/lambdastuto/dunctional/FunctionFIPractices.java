package ar.com.lambdastuto.dunctional;

import java.util.function.Function;

public class FunctionFIPractices {

    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("square root of 64: "+ sqrt.apply(64));
        System.out.println("square root of 424: "+ sqrt.apply(424));

        Function<String, String> lowercaseFunction = (s) -> s.toLowerCase();
        System.out.println(lowercaseFunction.apply("PROGRAMMING"));
        Function<String, String> concatFunction = (f) -> f.concat(" In java");

        System.out.println(lowercaseFunction.andThen(concatFunction).apply("PROGRAMMING"));

        System.out.println(lowercaseFunction.compose(concatFunction).apply("PROGRAMMING"));
    }
}
