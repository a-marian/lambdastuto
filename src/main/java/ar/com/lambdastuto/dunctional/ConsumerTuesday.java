package ar.com.lambdastuto.dunctional;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerTuesday {

    public static void main(String[] args) {
        IntConsumer intConsumer = (a) -> System.out.println(a*10);
        intConsumer.accept(10);

        LongConsumer longConsumer = (a) -> System.out.println(a * 10L);
        longConsumer.accept(10L);

        DoubleConsumer doubleConsumer = (d) -> System.out.println(d * 10);
        doubleConsumer.accept(10);
    }
}
