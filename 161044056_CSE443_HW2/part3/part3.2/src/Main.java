import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HiTech hiTech = new HiTech();
        TrafficLight trafficLight = new TrafficLight(hiTech);

        System.out.println("Enter 1 or 2:");
        System.out.println("1. A lot of traffic");
        System.out.println("2. There is no traffic");
        Scanner inp = new Scanner(System.in);
        int check = inp.nextInt();

        if(check == 1){
            hiTech.changeDetected(true);
        }
        else{
            hiTech.changeDetected(false);
        }



        trafficLight.switchGreen();
        trafficLight.switchRed();
        trafficLight.switchGreen();

        trafficLight.switchYellow();
        trafficLight.switchYellow();
        trafficLight.switchGreen();

        trafficLight.switchRed();
        trafficLight.switchRed();
        trafficLight.switchYellow();
        trafficLight.switchGreen();
    }
}
