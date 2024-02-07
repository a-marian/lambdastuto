package ar.com.lambdastuto.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctionFIPractices {

    public static void main(String[] args) {

        // BiFunction for two inputs data and predicate which will filter
        // instructors by online courses and return a map with name ans gender
        // predicate will return true if instructir has online courses
        Predicate<Instructor> predicate = (instructor) -> instructor.isOnlineCourses() == true;
        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapBiFunction =
                ((instructors, instructorPredicate) -> {
                    Map<String, Integer> map = new HashMap<>();
                    instructors.forEach(instructor -> {
                        if(instructorPredicate.test(instructor)){
                            map.put(instructor.getName(), instructor.getYearsOfExperience());
                        }
                    });
                    return map;
                });

        System.out.println(mapBiFunction.apply(Instructors.getAll(), predicate));
    }
}
