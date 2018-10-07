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

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Integer getPrice() {
        return price;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public Boolean getKosher() {
        return kosher;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public void setKosher(Boolean kosher) {
        this.kosher = kosher;
    }

    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
}