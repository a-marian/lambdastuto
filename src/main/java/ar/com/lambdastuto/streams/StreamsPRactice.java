package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPRactice {

    public static void main(String[] args) {

        Predicate<Instructor> predicate1 = (i) -> i.isOnlineCourses();
        Predicate<Instructor> predicate2 = (i) -> i.getYearsOfExperience() > 5;

        List<Instructor> instructorList = Instructors.getAll();
        Map<String, List<String>> map = instructorList.stream()
                .filter(predicate1)
                .filter(predicate2)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(map);
    }
}
