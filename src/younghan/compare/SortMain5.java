package younghan.compare;


import mylibrary.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

// 트리 정렬
public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 10);
        MyUser myUser3 = new MyUser("c", 40);
        MyUser myUser4 = new MyUser("d", 20);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        treeSet1.add(myUser4);

        System.out.println(treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        treeSet2.add(myUser4);
        System.out.println(treeSet2);
        // 트리 자체는 처음에 생성될 때부터 비교가 되어있음 .
    }
}
