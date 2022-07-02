package br.com.topics.java8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public void exampleUsingComparable() { //sorting by price
        List<ProductComparable> products = new ArrayList<>(List.of(
                new ProductComparable("TV 60", 5000.00),
                new ProductComparable("Iphone x", 250.00),
                new ProductComparable("PS4", 3000.00),
                new ProductComparable("Clean code", 350.00)));

        Collections.sort(products);
        products.forEach(product -> System.out.println(product.toString()));
    }
}
