package collection.set;

import collection.set.member.Member;

public class HashSetMainV3 {
    public static void main(String[] args) {
        MyHashSetV3 set = new MyHashSetV3(10);
        Member member1 = new Member("hi");
        Member member2 = new Member("JPA");
        Member member3 = new Member("java");
        Member member4 = new Member("spring");

        System.out.println("\"hi\".hashCode() = " + member1.hashCode());
        System.out.println("\"JPA\".hashCode() = " + member2.hashCode());
        System.out.println("member3 = " + member3.hashCode());
        System.out.println("member4.hashCode() = " + member4.hashCode());
        set.add(member1);
        set.add(member2);
        set.add(member3);
        set.add(member4);
        set.add("SET");
        set.add(true);


        System.out.println(set.toString());

    }
}
