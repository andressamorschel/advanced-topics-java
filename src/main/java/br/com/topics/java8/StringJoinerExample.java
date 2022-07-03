package br.com.topics.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {

    public void testStringJoiner(){

        List<String> names = new ArrayList<>();
        names.add("Andressa");
        names.add("Alisson");
        names.add("Andrea");
        names.add("Adri");
        names.add("Amanda");

        StringJoiner stringJoiner = new StringJoiner(" - ");

        for(String i: names){
            stringJoiner.add(i);
        }

        System.out.println(stringJoiner);
    }
}
