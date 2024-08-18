package younghan.list;

public class BatchProcessor {
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size +" 계산 시간 : "+ (endTime - startTime) + " ms");
    }

    public void checkList() {
        System.out.println(this.list.getClass());
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);
        if (list.contains(5)) {
            System.out.println("포함!");
            System.out.println(list.indexOf(0));
        } else {
            System.out.println("포함 안되어있음!");
        }
    }
}
