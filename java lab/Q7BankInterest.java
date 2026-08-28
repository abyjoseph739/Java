
class Account {

    final double MIN_BALANCE = 1000;
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

class FixedDepositAccount extends SavingsAccount {

    FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {

        double interest = super.calculateInterest();

        double bonus = balance * 0.02;

        return interest + bonus;
    }
}

public class Q7BankInterest {
    public static void main(String[] args) {

        Account account =
                new Account(10000);

        SavingsAccount savings =
                new SavingsAccount(10000);

        FixedDepositAccount fd =
                new FixedDepositAccount(10000);

        System.out.println("Minimum Balance: " +
                           account.MIN_BALANCE);

        System.out.println("Account Interest: " +
                           account.calculateInterest());

        System.out.println("Savings Interest: " +
                           savings.calculateInterest());

        System.out.println("FD Interest: " +
                           fd.calculateInterest());
    }
}