package younghan.list;

public class MyLinkedList<E> implements MyList<E>{
    private Node<E> first;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (size == 0) {
            first = newNode;
            size ++;
            return;
        }
        Node<E> lastNode = getLastNode();
        lastNode.next = newNode;
        size++;
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size --;
        return removeItem;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x=x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index ++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean contains(E o) {
        Node<E> now = first;
        while (now != null) {
            if (now.item == o) {
                return true;
            }
            now = now.next;
        }
        return false;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
}


