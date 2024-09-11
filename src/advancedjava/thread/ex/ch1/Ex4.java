package advancedjava.thread.ex.ch1;

import static advancedjava.util.MyLogger.log;

public class Ex4 {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A",1000),"Thread-A");
        Thread threadB = new Thread(new PrintWork("B",500),"Thread-B");
        Thread threadC = new Thread();

        threadA.start();
        threadB.start();
    }

    static class PrintWork implements Runnable {
        private String contents;
        private int sleepMs;

        public PrintWork(String contents, int sleepMs) {
            this.contents = contents;
            this.sleepMs = sleepMs;
        }
        @Override
        public void run() {
            while(true) {
                log(contents);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
