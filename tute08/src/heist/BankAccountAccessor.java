package heist;

/**
 * A single access to a bank account.
 *
 * @author Nick Patrikeos + @your name
 */
public class BankAccountAccessor {
    private BankAccount account;

    private static BankAccountAccessor instance;

    private BankAccountAccessor(BankAccount account) {
        this.account = account;
    }

    public static BankAccountAccessor getInstance(BankAccount account) {
        if (instance == null) {
            instance = new BankAccountAccessor(account);
        }
        return instance;
    }

    // * synchronized: only one thread can execute this piece of code at any given time
    // ? why might synchronized be "bad"?
    // * lost benefit of using multiple threads => minimise the scope of synchronized code blocks as much as possible
    public synchronized void withdraw(String user, int numberOfWithdrawals, int amountPerWithdrawal) {
        System.out.println(user + " is accessing the bank.");

        for (int i = 0; i < numberOfWithdrawals; i++) {
            // * this is why synchronized
            if (account.withdraw(amountPerWithdrawal)) {
                System.out.println(user + " successfully withdrew $" + amountPerWithdrawal);
            } else {
                System.out.println(user + " failed to withdraw $" + amountPerWithdrawal + ".");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }

        System.out.println(user + " is leaving the bank, the balance is $" + account.getBalance());
    }

}