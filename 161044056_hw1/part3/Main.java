import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int choose;
		Scanner scan = new Scanner(System.in);
		ArmoredSuit mySuit;
		System.out.println("Choose basic type of suit:");
		System.out.println("1-Dec  2-Ora  3-Tor");
		choose = scan.nextInt();

		if(choose == 1){
			mySuit = new Dec();
		}
		else if(choose == 2){
			mySuit = new Ora();
		}
		else if(choose == 3){
			mySuit = new Tor();
		}
		else{
			System.out.println("Error, Wrong input...");
			return;
		}

		while(true){
			System.out.println("Choose a decorator");
			System.out.println("1-FlameThrower  2-AutoRifle  3-RocketLauncher  4-Laser  5-Exit");
			choose = scan.nextInt();
			if(choose == 1){
				mySuit = new FlameThrower(mySuit);
			}
			else if(choose == 2){
				mySuit = new AutoRifle(mySuit);
			}
			else if(choose == 3){
				mySuit = new RocketLauncher(mySuit);
			}
			else if(choose == 4){
				mySuit = new Laser(mySuit);
			}
			else if(choose == 5){
				break;
			}
		}

		System.out.println(mySuit.getDescription() + " -> " +  "Cost: " + mySuit.cost() + " Weight: " + mySuit.weight());


    }
}
