package br.com.topics.java8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample implements Comparator<ProductComparator> {

    @Override
    public int compare(ProductComparator o1, ProductComparator o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }


    public void exampleSortingByPrice(){
        List<ProductComparator> products = new ArrayList<>(List.of(
                new ProductComparator("TV 60", 5000.00),
                new ProductComparator("Iphone x", 250.00),
                new ProductComparator("PS4", 3000.00),
                new ProductComparator("Clean code", 350.00)));

        Collections.sort(products, new ComparatorExample());
        products.forEach(product -> System.out.println(product.toString()));
    }
}
