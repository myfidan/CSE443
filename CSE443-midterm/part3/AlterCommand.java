/**
 * Alter Command work same as Update command
 * It has alter data field and bank data field for accessing
 * accounts in bank
 */
public class AlterCommand implements Command {
    private Alter alter;
    private Bank bank;

    public AlterCommand(Alter alter,Bank bank) {
        this.alter = alter;
        this.bank = bank;
    }

    /**
     * Execute overrided method
     * Update a account amount for given accountnum
     * @return if account number can't found in bank it return false,otherwise true
     */
    @Override
    public boolean execute() {
        boolean check = false;
        for(int i=0; i<bank.getAccounts().size(); i++){
            if(bank.getAccounts().get(i).getAcountNum() == alter.getAccountNum()){
                if(alter.isIncrement()){
                    bank.setAccounts(i,alter.getNewBalance()+bank.getAccounts().get(i).getAcountAmount());
                    check = true;
                }
                else{
                    bank.setAccounts(i,bank.getAccounts().get(i).getAcountAmount()-alter.getNewBalance());
                    check = true;
                }

            }
        }
        if(check){
            System.out.println("Update executed");
            return check;
        }
        else{
            System.out.println("Error in Update");
            return check;
        }
    }

    /**
     * For undo operation if a account amound increased then undo decrease it
     * if its decreased in execution then undo increase it
     */
    @Override
    public void undo() {
        System.out.println("Update undo executed");
        for(int i=0; i<bank.getAccounts().size(); i++){
            if(bank.getAccounts().get(i).getAcountNum() == alter.getAccountNum()){
                if(alter.isIncrement()){
                    bank.setAccounts(i,bank.getAccounts().get(i).getAcountAmount()-alter.getNewBalance());
                }
                else{
                    bank.setAccounts(i,bank.getAccounts().get(i).getAcountAmount()+alter.getNewBalance());
                }

            }
        }
    }
}
