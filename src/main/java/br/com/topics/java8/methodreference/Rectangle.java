package br.com.topics.java8.methodreference;

public class Rectangle {
    public Rectangle(Double width, Double height) {
        System.out.printf("Rectangle with width: %f and height: %f%n", width, height);
    }

    public Rectangle() {
    }

    public void toDrawRectangle(Double width, Double height) {
        System.out.printf("Rectangle with width: %f and height: %f%n", width, height);
    }
}
