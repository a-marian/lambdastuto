package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCustomizedSort {

    public static void main(String[] args) {

        // returning all instructors sorted by their name
        List<Instructor> list = Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
