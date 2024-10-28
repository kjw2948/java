package advancedjava.thread.volatile1;

import static advancedjava.util.MyLogger.log;
import static advancedjava.util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        t.start();

        sleep(1000);
        task.flag = false;
        log("flag = " + task.flag + " , count = " + task.count + " in main");
    }


    static class MyTask implements Runnable {
        //long count = 0;
        //boolean flag = true;

        volatile long count = 0;
        volatile boolean flag = true;
        @Override
        public void run() {
            while (flag) {
                count++;
                if (count % 100_000_000 == 0) {
                    log("flag = " + flag + " , count = " + count + " in while()");
                }
            }
            log("flag = " + flag + " , count = " + count + " 종료");
        }
    }
}
