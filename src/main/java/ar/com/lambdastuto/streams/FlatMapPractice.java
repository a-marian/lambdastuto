package ar.com.lambdastuto.streams;


import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * FlatMap is a co*/
public class FlatMapPractice {


    public static void main(String[] args) {
        //GEt a list of all the courses which instructors offers (duplicates)
        List<String> instructorCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(instructorCourses);
        //Get a list of all the courses which instructors offers (no duplicates)
        Set<String> instructorCoursesSet = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toSet());

        System.out.println(instructorCoursesSet);
    }
}
