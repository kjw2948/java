package oop.shoppingmall;

public class Movie extends Item{
    String director;
    String actor;
    Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }
    @Override
    void print() {
        System.out.println("=======영화 정보========");
        super.print();
        System.out.println("감독 : "+ this.director);
        System.out.println("배우 : "+ this.actor);
        System.out.println();
    }
    @Override
    int getPrice() {
        return this.price;
    }
}
