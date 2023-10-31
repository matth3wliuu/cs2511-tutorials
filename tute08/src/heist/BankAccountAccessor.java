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

    // * Only one thread can be executing the withdraw function at any given time
    // ? what is the consequence of using the synchronized keyword?
    // * we lose the performance benefits of using multiple threads

    public synchronized static BankAccountAccessor getInstance(BankAccount account) {
        if (instance == null) {
            instance = new BankAccountAccessor(account);
        }
        return instance;
    }

    // * Only one thread can be executing the withdraw function at any given time
    // ? what is the consequence of using the synchronized keyword?
    // * we lose the performance benefits of using multiple threads

    public void withdraw(String user, int numberOfWithdrawals, int amountPerWithdrawal) {
        System.out.println(user + " is accessing the bank.");

        for (int i = 0; i < numberOfWithdrawals; i++) {
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