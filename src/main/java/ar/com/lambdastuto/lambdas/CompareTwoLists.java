package ar.com.lambdastuto.lambdas;

import java.util.Arrays;

import java.util.List;

public class CompareTwoLists {

    static boolean  compareTwoLists(List a, List b){
        return a.containsAll(b) && (a.size() == b.size());
    }

    public static void main(String[] args) {

        List listA = Arrays.asList( "casandra", "mongodb", "mysql", "postgreql");
        List listB = Arrays.asList( "casandra", "mysql",  "mongodb", "postgreql");

        System.out.println( compareTwoLists(listA, listB));
    }
}
