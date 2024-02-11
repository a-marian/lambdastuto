package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {


    public static void main(String[] args) {
        // -count()
        long instructorQuantity = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .count();

        System.out.println(instructorQuantity);

        // .distinct()
        List<String> instructorCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(instructorCourses);

        // anymatch(), allMatch(), noMatch()
         boolean anyMatch = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .anyMatch(s -> s.startsWith("J"));

        System.out.println("Any course that name starts with P : " + anyMatch);

        boolean allMatch = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .allMatch(s -> s.startsWith("P"));

        System.out.println("All courses that name starts with P : " + allMatch);

        boolean noMatch = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .noneMatch(s -> s.startsWith("P"));

        System.out.println("Courses that name does not start with S : " + noMatch);
    }
}
