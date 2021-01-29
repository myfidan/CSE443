/**
 * Select class that I use in SelectCommand class for holding
 * information about appropriate account
 */
public class Select {
    private int accountNum;

    public Select(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getAccountNum() {
        return accountNum;
    }
}
