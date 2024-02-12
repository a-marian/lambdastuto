package ar.com.lambdastuto.streams.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class PerformanceCheck {

    public static void main(String[] args) {

        int loop = 20;
        long result = measurePerformance(PerformanceCheck::sumSequentialStream, loop);
        System.out.println("Time taken to process sum in sequential: "+ result + " ms");

        long resultTwo = measurePerformance(PerformanceCheck::sumParallelStream, loop);
        System.out.println("Time taken to process sum in parallel: "+ resultTwo + " ms");
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(0, 5000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(0,5000).parallel().sum();
    }

    public static long measurePerformance(Supplier<Integer> supplier, int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++)
            supplier.get();
        return System.currentTimeMillis() -startTime;
    }
}
