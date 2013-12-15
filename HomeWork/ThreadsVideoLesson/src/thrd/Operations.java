package thrd;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 12/1/13
 * Time: 4:02 PM
 * Main operations
 */
public class Operations {
    public static void main(String[] args) throws InsufficientFundsException, InterruptedException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        System.out.println("Process stated");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Transferring from b to a 500");
                try {
                    transfer(a, b, 500);
                } catch (InsufficientFundsException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Done");
            }
        }).start();

        System.out.println("Transferring from b to a 300");
        transfer(b, a, 300);
        System.out.println("Done");
    }

    static void transfer(Account acc1, Account acc2, int amount) throws InsufficientFundsException, InterruptedException {
        if (acc1.getBalance() < amount) {
            throw new InsufficientFundsException();
        }

        if (acc1.getLock().tryLock(10, TimeUnit.SECONDS)) {
            try {
                if (acc2.getLock().tryLock(10, TimeUnit.SECONDS)) {
                    try {
                        acc1.withdraw(amount);
                        acc2.deposit(amount);
                    } finally {
                        acc2.getLock().unlock();
                    }
                }
            } finally {
                acc1.getLock().unlock();
            }
        } else {
            System.out.println("Error waiting lock");
        }
    }
}
