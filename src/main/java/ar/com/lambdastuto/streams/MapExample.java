package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Map is an intermediate operation and return another stream as method output return value
 * map() method is used when we want to convert a stream of X to stream of Y
 * Don't confuse map() with Collectors.toMap collect method
 * */
public class MapExample {

    public static void main(String[] args) {
        List<String> instructorsList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("------- list -------");
        System.out.println(instructorsList);

        Set<String> instructorSet = Instructors.getAll().stream()
                .map(Instructor::getTitle)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(instructorSet);
    }
}
