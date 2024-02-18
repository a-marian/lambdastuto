package ar.com.lambdastuto.java9;

import ar.com.lambdastuto.functional.Instructor;
import ar.com.lambdastuto.functional.Instructors;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class VarWithLambdas {

    public static void main(String[] args) {
         var instructors  = Instructors.getAll();
         Predicate<Instructor> experiencePRedicate = (ins) -> ins.getYearsOfExperience() > 5;

         instructors.forEach(instructor -> {
             if(experiencePRedicate.test(instructor)){
                 var result = instructor.getName();
                 System.out.println("result= "+ result);
             }
         });

        BiFunction<Integer, Integer, Integer> sum = (x,  y) -> x+y;
        System.out.println("sum= "+ sum.apply(20,40));
    }
}
