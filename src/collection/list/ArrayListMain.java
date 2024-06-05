package collection.list;

public class ArrayListMain {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        System.out.println(list.toString());

        list.add(1, 7);
        System.out.println(list.toString());
    }
}
