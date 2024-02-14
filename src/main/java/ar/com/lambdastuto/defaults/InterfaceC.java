package ar.com.lambdastuto.defaults;

public interface InterfaceC {

    default void sumC(int sum1, int sum2){
        System.out.println("sum C: (" +sum1 +", "+ sum2+") is: " + (sum1+sum2));
    }
}
