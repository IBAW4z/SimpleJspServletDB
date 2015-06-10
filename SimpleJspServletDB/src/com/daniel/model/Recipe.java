package com.daniel.model;

/**
 * File module, class Recipe.java
 * class of recipes
 * Created by Anna on 2015-06-10.
 */
import java.util.ArrayList;

enum e_type{
    SOUP, DESSERT, SALAD, STARTER, MAIN_COURSE, DRINK
};
enum e_flavour{
    SWEET, BITTER, SALTY, SOUR
};
enum e_difficulty{
    EASY, MEDIUM, HARD
};

public class Recipe {
    private String name;
    private e_type type;
    private e_difficulty difficulty;
    private e_flavour flavour;
    //private int time;
    //private int calories;
    private ArrayList <Product> products;

    public void setName(String name) {
        this.name = name;
    };
    public String getName() {
        return name;
    };
    public void setType(e_type type) {
        this.type = type;
    };
    public String getType() {
        return type;
    };
    public void setFlavour(e_flavour flavour) {
        this.flavour = flavour;
    };
    public String getFlavour() {
        return flavour;
    };
    public void setDifficulty(e_difficulty difficulty) {
        this.difficulty = difficulty;
    };
    public String getType() {
        return type;
    };
}