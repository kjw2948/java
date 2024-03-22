package oop.shoppingmall;

public class Album extends Item {
    String artist;

    Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }
    @Override
    void print() {
        System.out.println("=======앨범 정보========");
        super.print();
        System.out.println("아티스트 : "+ this.artist);
        System.out.println();
    }
    @Override
    int getPrice() {
        return this.price;
    }
}
