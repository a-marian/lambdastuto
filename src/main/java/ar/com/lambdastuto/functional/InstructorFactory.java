package ar.com.lambdastuto.functional;

import java.util.List;

public interface InstructorFactory {

    Instructor getInstructor(String name, int yearsOfExperience, String title,
                             String gender, boolean onlineCourses, List<String> courses);

}
