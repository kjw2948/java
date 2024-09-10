package advancedjava.thread.start;

import static advancedjava.util.MyLogger.log;

// 익명클래스로 Runnable 구현
public class InnerRunnableMainV4 {

    public static void main(String[] args) {
        log("main() start");
        Thread thread = new Thread(() -> log("run()"));
        thread.start();
    }
}
