public class WebSite_2 implements Observer,Display {

    /**
     * This webside has only txt
     */
    private Observable observable;
    private String text;

    public WebSite_2(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    /**
     * This method will update website whenever text changed
     * @param observable subject
     */
    @Override
    public void update(Observable observable) {

        if(observable != null){
            WebSiteData ws = (WebSiteData) observable;
            this.text = ws.getText();
            display();
        }
    }

    /**
     * Print website fields
     */
    @Override
    public void display() {
        System.out.println("Website2: "+"text: "+text);
    }
}
