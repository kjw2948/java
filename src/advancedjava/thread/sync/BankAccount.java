package advancedjava.thread.sync;

public interface BankAccount {
    // 공유자원 : 여러 스레드가 접근하는 자원
    boolean withdraw(int amount);

    int getBalance();
}
