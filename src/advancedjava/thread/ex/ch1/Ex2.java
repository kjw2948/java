package advancedjava.thread.ex.ch1;

public class Ex2 {
    public static void main(String[] args) {
        Thread counter = new Thread(new CounterRunnable(), "counter");
        counter.start();
    }

}
