/**
 * TrafficLight hold all states and current state
 */
public class TrafficLight implements Observer{
    private State redState;
    private State yellowState;
    private State greenState;

    private State state;
    private Subject subject;
    private int timeout_X = 60;

    public TrafficLight(Subject subject){
        redState = new RedState(this);
        yellowState = new YellowState(this);
        greenState = new GreenState(this);
        state = redState;

        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        timeout_X = value;
    }

    public void switchRed(){
        state.switchRed();
    }

    public void switchYellow(){
        state.switchYellow(timeout_X);
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
