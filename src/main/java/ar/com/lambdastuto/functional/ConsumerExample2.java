package ar.com.lambdastuto.functional;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();
        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);

        instructorList.forEach(c1);
        System.out.println("--------------");

        // loop through all the instructor and only print out their name
        Consumer<Instructor> c2 = (s1) -> System.out.println( s1.getName());
        instructorList.forEach(c2);

        // loop through all the instructors and print out their names and their names
        Consumer<Instructor> c3 = (s3) -> System.out.println(s3.getCourses());
        instructorList.forEach(c2.andThen(c3));

        // loop though all the instructors and print out their name if the years of experience is > 10
        System.out.println("----------");
        instructorList.forEach(s1 -> {
            if (s1.yearsOfExperience > 10){
                c1.accept(s1);
            }
        });

        // loop through all the instructors  and print out their name and years ofexperience if years
        // of experience is > 5 and teaches course online
        instructorList.forEach( s1 -> {
            if(s1.yearsOfExperience >5 && s1.isOnlineCourses()){
                c1.andThen(c2).accept(s1);
            }
        });
    }
}
