package br.com.topics.java8.lambda;

import br.com.topics.java8.comparable.ProductComparable;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {

    public void exampleOfThreads() {
        Thread thread = new Thread(() -> System.out.println("Thread em execução!"));
        thread.start();
    }

    public void exampleOfFunctionalInterfaceImplementationWithLambda() {
        Figure figure = () -> System.out.println("drawing figure...");
        figure.toDraw();
    }

    public void exampleOfLambdaAndSort() {
        List<ProductComparable> products = new ArrayList<>(List.of(
                new ProductComparable("Macbook air 2021 <3", 7500.00),
                new ProductComparable("PS5", 90.00),
                new ProductComparable("Clean code", 80.00),
                new ProductComparable("Coffee", 2080.00)));

        products.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        products.forEach((p) -> System.out.printf("Product: %s | price: %f%n",
                p.getName(), p.getPrice()));
    }

}


