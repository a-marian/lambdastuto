package ar.com.lambdastuto.dunctional;

import java.util.Arrays;
import java.util.List;

public class Instructors {

    public static List<Instructor> getAll(){
        Instructor instructor1 = new Instructor( "Mike", 10,
                "Software developer", "M", true,
                Arrays.asList("JAVA", "C++", "Python"));
        Instructor instructor2 = new Instructor( "Mary", 5,
                "Software Analyst", "F", true,
                Arrays.asList("Scrum", "Agile development", ""));
        Instructor instructor3 = new Instructor( "Teodoro", 6,
                "Manager", "M", false,
                Arrays.asList("Scrum", "PMO", "Project manager"));
        Instructor instructor4 = new Instructor( "Rosemary", 4,
                "Architect", "F", false,
                Arrays.asList("Scrum", "Agile development", ""));

        return Arrays.asList(instructor1, instructor2, instructor3, instructor4);
    }
}
