package br.com.topics;

import br.com.topics.java8.methodreference.MethodReferenceExample;

public class Application {
    public static void main(String[] args) {

        var methodReference = new MethodReferenceExample();
        methodReference.exampleByConstructor();
    }
}
