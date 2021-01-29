/**
 * Update Command hold update and bank for data fields
 * update hold informations about corresponding account
 */
public class UpdateCommand implements Command {
    private Update update;
    private Bank bank;



    public UpdateCommand(Update update, Bank bank) {
        this.update = update;
        this.bank = bank;
    }

    /**
     * Overridden execute method
     * @return return false if there is an error in execution step, otherwise return true
     */
    @Override
    public boolean execute() {
        boolean check = false;
        for(int i=0; i<bank.getAccounts().size(); i++){
            if(bank.getAccounts().get(i).getAcountNum() == update.getAccountNum()){
                if(update.isIncrement()){
                    bank.setAccounts(i,update.getNewBalance()+bank.getAccounts().get(i).getAcountAmount());
                    check = true;
                }
                else{
                    bank.setAccounts(i,bank.getAccounts().get(i).getAcountAmount()-update.getNewBalance());
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
     * Overrided method for undo operation
     */
    @Override
    public void undo() {
        System.out.println("Update undo executed");
        for(int i=0; i<bank.getAccounts().size(); i++){
            if(bank.getAccounts().get(i).getAcountNum() == update.getAccountNum()){
                if(update.isIncrement()){
                    bank.setAccounts(i,bank.getAccounts().get(i).getAcountAmount()-update.getNewBalance());
                }
                else{
                    bank.setAccounts(i,bank.getAccounts().get(i).getAcountAmount()+update.getNewBalance());
                }

            }
        }
    }
}
