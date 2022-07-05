package br.com.topics;

import br.com.topics.java8.stringjoiner.StringJoinerExample;
import br.com.topics.java9.interfaces.AnimalImpl;

public class Application {
    public static void main(String[] args) {

        var example = new StringJoinerExample();

        AnimalImpl animalTest = new AnimalImpl();
        animalTest.sleep("macaco");
    }
}
