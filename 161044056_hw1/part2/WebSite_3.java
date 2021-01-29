public class WebSite_3 implements Observer,Display {

    /**
     * This webside has only txt
     */
    private Observable observable;
    private String text;

    public WebSite_3(Observable observable) {
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

        System.out.println("Website3: "+"text: "+text);
    }
}
