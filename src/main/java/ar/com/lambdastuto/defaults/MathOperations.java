package ar.com.lambdastuto.defaults;

public class MathOperations implements Calculator {

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println("Sum: "+ mathOperations.sum(10,20));
        //System.out.println("Divide: "+ mathOperations.divide(50,20));

        // our implementation using lambda expression for sum and divide
        Calculator calculator = (num1, num2) -> num1 / num2;
        System.out.println("Calculator override using lambda: " + calculator.sum(3,2));

        System.out.println("Substract: "+ mathOperations.substract(20,10));
        System.out.println("Multiply: "+ Calculator.multiply(3,2));

    }
    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

}
