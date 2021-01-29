import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();

    /**
     * Add observer(Website) to the observable
     * @param o this observer will be add to the system
     */
    public void addObserver(Observer o){
        observers.add(o);
    }

    /**
     * Delete a observer(Web site) from observable
     * @param o this observer will be deleted if its subscribe to the observable
     */
    public void deleteObserver(Observer o){
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    /**
     * With this method observable will notify all its subscriber websites
     * and update them
     */
    public void notifyObservers(){
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update(this);
        }
    }
}
