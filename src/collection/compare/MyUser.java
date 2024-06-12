package collection.compare;

import java.util.Comparator;

public class MyUser implements Comparable<MyUser>{
    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(MyUser user1) {
        return (this.age < user1.getAge() ? -1 : (this.age == user1.getAge() ? 0 : 1));
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
