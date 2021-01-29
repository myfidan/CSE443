/**
 * Update class that I use in UpdateCommand class for holding
 * information about appropriate account
 */
public class Update {
    private int accountNum;
    private double newBalance;
    private boolean increment;

    public Update(int accountNum, double newBalance,boolean increment) {
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
