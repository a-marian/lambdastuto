package ar.com.lambdastuto.defaults;

public interface Calculator {

    //abstract sum method
    int sum(int num1, int num2);

    // abstract division method
   // int divide(int num1, int num2);

    //default method which is subtract
    default int substract(int num1, int num2){
        return num1 - num2;
    }

    static int multiply(int num1, int num2){
        return num1 * num2;
    }
}
