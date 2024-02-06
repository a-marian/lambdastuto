package ar.com.lambdastuto.functional;

import java.util.List;
import java.util.function.Predicate;

public class PREdicateFIExamples2 {

    //all instructors who teaches online

    public static void main(String[] args) {
        Predicate<Instructor> pred1 = (i) -> i.isOnlineCourses();
        //instructors experience is >10 years
        Predicate<Instructor> pred2 = (i) -> i.getYearsOfExperience() > 5;

        System.out.println("---- instructors who teach online courses ---");
        List<Instructor> instructorList = Instructors.getAll();
        instructorList.forEach(instructor -> {
            if(pred1.test(instructor)){
                System.out.println(instructor);
            }
        });
        System.out.println("------ instructors with more than 10 years of experience ---");
        instructorList.forEach(instructor -> {
            if(pred2.test(instructor)){
                System.out.println(instructor);
            }
        });
    }

}
