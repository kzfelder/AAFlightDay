package com.example.kyrah.aaflightday;

class Product {
    String name;
    String category;
    Integer price;
    Boolean vegan;
    Boolean kosher;
    Boolean glutenFree;

    public void Product(String name, String category, Integer price) {
        this.name = name;
        this.category = category;
        this.price = price;
        vegan = false;
        kosher = false;
        glutenFree = false;
    }

    public void yesVegan(){
        vegan = true;
    }

    public void yesKosher(){
        kosher = true;
    }

    public void yesGlutenFree(){
        glutenFree = true;
    }

}