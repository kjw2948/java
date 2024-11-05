package advancedjava.thread.sync.test;

import advancedjava.thread.sync.BankAccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankReview implements BankAccount {

    private int balance;

    private final Lock lock = new ReentrantLock();

    public BankReview(int initBalance) {
        this.balance = initBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        lock.lock();
        try {
            if(balance < amount){
                return false;
            }
            balance -= amount;
        }
        finally {
            lock.unlock();
        }
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
