package ar.com.lambdastuto.streams.collectors;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsCollectorsMinMax {

    public static void main(String[] args) {

        //instructor with minimum years of experience
        Optional<Instructor> trainee = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println("Trainee instructor by minBy(): "+ trainee);

        trainee = Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("Trainee instructor by min(): "+ trainee);

        Optional<Instructor> senior = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println("Senior instructor by min(): "+ senior);

        senior = Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("Senior instructor by min(): "+ senior);
    }

}
