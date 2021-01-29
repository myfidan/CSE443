public class CpuRam extends PhonePart{
    public CpuRam(String main,String spec){
        this.mainPart = main;
        this.specification = spec;
        System.out.println(this.mainPart+this.specification+" CpuRam created");
    }
}
