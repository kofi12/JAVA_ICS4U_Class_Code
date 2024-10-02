import java.util.Date;

public class BankAccount {

    int acctNum;
    double acctBal;
    double annualInterestRate;
    Date dateCreated;

    public BankAccount() {
    }

    public BankAccount(int id, double initBal) {
        this.acctNum = id;
        this.acctBal = initBal;
        this.dateCreated = new Date();
    }

    // three methods, getMonthlyInterest(), deposit(), and withdraw()

    public double getMonthlyInterest() {
        double yearlyInterest = this.acctBal * (1 + this.annualInterestRate);
        return yearlyInterest / 12;
    }

    public void deposit(double depo) {
        this.acctBal += depo;
    }

    public boolean withdraw(double withdrawalAmount) {

        if (acctBal >= withdrawalAmount) {
            this.acctBal -= withdrawalAmount;
            return true;
        }
        return false;
    }
}