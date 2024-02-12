package ar.com.lambdastuto.streams.collectors;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.stream.Collectors;

public class CollectorSummingAvaraging {

    public static void main(String[] args) {

        //sum of years of experience
        int sum = Instructors.getAll().stream()
                .collect(Collectors.summingInt(Instructor::getYearsOfExperience));

        System.out.println("Sum of years of experience: "+ sum);

        //calculate average of years of experience of all teachers
        double average = Instructors.getAll().stream()
                .collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("Average of years of experience: "+ average);
    }
}
