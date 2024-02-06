package ar.com.lambdastuto.lambdas;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.crypto.CipherInputStream;

public class StreamsTuto {



	
	
	public static void main(String[] args) {
		List<String> stringcollect = new ArrayList<>();
		stringcollect.add("ddd2");
		stringcollect.add("aaa2");
		stringcollect.add("aaa5");
		stringcollect.add("bbb1");
		stringcollect.add("ccc5");
		stringcollect.add("ddd6");
		stringcollect.add("zzz1");
		
		//filter accepts a predicate to filter all elements of the stream
		//This operation is intermediate which enables us 
		//to call another stream operation (forEach) on the result.
		//ForEach accepts a consumer to be executed for each element in the filtered stream.
		stringcollect.stream().filter((s) -> s.startsWith("a"))
		.forEach(System.out::println);
		
		//sorted is an intermediate operation which returns a sorted view of the stream.
		//The elements are sorted in natural order unless you pass a custom Comparator.
		stringcollect.stream().sorted()
		.filter((s) -> s.startsWith("a"))
		.forEach(System.out::println);
		
		Stream orquestas = Stream.of("Grupo Niche", "Vitamina Brass","Sol Rojo", "Aventura", "Los Huayra");
		orquestas.sorted().forEach(System.out::println);
		
		int[] enteros = new int[]{1,2,3,4,5};
		IntStream streamEnteros = Arrays.stream(enteros);
		streamEnteros.forEach(System.out::println);
		
		Stream impares = Stream.iterate(1,  x -> x +2).limit(10);
		impares.forEach(System.out::println);
		
		List<String>cities = 
				Arrays.asList("Tucuman", "Salta", "Cordoba", "Rosario", "Jujuy", "Cordoba");
		
		Stream streamcity = cities.stream().distinct();
		streamcity.forEach(System.out::println);
	}

}
