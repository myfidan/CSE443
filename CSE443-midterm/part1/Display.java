public class Display extends PhonePart {


    public Display(String main,String spec) {
        this.mainPart = main;
        this.specification = spec;
        System.out.println(this.mainPart+this.specification+" Display created");
    }
}
