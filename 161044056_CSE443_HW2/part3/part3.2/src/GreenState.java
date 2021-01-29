/**
 * Concrete Green state class
 */
public class GreenState implements State{
    private TrafficLight trafficLight;

    public GreenState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    /**
     * Green cant switch green
     */
    @Override
    public void switchGreen() {
        System.out.println("GREEN - cant switching to Green");
    }

    /**
     * Green cant switch Red
     */
    @Override
    public void switchRed() {
        System.out.println("GREEN - cant switching to Red");
    }

    /**
     * Green switch Yellow after 60 seconds
     */
    @Override
    public void switchYellow(int timeout_X) {
        System.out.println("GREEN - switching to Yellow after "+ timeout_X + " seconds");
        trafficLight.setState(trafficLight.getYellowState());
    }
}
