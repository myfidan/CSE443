public class Battery extends PhonePart {
    public Battery(String main,String spec){
        this.mainPart = main;
        this.specification = spec;
        System.out.println(this.mainPart+this.specification+" Battery created");
    }
}
