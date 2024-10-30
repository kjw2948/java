package advancedjava.thread.sync;

import static advancedjava.util.MyLogger.log;
import static advancedjava.util.ThreadUtils.sleep;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccountV3(1000);

        Thread t1 = new Thread(new WithdrawTask(account, 800), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 800), "t2");
        t1.start();
        t2.start();

        sleep(1000);

        t1.join();
        t2.join();
        log("최종 잔액 : " + account.getBalance());
    }
}
