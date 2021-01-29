/**
 * This class used in AlterCommand for holding
 * information about corresponding bank account
 */
public class Alter {
    private int accountNum;
    private double newBalance;
    private boolean increment;

    public Alter(int accountNum, double newBalance,boolean increment) {
        this.accountNum = accountNum;
        this.newBalance = newBalance;
        this.increment = increment;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public double getNewBalance() {
        return newBalance;
    }

    public boolean isIncrement() {
        return increment;
    }
}
