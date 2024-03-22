package oop.shoppingmall;

public class Album extends Item {
    String artist;

    Album(String name, int price, String artist) {
        this.name = name;
        this.price = price;
        this.artist = artist;
    }
}
