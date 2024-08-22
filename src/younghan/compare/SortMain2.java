package younghan.compare;

import java.util.Arrays;

public class SortMain2 {
    public static void main(String[] args) {

        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 10);
        MyUser myUser3 = new MyUser("c", 40);
        MyUser myUser4 = new MyUser("d", 20);

        MyUser[] users = {myUser1, myUser2, myUser3, myUser4};
        System.out.println(Arrays.toString(users));
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        Arrays.sort(users, new IdComparator());
        System.out.println(Arrays.toString(users));
    }
}
