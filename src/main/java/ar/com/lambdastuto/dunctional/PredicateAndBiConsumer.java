package ar.com.lambdastuto.dunctional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumer {

    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();

        // all instructors who teaches online
        Predicate<Instructor> predicate1 = (Instructor::isOnlineCourses);
        // instructor experience is greateer than 10
        Predicate<Instructor> predicate2 = (instructor) -> instructor.getYearsOfExperience() > 10;

        //biConsumer print names and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) ->
                System.out.println("name is: "+ name + " courses: "+ courses);

        instructorList.forEach(instructor -> {
            if(predicate1.and(predicate2).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });
    }
}
