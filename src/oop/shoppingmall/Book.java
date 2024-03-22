package oop.shoppingmall;

public class Book extends Item{
    String author;
    String isbn;
    Book(String name, int price, String author, String isbn) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }
}
