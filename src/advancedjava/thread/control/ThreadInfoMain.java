package advancedjava.thread.control;

import static advancedjava.util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        //main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() = " + mainThread.threadId());
        log("mainThread.getName() = " + mainThread.getName());
        log("mainThread.getPriority = " + mainThread.getPriority());
        log("mainThread.getThreadGroup = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());
    }
}
