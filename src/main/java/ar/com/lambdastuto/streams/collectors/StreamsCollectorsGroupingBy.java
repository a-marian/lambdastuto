package ar.com.lambdastuto.streams.collectors;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsCollectorsGroupingBy {

    public static void main(String[] args) {

        List<String> strings = List.of("Slovakia", "Scotland", "France", "Germany", "United States", "Japan");
        Map<Integer, List<String>> result = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("result: "+ result);

        // grouping by instructors gender
        Map<String, List<Instructor>> instructors = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
        instructors.forEach((key, value) -> {
            System.out.println("key:"+ key+"= "+ value);
        });

        //grouping by experience where > 10 years of experience is classified as senior and others are junior
        Map<String, List<Instructor>> instructorsByExperience= Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 5? "SENIOR":"JUNIOR"));
        instructorsByExperience.forEach((key, value) -> {
            System.out.println(key+" = "+ value);
        });


        // grouping by length of string and also checking that the names contains e
        // and only return those names which has e in it
        Map<Integer, List<String>> filtering = strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.filtering(s -> s.contains("e"),
                        Collectors.toList())));
        System.out.println(filtering);

        //instructor grouping them by Senior(>5) and Junior(<5) and filter them by onlineCorses
        Map<String, List<Instructor>> instructorByExperienceAndOnlineCourses = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor ->
                        instructor.getYearsOfExperience() > 10 ? "SENIOR": "JUNIOR",
                        Collectors.filtering(Instructor::isOnlineCourses,
                                Collectors.toList())));
        instructorByExperienceAndOnlineCourses.forEach((key, value) -> {
            System.out.println(key+" = "+value);
        });

        //instructor grouping them by Senior(>5) and Junior(<5) and filter them by onlineCorses
        LinkedHashMap<String, List<Instructor>> linkedHashMap = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor ->
                                instructor.getYearsOfExperience() > 10 ? "SENIOR": "JUNIOR",
                        LinkedHashMap::new,
                        Collectors.filtering(Instructor::isOnlineCourses,
                       Collectors.toList())));
        linkedHashMap.forEach((key, value) -> {
            System.out.println(key+" = "+value);
        });


    }
}
