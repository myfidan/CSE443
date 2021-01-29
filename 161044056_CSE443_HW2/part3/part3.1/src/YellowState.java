/**
 * Yellow state concrete class
 */
public class YellowState implements State {
    private TrafficLight trafficLight;

    public YellowState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    /**
     * Yellow cant switch Green
     */
    @Override
    public void switchGreen() {
        System.out.println("YELLOW - Cant switching to Green");
    }

    /**
     * Yellow switch red after 3 seconds
     */
    @Override
    public void switchRed() {
        System.out.println("YELLOW - Switching to Red after 3 seconds");
        trafficLight.setState(trafficLight.getRedState());
    }

    /**
     * Yellow cant switch yellow
     */
    @Override
    public void switchYellow() {
        System.out.println("YELLOW - Cant switching to Yellow");
    }
}
