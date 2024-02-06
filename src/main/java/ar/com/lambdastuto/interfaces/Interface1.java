package ar.com.lambdastuto.interfaces;

public class Interface1 {
	
	interface Formula {
		double calculate(int a);
		default double sqrt(int a){
			return Math.sqrt(a);
		}
		
		static int positive(int a){
			return  a > 0 ? a : 0; 
		}
	}
	
	public static void main(String[] args) {
		
		Formula form = new Formula() {
			
			@Override
			public double calculate(int a) {
				// TODO Auto-generated method stub
				return sqrt(a*100);
			}
		};
		form.calculate(100);
		form.sqrt(-24);
		Formula.positive(-4);
	}
	
}

