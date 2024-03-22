package oop.shoppingmall;

public class Movie extends Item{
    String director;
    String actor;
    Movie(String name, int price, String director, String actor) {
        this.name = name;
        this.price = price;
        this.director = director;
        this.actor = actor;
    }
}
