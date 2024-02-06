package ar.com.lambdastuto.functional;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTuesday2 {

    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();
        //print out name and gender foinstroctors
        BiConsumer<String, String> biConsumer = (name, gender) ->
                System.out.println("name is: "+ name + " and gender is: "+ gender);

        instructorList.forEach(instructor ->
                biConsumer.accept(instructor.getName(), instructor.getGender()));

        System.out.println("-------------");
        // print out name and list of courses
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) ->
                System.out.println("name is: "+ name + " courses: "+ courses);
        instructorList.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(), instructor.getCourses());
        });

        System.out.println("---------------");
        //print out name and gender of alll instructors who teaches online
        instructorList.forEach(instructor -> {
            if (instructor.isOnlineCourses())
                biConsumer.accept(instructor.getName(), instructor.getGender());
        });

    }
}
