public class Camera extends PhonePart{
    public Camera(String main,String spec){
        this.mainPart = main;
        this.specification = spec;
        System.out.println(this.mainPart+this.specification+" Camera created");
    }
}
