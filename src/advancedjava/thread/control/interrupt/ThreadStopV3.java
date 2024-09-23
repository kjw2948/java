package advancedjava.thread.control.interrupt;

import static advancedjava.util.MyLogger.log;
import static advancedjava.util.ThreadUtils.sleep;

public class ThreadStopV3 {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask, "work");
        thread.start();

        sleep(100);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());

    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
                while (!Thread.currentThread().isInterrupted()) { // 인터럽트 상태 변경x 확인만 함
                    log("작업 중 ");
                }
            log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());
            log("자원 정리");
            log("작업 끝");
        }
    }
}
