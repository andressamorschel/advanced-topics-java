package br.com.topics.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StreamExample {

//    Supplier
    List<Product> products = new ArrayList<>(
            List.of(new Product("PS5", 30.0),
                    new Product("Clean Code", 3920.00),
                    new Product("Iphone 12 pro", 1900.0),
                    new Product("PS4", 30.0)));

    public void example01() {
        products.stream()
                .filter(product -> product.getPrice() == 30.00)
                .forEach(System.out::println);
    }



}
