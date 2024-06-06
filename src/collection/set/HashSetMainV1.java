package collection.set;

public class HashSetMainV1 {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();
        set.add(30);
        set.add(25);
        set.add(11);
        set.add(31);

        System.out.println(set.toString());
    }
}
