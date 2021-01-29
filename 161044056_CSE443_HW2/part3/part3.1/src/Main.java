public class Main {

    public static void main(String[] args) {
	    TrafficLight trafficLight = new TrafficLight();

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
