package ar.com.lambdastuto.functional;

import java.util.Arrays;

public class ConstructorMethod {

    public static void main(String[] args) {

        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory
                .getInstructor( "Mike", 10,
                        "Developer", "M", true,
                        Arrays.asList("Java", "Python", "Angular"));

        System.out.println(instructor);
    }
}
