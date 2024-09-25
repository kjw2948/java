package advancedjava.util;

import static advancedjava.util.MyLogger.log;

public class ThreadUtils {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log("인터럽트 발생, " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void get() {
        log("get ");
    }
}