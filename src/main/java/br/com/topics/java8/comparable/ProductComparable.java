package br.com.topics.java8.comparable;

public class ProductComparable implements Comparable<ProductComparable> {

    private String name;

    private Double price;

    public ProductComparable(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(ProductComparable o) {
        //retorna negativo se thisObject < outroObjeto
        //retorna 0 se thisObject == outroObjeto
        //retorna positivo se thisObject > outroObjeto
        return this.price.compareTo(o.getPrice());
    }
}
