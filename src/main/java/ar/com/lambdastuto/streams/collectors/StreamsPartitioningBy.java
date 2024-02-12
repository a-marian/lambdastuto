package ar.com.lambdastuto.streams.collectors;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningBy {

    public static void main(String[] args) {

        //partition instructors in two groups of instructro
        //first is years of experience is > 10 and other is <=10
        Predicate<Instructor> experiencePredicate = instructor -> instructor.getYearsOfExperience() > 5;

        Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(experiencePredicate));

       partitionMap.forEach((k,v) -> System.out.println(k +" = "+v));

       //partition but return is Set to avoid duplicates
        Map<Boolean, Set<Instructor>> partitionSet = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(experiencePredicate, Collectors.toSet()));

        partitionSet.forEach((k,v) -> System.out.println(k +" = "+v));

    }
}
