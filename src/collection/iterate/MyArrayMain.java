package collection.iterate;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}