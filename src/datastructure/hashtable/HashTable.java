package datastructure.hashtable;

import java.util.Hashtable;
import java.util.Map;
public class HashTable {
    public static int getHash(int key) {
        return key % 5;
    }
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable();
        ht.put("key1", 10);
        ht.put("key2", 20);
        ht.put("key3", 30);

        for (Map.Entry<String, Integer> item : ht.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }

        Hashtable<Integer, Integer> ht2 = new Hashtable<>();
        ht2.put(getHash(1), 10);
        ht2.put(getHash(2), 20);
        ht2.put(getHash(3), 30);
        ht2.put(getHash(4), 40);
        ht2.put(getHash(5), 50);
        ht2.put(getHash(6), 60);

        for (Map.Entry<Integer, Integer> item : ht2.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
