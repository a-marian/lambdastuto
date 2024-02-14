package ar.com.lambdastuto.defaults;

public interface InterfaceB extends InterfaceA {

    default void sumB(int sum1, int sum2){
        System.out.println("sum B: (" +sum1 +", "+ sum2+") is: " + (sum1+sum2));
    }

    default void sumA(int sum1, int sum2){
        System.out.println("Interface B sum A: (" +sum1 +", "+ sum2+") is: " + (sum1+sum2));
    }
}
