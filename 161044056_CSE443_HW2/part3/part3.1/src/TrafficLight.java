/**
 * TrafficLight hold all states and current state
 */
public class TrafficLight {
    private State redState;
    private State yellowState;
    private State greenState;

    private State state;

    public TrafficLight(){
        redState = new RedState(this);
        yellowState = new YellowState(this);
        greenState = new GreenState(this);
        state = redState;
    }

    public void switchRed(){
        state.switchRed();
    }

    public void switchYellow(){
        state.switchYellow();
    }

    public void switchGreen(){
        state.switchGreen();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getRedState() {
        return redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public State getGreenState() {
        return greenState;
    }

    public State getState() {
        return state;
    }
}
