package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("object print : " + obj);
        return obj;
    }


    //<T> 제네릭 메서드야! 라고 알려주는 거임  --> 제네릭 메서드란? 메서드 안에서만 사용되는 제네릭
    public static <T> T genericMethod(T t) {
        System.out.println("obj = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T obj) {
        System.out.println("obj = " + obj);
        return obj;
    }
}
