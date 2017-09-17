package com.examples.collection.domain;

import java.util.Comparator;

/**
 * Created by jsubram on 9/15/17.
 */
public class Product implements Comparable<Product> {

    public Product(String name, int id, int weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int id;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    /*
     * Sorting on ProductId is natural sorting for Order.
     */

    @Override
    public int compareTo(Product product) {
        return this.getId() > product.getId() ? 1: this.getId() < product.getId() ? -1 : 0;
    }

    /* Anohter implementation or Comparator interface to sort list of Product object
    * based upon product name.
    */
    public static class productOrderByName implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}
