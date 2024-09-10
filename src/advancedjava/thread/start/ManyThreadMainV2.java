package advancedjava.thread.start;

import static advancedjava.util.MyLogger.log;

public class ManyThreadMainV2 {
    public static void main(String[] args) {
        log("main() start");

        HelloRunnable runnable = new HelloRunnable();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(runnable);
            thread.start(); // thread 에다가 runnable 을 넣어주고 스레드를 start 시키면 runnable에 있는 run()을 실행시킴
        }

        log("main() end");
    }
}
