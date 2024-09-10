package advancedjava.thread.start;

import static advancedjava.util.MyLogger.log;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");

        InnerRunnable runnable = new InnerRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    static class InnerRunnable implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }
}
