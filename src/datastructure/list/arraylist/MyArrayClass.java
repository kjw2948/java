package datastructure.list.arraylist;

public class MyArrayClass<E> implements MyList<E>{
    private static final int DEFAULT_CAPACITY = 5; // 생성자로 배열이 생성될때 기본 용량
    private static final Object[] EMPTY_ELEMENTDATA = {}; // 빈 배열

    private int size; // elementData 배열의 총 개수(크기)를 나타내는 변수
    Object[] elementData; // 자료를 담을 배열

    public MyArrayClass(){
        this.size = size;

    }
    @Override
    public boolean add(E value) {
        return false;
    }

    @Override
    public void add(int index, E value) {

    }

    @Override
    public boolean remove(Object value) {
        return false;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void set(int index, E value) {

    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
