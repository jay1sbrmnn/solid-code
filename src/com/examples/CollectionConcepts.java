package com.examples;

import com.examples.collection.domain.Product;

import java.util.*;

/**
 * Created by jsubram on 9/15/17.
 */
public class CollectionConcepts {

    public static void main(String args[]) {
        Product perfume = new Product("abcd", 23, 10);
        Product dress = new Product("sweater", 20, 20);
        Product pant = new Product("trousers", 15, 30);

        Collection<Product> collection = new ArrayList<>();


        List<Product> productArrayList = new ArrayList<>();

        //add to productArrayList
        productArrayList.add(pant);
        productArrayList.add(dress);
        productArrayList.add(perfume);


        collection.add(pant);
        collection.add(dress);
        collection.add(perfume);

        final Iterator<Product> iterable = collection.iterator();
        while(iterable.hasNext()) {
            Product product = iterable.next();
            //System.out.print(product);
        }

        System.out.print("\n");

        //instead of iterator we can use foreach
        for(Product product : collection) {
            //System.out.print(product);
        }

        System.out.print("\n");

        //in java 7 qw have do this
        productArrayList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId()  - o2.getId();
            }
        });

        //since we have implemented comparable in the Product class it will sorted naturally
        Collections.sort(productArrayList);

        System.out.print("\n");

        productArrayList.forEach(System.out::print);

        //since we have implemented a special comparator static class we can sort by that as well

        Collections.sort(productArrayList, new Product.productOrderByName());

        System.out.print("\n");

        productArrayList.forEach(System.out::print);

        System.out.print("\n");

        //in java 8
        productArrayList.sort((o1, o2) -> o1.getId() -o2.getId());

        //in java 8 it can all be return as follows, without using lambdas and the traditional comparing comparator
        productArrayList.sort(Comparator.comparing(product -> product.getName()));
        //instead of iterator we can use foreach
        for(Product product : productArrayList) {
            System.out.print(product);
        }

        System.out.print("\n");

        //in java 8 we rewrite the for loop as follows using the forEach lambda

        productArrayList.forEach(product -> System.out.print(product));


        System.out.print("\n");

        // or we can rewrite using the forEach method reference

        productArrayList.forEach(System.out::print);



    }
}
