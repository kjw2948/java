package advancedjava.thread.sync;

import static advancedjava.util.MyLogger.log;
import static advancedjava.util.ThreadUtils.sleep;


// 필요한 임계영역만 설정할 수 있음 -> synchronized 코드블럭 활용
public class BankAccountV3 implements BankAccount{
    private int balance; // 개인필드는 private로!

    public BankAccountV3(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작 : " + getClass().getSimpleName());
        // 잔고가 출금액 보다 적으면, 진행하면 안됨

        // ==임계 영억 시작==
        synchronized (this) {

            log("[검증 시작] 출금액 : " + amount + ", 잔액 : " + balance);


            if (balance < amount) {
                log("[검증 실패] 출금액 : " + amount + ", 잔액 : " + balance);
                return false;
            }
            // 잔고가 출금액보다 많음 -> 진행
            log("[검증 성공] 출금액: " + amount + ", 잔액 : " + balance);
            sleep(1000);
            balance -= amount;
            log("[출금 완료] 출금액: " + amount + ", 잔액 : " + balance);
        }
        // ==임계영역 종료==


        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
