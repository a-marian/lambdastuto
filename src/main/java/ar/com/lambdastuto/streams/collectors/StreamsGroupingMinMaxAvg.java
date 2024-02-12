package ar.com.lambdastuto.streams.collectors;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsGroupingMinMaxAvg {

    public static void main(String[] args) {

        //grouping the instructors in two sets of course vs not online
        //and get the max years of experience of the instructors
        Map<Boolean, Optional<Instructor>> maxInstructors = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));

        maxInstructors.forEach((k,v)-> System.out.println(k +" = "+ v));

        //collectionAndThen to get Optional in process
        Map<Boolean, Instructor> maxInstructorsThen = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)),
                                Optional::get)));

        maxInstructorsThen.forEach((k,v)-> System.out.println(k +" = "+ v));

        //averaging years of experience of instructors who teaches online courses
        Map<Boolean, Double> maxInstructorsAverage = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.averagingInt(Instructor::getYearsOfExperience)));

        maxInstructorsAverage.forEach((k,v)-> System.out.println(k +" = "+ v));

        //drive a statical summary from properties of grouped items
        Map<Boolean, IntSummaryStatistics> maxInstructorsSummary = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.summarizingInt(Instructor::getYearsOfExperience)));

        maxInstructorsSummary.forEach((k,v)-> System.out.println(k +" = "+ v));

    }
}
