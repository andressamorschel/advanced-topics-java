package br.com.topics.java8.methodreference;

import br.com.topics.java8.comparable.ProductComparable;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample {

    public void exampleUsingMethodReference() {
        var rectangle = new Rectangle();
        Figure2D figure2D = rectangle::toDrawRectangle;
        figure2D.toDraw(20.0, 40.0);
    }

    public void exampleCallingStaticMethod(){
        List<ProductComparable> products = new ArrayList<>(List.of(
                new ProductComparable("Macbook air 2021 <3", 7500.00),
                new ProductComparable("PS5", 90.00),
                new ProductComparable("Clean code", 80.00),
                new ProductComparable("Coffee", 2080.00)));

        products.forEach(Printer::print);
    }

    public void exampleByConstructor(){
        Figure3D figure3D = Rectangle::new;
        figure3D.toDraw(10.9, 0.90);
    }
}
