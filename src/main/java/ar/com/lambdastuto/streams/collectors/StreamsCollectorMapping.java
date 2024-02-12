package ar.com.lambdastuto.streams.collectors;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Collectors class mappping() method takes a function and another collector, and creates a new collector
 * which apply the function and then collects the mapped elements using the given collectors.
 * */
public class StreamsCollectorMapping {

    public static void main(String[] args) {

        //First example
        List<String> nameList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());

        nameList.forEach(System.out::println);

        //same example but using mapping() inside collect()
        nameList = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));

        nameList.forEach(System.out::println);

        // returning  a map according years of experience and corresponding teacher
       Map<Integer, List<String>> instructors =  Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));

        System.out.println(instructors);
    }

}
