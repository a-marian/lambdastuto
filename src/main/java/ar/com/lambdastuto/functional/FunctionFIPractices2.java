package ar.com.lambdastuto.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionFIPractices2 {
    public static void main(String[] args) {

        //map of instructors with name and years of experience
        // function which will list<Instructor> and return a map<String, integer>
        Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructorList -> {
            Map<String, Integer> map = new HashMap<>();
            instructorList.forEach(instructor -> {
                map.put(instructor.getName(), instructor.getYearsOfExperience());
            });
            return map;
        });

        System.out.println(mapFunction.apply(Instructors.getAll()));
    }
}
