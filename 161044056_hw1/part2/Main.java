import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Create observable
	    WebSiteData observable = new WebSiteData();
	    //Create my favorite sites and add them
	    WebSite_1 webSite_1 = new WebSite_1(observable);
        WebSite_2 webSite_2 = new WebSite_2(observable);
        WebSite_3 webSite_3 = new WebSite_3(observable);

        ArrayList<String> photos = new ArrayList<>();
        photos.add("photo1");
        photos.add("photo2");
        //Set observable
        // Now all websites will update their fields
        observable.setWebSite("test_deneme",photos,"audio_deneme");

    }
}
