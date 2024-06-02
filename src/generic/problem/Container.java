package generic.problem;

public class Container<T>{
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public boolean isEmpty() {
        return item == null;
    }
}

