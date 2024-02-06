package ar.com.lambdastuto.dunctional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateFIPractice {

    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();

        //BiPredicate
        BiPredicate<Boolean, Integer> predicate3 = (online, experience) -> online && experience > 10;


        //biConsumer print names and courses
        BiConsumer<String, List<String>> biConsumer = (name, courses) ->
                System.out.println("name is: "+ name + " courses: "+ courses);

        instructorList.forEach(instructor -> {
            if(predicate3.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience()))
                biConsumer.accept(instructor.getName(), instructor.getCourses());

        });
    }
}
