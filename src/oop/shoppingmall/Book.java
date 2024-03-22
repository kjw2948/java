package oop.shoppingmall;

public class Book extends Item{
    private String author;
    private String isbn;
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
    @Override
    void print() {
        System.out.println("=======책 정보========");
        super.print();
        System.out.println("작가 : "+ this.author);
        System.out.println("isbn : "+ this.isbn);
        System.out.println();
    }
    @Override
    int getPrice() {
        return this.price;
    }
}
