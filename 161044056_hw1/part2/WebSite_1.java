public class WebSite_1 implements Observer,Display {
    /**
     * This webside has txt and audio field
     */
    private Observable observable;
    private String text;
    private String audio;

    public WebSite_1(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    /**
     * This method will update website whenever text or audio changed
     * @param observable subject
     */
    @Override
    public void update(Observable observable) {

        if(observable != null){
            WebSiteData ws = (WebSiteData) observable;
            this.text = ws.getText();
            this.audio = ws.getAudio();
            display();
        }
    }

    /**
     * Print website fields
     */
    @Override
    public void display(){
        System.out.println("Website1: "+"text: "+text+" audio: "+audio);
    }
}


