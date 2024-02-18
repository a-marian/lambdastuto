package ar.com.lambdastuto.java9;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeInterface {

    public static void main(String[] args) {

        //String
        String name = "Mike";
        var lastName = "Teodor";
        System.out.println("who is? "+ name.concat(lastName));

        var dateTime = LocalDateTime.now();
        System.out.println("dateTime= "+ dateTime);

        HashMap<Integer, String> map = new HashMap<>();
        var mapa = new HashMap<Integer, String>();

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println("numbers= "+ numbers);
        var array = new int[]{10,20,30,40,50,60,70,80,90};
        System.out.println("array= "+ array);
        //list
        List<String> strings = new ArrayList<>();
        strings.add("Rosa");
        strings.add("Luis");
        strings.add("Pedro");
        System.out.println("strings= "+ strings);

        var arraylist = new ArrayList<>();
        arraylist.add("Genoveva");
        arraylist.add(12);
        arraylist.add(12.87);
        System.out.println("arraylist= "+ arraylist);

        var integers= List.of(1,2,3,4,5);
        integers.forEach(System.out::println);

       // long longi= 999999999999999.9999; // does not compile
        var nines = 999999999999999.9999;

        var result = 9/2;
        System.out.println("result= "+ result);

        var result1 = 9.0/2;
        System.out.println("result1= "+ result1);

        result1 = 11d/2d;
        System.out.println("result1= "+ result1);

        printString("tennis");

    }

    public static void printString(String text){
        System.out.println("printed: "+ text);
    }

}
