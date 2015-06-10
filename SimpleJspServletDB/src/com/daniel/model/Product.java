package com.daniel.model;

/**
 * File module, class Product.java
 * class of products used in Recipe or present in Fridge
 * Created by Anna on 2015-06-10.
 */
public class Product {
    private String name;
    private int amount;
    //dorobić pochodne klasy dla róznych typów składników gdzie ilość
    // będzie zależeć od typu składnika np. ml dla płynów,
    // gramy dla sypkich ???

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

}