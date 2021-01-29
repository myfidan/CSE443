/**
 * This class used for holding accounts in Bank class
 */
public class Account {

    private int acountNum;
    private double acountAmount;

    public Account(int acountNum, double acountAmount) {
        this.acountNum = acountNum;
        this.acountAmount = acountAmount;
    }

    public void setAcountNum(int acountNum) {
        this.acountNum = acountNum;
    }

    public void setAcountAmount(double acountAmount) {
        this.acountAmount = acountAmount;
    }

    public int getAcountNum() {
        return acountNum;
    }

    public double getAcountAmount() {
        return acountAmount;
    }
}
