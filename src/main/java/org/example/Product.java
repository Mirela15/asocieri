package org.example;

public class Product {
    String name;
    float price;

    public Product(String name,float price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
