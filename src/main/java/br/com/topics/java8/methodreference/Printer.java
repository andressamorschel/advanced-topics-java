package br.com.topics.java8.methodreference;

import br.com.topics.java8.comparable.ProductComparable;

public class Printer {
    public static void print(ProductComparable product){
        System.out.println(product.toString());
    }
}
