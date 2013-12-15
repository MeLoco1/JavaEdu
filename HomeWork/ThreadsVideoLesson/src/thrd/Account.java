package thrd;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 12/1/13
 * Time: 3:58 PM
 * Example from the Video Lesson
 */
public class Account {
    private int balance;

    public ReentrantLock getLock() {
        return lock;
    }

    ReentrantLock lock;

    public Account(int balance) {
        this.balance = balance;
        this.lock = new ReentrantLock();
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
