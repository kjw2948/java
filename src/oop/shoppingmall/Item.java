package oop.shoppingmall;

public class Item {
    String name;
     int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    void print() {
        System.out.println("이름 : " + name + " 가격 : " + price);
    }

    int getPrice() {
        return 0;
    }
}
