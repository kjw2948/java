package advancedjava.thread.control.interrupt;

import static advancedjava.util.MyLogger.log;
import static advancedjava.util.ThreadUtils.sleep;

public class ThreadStopV1 {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 runFlag = false");
        myTask.runFlag = false;

    }

    static class MyTask implements Runnable {

        volatile boolean runFlag = true;
        @Override
        public void run() {
            while (runFlag) {
                log("작업 중 ");
                sleep(3000);
            }
            log("자원 정리");
            log("작업 끝");
        }

    }
}
