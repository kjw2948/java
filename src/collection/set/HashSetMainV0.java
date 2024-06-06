package collection.set;

public class HashSetMainV0 {
    public static void main(String[] args) {
        MyHashSetV0 myHashSetV0 = new MyHashSetV0();
        myHashSetV0.add(1);
        myHashSetV0.add(2);
        myHashSetV0.add(3);
        myHashSetV0.add(4);
        myHashSetV0.add(5);
        System.out.println(myHashSetV0.toString());

        myHashSetV0.add(5);
        System.out.println(myHashSetV0.toString());
        System.out.println(myHashSetV0.contains(5));
        System.out.println(myHashSetV0.contains(6));
    }
}
