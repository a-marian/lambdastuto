package ar.com.lambdastuto.defaults;

public interface InterfaceA {

     default void sumA(int sum1, int sum2){
        System.out.println("sum A: (" +sum1 +", "+ sum2+") is: " + (sum1+sum2));
     }
}
