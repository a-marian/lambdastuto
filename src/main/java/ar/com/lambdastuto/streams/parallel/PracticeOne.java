package ar.com.lambdastuto.streams.parallel;

import java.util.stream.IntStream;

public class PracticeOne {

    public static void main(String[] args) {

        System.out.println("Sum sequential: "+ sumSequentialStream());
        System.out.println("Sum parallel: "+ sumParallelStream());

    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(0, 5000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(0,5000).parallel().sum();
    }
}
