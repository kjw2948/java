package generic.ex5;

import generic.animal.Animal;

public class WildCardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        System.out.println("이름 = " + box.get().getName());
    }

    static <T extends Animal> T printAndReturn(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
}
