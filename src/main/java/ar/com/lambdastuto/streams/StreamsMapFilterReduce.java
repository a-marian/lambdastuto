package ar.com.lambdastuto.streams;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

public class StreamsMapFilterReduce {

    public static void main(String[] args) {

        //total years of experience b/w instructors
        long totalYearsExperienceForAll = Instructors.getAll().stream()
                .map(Instructor::getYearsOfExperience)
                .reduce(0, (a, b) -> a+b);

        System.out.println("binary function: " + totalYearsExperienceForAll);


        long totalYearsExperienceForAllMethodRef = Instructors.getAll().stream()
                .map(Instructor::getYearsOfExperience)
                .reduce(0, Integer::sum);

        System.out.println("method reference: " + totalYearsExperienceForAllMethodRef);

        long totalYearsExperienceForAllFiltering = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0, (a, b) -> a+b);

        System.out.println("filtering: "+ totalYearsExperienceForAllFiltering);



    }
}
