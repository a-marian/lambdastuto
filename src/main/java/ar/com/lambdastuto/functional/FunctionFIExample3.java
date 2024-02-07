package ar.com.lambdastuto.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionFIExample3 {

    public static void main(String[] args) {

        //funciton which will list<instructors> and return a Map<String, Integer>
        // predicate will return true if instructir has online courses
        Function<List<Instructor>, Map<String, Integer>> mapFucntion = (instructors -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                map.put(instructor.getName(), instructor.getYearsOfExperience());
            });
            return map;
        });
        System.out.println(mapFucntion.apply(Instructors.getAll()));
    }

}
