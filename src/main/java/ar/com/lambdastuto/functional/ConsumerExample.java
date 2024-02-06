package ar.com.lambdastuto.functional;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c = (x) -> System.out.println(x.length() +" the value of x :"+ x);
        c.accept("up in the air");
    }
}
