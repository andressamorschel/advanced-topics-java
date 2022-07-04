package br.com.topics.java8.annotations;

public class App {
    public static void main(String[] args) {
        Voltage[] volts = ProductAnnotationExample.class.getAnnotationsByType(Voltage.class);
        for(Voltage v : volts){
            System.out.println(v.tension());
        }
    }
}
