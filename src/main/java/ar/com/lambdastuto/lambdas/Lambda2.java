package ar.com.lambdastuto.lambdas;

public class Lambda2 {

	
	@FunctionalInterface
	public static interface Converter<F,T>{
			T convert(F from);
	}
	
	static class Something{
		String startsWith(String s){
			return String.valueOf(s.charAt(0));
		}
	}
	
 
	
	public static void main (String[] args){
		Converter<String, Integer> integerConverter1 = (from) -> Integer.valueOf(from);
		Integer converted1 = integerConverter1.convert("123");
		System.out.println(converted1);
		
	}
}
