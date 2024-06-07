package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        
        //각 클래스마다 hashCode를 이미 오버라이디 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode());

        System.out.println(Integer.valueOf(-1).hashCode());

        // 서로 다른 객체지만 데이터가 같은 객체 2개 생성
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이딩 하지 않은 경우, 한 경우를 비교
        System.out.println("(member1==member2) = " + (member1==member2)); //false: 서로 다른 객체이므로 참조값이 다르기 때문에
        System.out.println("(member1.equals(member2)) = " + (member1.equals(member2))); // true: id가 같으면 같다고 정의했기 떄문
        System.out.println("(member1.hashCode()) = " + (member1.hashCode()));
        System.out.println("(member2.hashCode()) = " + (member2.hashCode()));
        // hashCode가 서로 똑같이 나옴 why? Member 클래스에 hashCode를 재정의하여 id가 같으면 같은 것으로 보기 때문에
        // Member에 재정의하지 않고 Object 클래스에서 정의하는 hashCode() 메서드를 사용하면 다른값이 나오게 됨
        // Object에서 제공하는 클래스는 서로 다른 객체면 다른값으로 보도록 정의되어 있기 때문

        // 즉. 자바의 기본 클래스의 해시코드는 데이터의 값이 같으면 같은 해시코드 값을 가지도록 한다. ==> equals와 hashCode가 동일한 결과를 가지도록 잘 구현해야함

        // 동일성(Identity) : == 사용 -> 연산자를 사영해 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
        // 동등성(Equality) : equals() 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
    }
}
