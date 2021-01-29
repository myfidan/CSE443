import java.util.ArrayList;
import java.util.Stack;

public class Bank {
    /**
     * Bank hold command and a Command Stack for undo operations
     * Also accounts
     */
    private Command command;
    private Stack<Command> undoStack;

    private ArrayList<Account> accounts = new ArrayList<>();

    /**
     * Change command and reset stack
     * @param command new command
     */
    public void setCommand(Command command){
        this.command = command;
        undoStack = new Stack<Command>();
        undoStack.add(command);
    }

    /**
     * Execute command if it return false it means it encounters an error in execute step
     * then call undo operation immeaditely
     */
    public void executeBankCommand(){
        boolean check = command.execute();
        if(!check){
            undo();
        }
    }

    /**
     * with using my stack undo operations
     */
    public void undo(){
        while(!undoStack.empty()){
            undoStack.pop().undo();
        }
    }

    /**
     * create accounts for bank
     * @param account created account
     */
    public void createAccount(Account account){
        accounts.add(account);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<accounts.size(); i++){
            stringBuilder.append("Account num: "+ accounts.get(i).getAcountNum()+" Account amount: "+accounts.get(i).getAcountAmount()+"\n");
        }
        return stringBuilder.toString();

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(int i,double num) {
        accounts.get(i).setAcountAmount(num);
    }


}
