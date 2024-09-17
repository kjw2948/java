package oop;

public abstract class Practice {
    int x = 5;
    int y = 3;
    public abstract void move(int x, int y);

    public int get() {
        return 1;
    }
}

class Ex1 extends Practice {
    @Override
    public void move(int x, int y) {
        System.out.println("1 움직이기");
    }
}

class Ex2 extends Practice {
    int x = 1;
    int y = 2;
    @Override
    public void move(int x, int y) {
        System.out.println("2 움직이기");
        System.out.println(x + " " + y);
        System.out.println(super.x);
    }

    public void getField() {
        System.out.println("필드값 확인하기");
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        Practice ex2 = new Ex2();
        ex2.move(10,10);
        System.out.println(ex2.get());
    }
}
