package ar.com.lambdastuto.factorymethods;

import java.util.*;

public class FactoryMethods {

    public static void main(String[] args) {

        // how we used to create unmodifiable list per java 9
        List<String> names = new ArrayList<>();
        names.add("Syed");
        names.add("Mark");
        names.add("Lex");
        names.add("Elon");
        names = Collections.unmodifiableList(names);
        System.out.println("names= "+ names);

        // factory method Java 9
        // inmutable objects are not modified
        List<String> follows = List.of("Andrew", "Sam", "Elon", "Toto", "Robert");
        System.out.println("follows: "+ follows);

        Set<String> set = Set.of("Ryan", "Puppy", "Luna", "Tito", "Rita");
        System.out.println("set=" + set);

        Map<Integer, String> map = Map.of(1, "Yuan", 2, "Dollar", 3, "Peso");
        System.out.println("map: "+ map);


    }
}
