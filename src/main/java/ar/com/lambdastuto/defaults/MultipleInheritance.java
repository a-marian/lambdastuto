package ar.com.lambdastuto.defaults;

public class MultipleInheritance implements InterfaceA, InterfaceB, InterfaceC {

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.sumA(6,7); // resolve child implementation
        multipleInheritance.sumB(7,8);
        multipleInheritance.sumC(8,9);
    }

    public void sumA(int num1, int num2){

        System.out.println("MultipleInheritance sumA" + (num1 + num2));
    }
}
