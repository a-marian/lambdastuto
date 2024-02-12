package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;
import java.util.Optional;

/**
 * The findAny() and findFirst() methods return an elelment of the stream unless the stream is empty.
 * If the stream is empty, they return an empty Optional
 * findAny() can return any element of the stream
 * findFirst(), it commonly returns the first element.
 * */

public class StreamsFindFirstAny {

    public static void main(String[] args) {

        Optional<Instructor> anyFound = Instructors.getAll().stream()
                .findAny();

        System.out.println("any: " + Optional.of(anyFound));

        Optional<Instructor> firstFound = Instructors.getAll().stream()
                .findFirst();

        System.out.println("first: " + firstFound );
    }
}
