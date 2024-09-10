package advancedjava.thread.start;

import static advancedjava.util.MyLogger.log;
// 익명클래스로 Runnable 구현
public class InnerRunnableMainV2 {

    public static void main(String[] args) {
        log("main() start");

        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
