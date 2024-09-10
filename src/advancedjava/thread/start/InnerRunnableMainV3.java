package advancedjava.thread.start;

import static advancedjava.util.MyLogger.log;

// 익명클래스로 Runnable 구현
public class InnerRunnableMainV3 {

    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                log("run()");
            }
        });
        thread.start();
    }
}
