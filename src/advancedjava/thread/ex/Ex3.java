package advancedjava.thread.ex;

import static advancedjava.util.MyLogger.log;

public class Ex3 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 5; i++) {
                log("value : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        runnable.run();
    }
}