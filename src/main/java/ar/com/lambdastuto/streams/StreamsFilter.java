package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * */
public class StreamsFilter {

    public static void main(String[] args) {
        // returning instructors sorted by name and have more than 10 years of experience
        List<Instructor> list = Instructors.getAll().stream()
                .filter(instructor -> instructor.getYearsOfExperience() > 5)
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());

        list.forEach(System.out::println);

    }
}
