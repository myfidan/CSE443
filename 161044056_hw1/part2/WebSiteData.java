import java.util.ArrayList;

/**
 * This class hold websites contexts and websites can update their
 * interested context with pulling corresponding datafields with get methods.
 */
public class WebSiteData extends Observable {
    private String text;
    private ArrayList<String> photographs;
    private String audio;


    /**
     * This set method for demo purpose
     * I will change website context and show that it automatically update favorite websites.
     * @param text text field
     * @param photos photo field
     * @param audio audio field
     */
    public void setWebSite(String text, ArrayList<String> photos, String audio){
        this.text = text;
        this.photographs = photos;
        this.audio = audio;
        notifyObservers();
    }

    public String getText() {
        return text;
    }

    public ArrayList<String> getPhotographs() {
        return photographs;
    }

    public String getAudio() {
        return audio;
    }
}
