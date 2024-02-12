package ar.com.lambdastuto.streams;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamsMapConversions {

    public static void main(String[] args) {

        //
        System.out.println("--------------------");
        List<IdGenerator> idgenerated = IntStream.rangeClosed(1,10)
                .mapToObj((o) -> {
                    return  new IdGenerator(o, ThreadLocalRandom.current().nextInt(100));
                }).collect(Collectors.toList());

        idgenerated.forEach(System.out::println);

        System.out.println("--------------------");
        LongStream longStream = IntStream.rangeClosed(1, 10).mapToLong(l -> (long) l);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = LongStream.rangeClosed(1,10).mapToDouble(d -> (double) d);
        doubleStream.forEach(System.out::println);

    }

}

class IdGenerator{
    int id;
    int randomNumbers;

    public IdGenerator(int id, int randomNumbers) {
        this.id = id;
        this.randomNumbers = randomNumbers;
    }

    @Override
    public String toString() {
        return "IdGenerator{" +
                "id=" + id +
                ", randomNumbers=" + randomNumbers +
                '}';
    }
}
