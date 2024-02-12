package ar.com.lambdastuto.streams.collectors;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.List;

/**
 * The count() method determines the number of elements in a finite stream.
 * This method is a reduction because it looks at each element in the stream and return a single value.
 * */

public class StreamsCounting {

    public static void main(String[] args) {

        long onlineTeachers = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .count();
        System.out.println("Teachers with online courses: "+ onlineTeachers);

        int totalFemale = (int) Instructors.getAll().stream()
                .filter((gender) -> gender.getGender().equals("F"))
                .count();
        System.out.println("Female teachers: "+ totalFemale);

        long distinctCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println("Courses provided by our teaches: "+ distinctCourses);
    }
}
