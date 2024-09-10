package advancedjava.thread.ex;

import static advancedjava.util.MyLogger.log;

public class Ex2 {
    public static void main(String[] args) {
        Thread counter = new Thread(new CounterRunnable(), "counter");
        counter.start();
    }

}
