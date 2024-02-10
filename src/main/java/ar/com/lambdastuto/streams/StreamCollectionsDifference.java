package ar.com.lambdastuto.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCollectionsDifference {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Miguel");
        names.add("Juana");
        names.add("Roberto");
        names.add("Luis");
        System.out.println(names);
        System.out.println("...deleting one item..");
        names.remove("Roberto");
        System.out.println("After update list: ");
        System.out.println(names);

        // collections can be traversed multiple times
        //traversing the list
        for (String name: names) {
            System.out.println(name);
        }
        //System.out.println("---------");
        /**
        for (String name: names) {
            System.out.println(name);
        }*/

        // streams are traversable only once
        // traversing the stream
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        //System.out.println("---------");
        // stream.forEach(System.out::println);
        //error
        //java.lang.IllegalStateException: stream has already been operated upon or closed
    }
}
