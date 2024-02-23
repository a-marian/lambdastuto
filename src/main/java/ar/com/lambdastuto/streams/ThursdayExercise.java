package ar.com.lambdastuto.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThursdayExercise {

    public static void main(String[] args) {

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Alondra");
        memberNames.add("Paloma");
        memberNames.add("Dalila");
        memberNames.add("Ana");
        memberNames.add("Rosaura");
        memberNames.add("Ximena");
        memberNames.add("Yanina");
        memberNames.add("Monica");

        memberNames.stream().filter((a) -> a.startsWith("A"))
                .forEach(System.out::println);

        memberNames.stream().sorted().map(String::toUpperCase)
                .forEach(System.out::println);

        List<String> uppercaseNames = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseNames);
    }


}
