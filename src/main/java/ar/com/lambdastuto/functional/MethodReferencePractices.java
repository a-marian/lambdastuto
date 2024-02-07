package ar.com.lambdastuto.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferencePractices {

    public static void main(String[] args) {

        Predicate<Instructor> predicate = instructor -> instructor.isOnlineCourses();
        Predicate<Instructor> methodRef = Instructor::isOnlineCourses;

        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        Function<Integer, Double> sqrtMethodReference = Math::sqrt;

        Function<String, String> function = s1 -> s1.toLowerCase();
        Function<String, String> functionMethodReference = String::toLowerCase;


    }
}
