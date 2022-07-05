package br.com.topics.java9.interfaces;

public interface Animal {

    default void sleep(String name){
        System.out.println(print(name));
    }

    private String print(String name){
        return String.format("%s sleeping", name);
    }
}
