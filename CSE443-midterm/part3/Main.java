import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount(new Account(10,200));
        bank.createAccount(new Account(15,300));
        System.out.println(bank);


        ArrayList<Command> macroCommand = new ArrayList<>();
        macroCommand.add(new SelectCommand(new Select(13),bank)); //This create an error and trigger undo stack
        macroCommand.add(new UpdateCommand(new Update(10,2500,true),bank));
	    Command command = new Transaction(macroCommand,bank);

	    bank.setCommand(command);
	    bank.executeBankCommand();
        System.out.println(bank);

        ArrayList<Command> macroCommand2 = new ArrayList<>();
        macroCommand2.add(new SelectCommand(new Select(10),bank));
        macroCommand2.add(new UpdateCommand(new Update(10,2500,true),bank));
        Command command2 = new Transaction(macroCommand2,bank);

        bank.setCommand(command2);
        bank.executeBankCommand();
        System.out.println(bank);
    }
}
