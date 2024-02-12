package ar.com.lambdastuto.streams.parallel;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PerformanceCheckTwo {
    static long tokenCount = 5000;

    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformance(PerformanceCheckTwo::sortSequentialStream, loop);
        System.out.println("Time taken to process sum in sequential: "+ result + " ms");

        long resultTwo = measurePerformance(PerformanceCheckTwo::sortParallelStream, loop);
        System.out.println("Time taken to process sum in parallel: "+ resultTwo + " ms");
    }

    public static long sortSequentialStream(){
        List<RandomToken> randomTokensList = LongStream.rangeClosed(0, tokenCount)
                .parallel().mapToObj((r) -> new RandomToken(r, ThreadLocalRandom.current()
                        .nextLong(tokenCount))).collect(Collectors.toList());
        randomTokensList.stream().sorted(Comparator.comparing(RandomToken::getToken));
        return -1;
    }

    public static long sortParallelStream(){
        List<RandomToken> randomTokensList = LongStream.rangeClosed(0, tokenCount)
                .parallel().mapToObj((r) -> new RandomToken(r, ThreadLocalRandom.current()
                        .nextLong(tokenCount))).collect(Collectors.toList());
        randomTokensList.stream().parallel().sorted(Comparator.comparing(RandomToken::getToken));
        return -1;
    }

    public static long measurePerformance(Supplier<Long> supplier, int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfTimes; i++)
            supplier.get();
        return System.currentTimeMillis() -startTime;


    }
}

class RandomToken{
    long id;
    long token;

    public RandomToken(long id, long token) {
        this.id = id;
        this.token = token;
    }

    public long getToken() {
        return token;
    }
}
