package br.com.topics.java8.comparator;

public class ProductComparator {

    private String name;

    private Double price;

    public ProductComparator(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public ProductComparator() {

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
}


