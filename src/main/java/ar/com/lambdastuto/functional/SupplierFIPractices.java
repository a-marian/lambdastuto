package ar.com.lambdastuto.functional;

import java.util.function.Supplier;

public class SupplierFIPractices {

    public static void main(String[] args) {


        Supplier<Integer> supplier = () -> (int) Math.random() * 454;
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
