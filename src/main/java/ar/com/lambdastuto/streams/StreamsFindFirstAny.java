package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.List;
import java.util.Optional;

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
