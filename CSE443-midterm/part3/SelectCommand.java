/**
 * Select command has Select and bank data fields
 * Select hold information about corresponding account and we need to
 * access accounts in bank so bank field requered
 */
public class SelectCommand implements Command{
    private Select select;
    private Bank bank;

    public SelectCommand(Select select,Bank bank) {
        this.select = select;
        this.bank = bank;
    }

    /**
     * Overrided execute method
     * @return if encounters an error while execute step return false, otherwise true
     */
    @Override
    public boolean execute() {
        boolean check = false;
        for(int i=0; i<bank.getAccounts().size(); i++){
            if(bank.getAccounts().get(i).getAcountNum() == select.getAccountNum()){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Select "+ select.getAccountNum() + " called");
            return true;
        }
        else{
            System.out.println("Error There is no "+select.getAccountNum()+" in bank.");
            System.out.println("Undo operation began");
            return false;
        }
    }

    /**
     * Undo operation for SelectCommand
     */
    @Override
    public void undo() {
        System.out.println("Select " + select.getAccountNum() + " undo called");
    }
}
