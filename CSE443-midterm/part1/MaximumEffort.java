public class MaximumEffort extends SmartPhone {
    PhoneIngredientFactory ingredientFactory;

    public MaximumEffort(PhoneIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * Create phone by default proporties and corresponding factory
     */
    @Override
    void CreatePhone() {
        cpuRam = new CpuRam("2.8GHz,8GB " , ingredientFactory.AttachCpuRam());
        display = new Display("5.5 inches" , ingredientFactory.AttachDisplay());
        battery = new Battery("27h,3600mAh " , ingredientFactory.AttachBattery());
        storage = new Storage("MicroSD support,64 GB" , ingredientFactory.AttachStorage());
        camera = new Camera("12Mp front,8mp rear " , ingredientFactory.AttachCamera());
        phoneCase = new Case("151x73x7.7 mm dustproof,waterproof,aluminum " , ingredientFactory.EnclosePhoneCase());
    }
}
