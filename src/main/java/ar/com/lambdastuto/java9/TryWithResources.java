package ar.com.lambdastuto.java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResources {

    public static void main(String[] args) throws IOException {

        //java 8
        Reader inputString = new StringReader("Don't cut any corners");
        BufferedReader bufferedReader = new BufferedReader(inputString);
        try(BufferedReader bufferedReader1 = bufferedReader){
            System.out.println("bufferedReader1.readline()= "
                + bufferedReader1.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // java 9
        Reader inputString2 = new StringReader("improvements java 9");
        BufferedReader bufferedReader2 = new BufferedReader(inputString2);
        try (bufferedReader2){
            System.out.println("buffered2.readline: "+ bufferedReader2.readLine());
        }
    }
}
