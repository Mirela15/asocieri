package org.example;
//we want to create a table to associate a product with the quantity and make a total between quantity and price

import java.util.HashMap;
import java.util.Iterator;

public class TestProduct {
    public static void main(String[] args) {
     //I create a table for association
        HashMap<Product,Integer> productsTable=new HashMap<>();

     //I define the products
        Product[] products=new Product[]{
                new Product("pen",1.0f),
                new Product("pencil",45.5f),
                new Product("notebook",2.10f),
                new Product("eraser",3.15f),
                new Product("scissor",23.4f),
                new Product("markers",43.5f)

        };
    //complete the table with products
        productsTable.put(products[0],10);
        productsTable.put(products[2],50);
        productsTable.put(products[3],2);
        productsTable.put(products[4],0);
        productsTable.put(products[5],1);

        Product product;
        float total=0;
        Integer quantity;

        Iterator<Product> it=productsTable.keySet().iterator();
       //iterate over products
       while(it.hasNext()){
         product=  it.next();
           quantity= productsTable.get(product);

           //if the product has not been ordered
           if(quantity==null){
               continue;
           }
           if(quantity >0){
               System.out.println( quantity +" * " + product);
               total +=  quantity*product.price;

       }}
       //display the total
        System.out.println("Total= " + total);




    }
}