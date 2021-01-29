/**
 * Red state concrete class
 */
public class RedState implements State {
    private TrafficLight trafficLight;

    public RedState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    /**
     * Switch green state after 15 second
     */
    @Override
    public void switchGreen() {
        System.out.println("RED - Switching to Green after 15 seconds");
        trafficLight.setState(trafficLight.getGreenState());
    }

    /**
     * Red can't switch red
     */
    @Override
    public void switchRed() {
        System.out.println("RED - Cant Switch to Red");
    }

    /**
     * Red can't switch yellow
     */
    @Override
    public void switchYellow() {
        System.out.println("RED - Cant switch to Yellow");
    }
}
