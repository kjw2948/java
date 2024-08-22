package younghan.compare;

import java.util.LinkedList;
import java.util.List;

// 리스트 정렬
public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 10);
        MyUser myUser3 = new MyUser("c", 40);
        MyUser myUser4 = new MyUser("d", 20);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        list.add(myUser4);

        System.out.println(list);
        list.sort(null);
        System.out.println(list);

        list.sort(new IdComparator());
        System.out.println(list);

    }
}
