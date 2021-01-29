import java.util.ArrayList;

/**
 * Transaction used for macroCommands so I can combine command with this
 * like Select followed by Update and so on
 */
public class Transaction implements Command {
    private ArrayList<Command> commands;
    private int undoIndex;
    private Bank bank;
    public Transaction(ArrayList<Command> commands,Bank bank) {
        this.commands = commands;
        this.bank = bank;
        undoIndex = commands.size();
    }

    /**
     * Overrided execute method
     * call all execute methods of consisted commands
     * @return return false if encounter an error while in execution step,otherwise return true
     */
    @Override
    public boolean execute() {
        boolean check = true;
        for(int i=0; i<commands.size(); i++){
            check = commands.get(i).execute();
            if(!check) {
                undoIndex = i+1;
                return false;
            }
        }
        return check;
    }

    /**
     * call undo operations of all commands
     */
    @Override
    public void undo() {
        for(int i=commands.size()-1; i>-1; i--){
            if(i< undoIndex)
            commands.get(i).undo();
        }
    }
}
