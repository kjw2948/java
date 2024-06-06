package collection.set;

public class HashSetMainV2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        set.add(1);
        set.add(5);
        set.add(13);
        set.add(99);
        set.add(1325);
        set.add(77);
        set.add(77);
        set.add(3);
        set.add(9);

        System.out.println(set.toString());
        System.out.println(set.contains(77));

        set.remove(77);
        System.out.println(set.toString());
        System.out.println(set.contains(77));
    }
}
