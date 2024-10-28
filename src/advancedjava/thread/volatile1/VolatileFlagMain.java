package advancedjava.thread.volatile1;

import static advancedjava.util.MyLogger.log;
import static advancedjava.util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag);
        t.start();

        sleep(1000);
        log("runFlag를 false로 변경 시도");
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {

        //boolean runFlag = true;
        volatile boolean runFlag = true; // volatile 키워드 추가하면 캐시메모리 말고 메인메모리에 직접 접근
        // 여러 스레드가 같은 값을 읽고 사용해야한다면 volatile 키워드 사용! but 속도가 느려짐 (캐시메모리가 엄청 빠르기때문)
        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {
                // runFlag가 false로 변하면 탈출
            }
            log("task 종료");
        }
    }
}
