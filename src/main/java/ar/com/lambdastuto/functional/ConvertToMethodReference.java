package ar.com.lambdastuto.functional;

import java.util.function.Predicate;

public class ConvertToMethodReference {

    public static void main(String[] args) {

        Predicate<Instructor> predicate = ConvertToMethodReference::graterThanTenYearsOfExperience;

        Instructors.getAll().forEach(instructor -> {
            if(predicate.test(instructor)){
                System.out.println(instructor);
            }
        });
    }

    public static boolean graterThanTenYearsOfExperience(Instructor instructor){
        if(instructor.getYearsOfExperience() > 5)
            return true;
        return false;
    }
}
