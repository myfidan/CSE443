import java.util.ArrayList;
import java.util.List;

/**
 * Camera is a subject
 */
public class HiTech implements Subject{
    private List<Observer> observers;
    private int greenSecond;

    public HiTech() {
        observers = new ArrayList<>();
    }

    /**
     * If flag is true greesecond will be 90 orherwise it will 60 seconds
     * @param flag check its true or not to indicate green seconds
     */
    public void changeDetected(boolean flag){
        if(flag){
            greenSecond = 90;
        }
        else{
            greenSecond = 60;
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update(greenSecond);
        }
    }
}
