package ar.com.lambdastuto.streams.collectors;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJoining {

    public static void main(String[] args) {

      String joined =  Stream.of("M", "A", "R", "I", "A","N").collect(Collectors.joining());

        System.out.println("Joined: "+joined);

        joined = Stream.of("Moon", "Sun", "Earth").collect(Collectors.joining(",", "{", "}"));
        System.out.println("Joined names: "+ joined);

        //instructors
        String concatenated = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining(" ,", "[", "]"));

        System.out.println("Concatenated names:" +concatenated);
    }
}
