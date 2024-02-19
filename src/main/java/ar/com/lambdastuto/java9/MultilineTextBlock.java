package ar.com.lambdastuto.java9;

public class MultilineTextBlock {

    public static void main(String[] args) {

        String tree = """
                     *
                    *++
                   +++++
                  +++++++
                 +++++++++
                +++++++++++
                    +++
                    +++
                    +++
                """;
        System.out.println(tree);

        String phrase  = """
                Those who deny freedom to others deserve it not for themselves
                                                               Abraham Lincoln
                """;
        System.out.println(phrase);
        String moto = """
                In this course, you will be introduced to the Python programming language
                 and apply it in a cybersecurity setting to automate tasks. You'll start by
                focusing on foundational Python programming concepts, including data types,
                   variables, conditional statements, and iterative statements. You'll also 
                   learn to work with Python effectively by developing functions, using 
                   libraries and modules, and making your code readable. In addition, you'll 
                   work with string and list data, and learn how to import, parse and debug files.
                """;

        System.out.println(moto);
    }
}
