public class Case extends PhonePart {
    public Case(String main,String spec){
        this.mainPart = main;
        this.specification = spec;
        System.out.println(this.mainPart+this.specification+" Case created");
    }
}
