public class IflasDeluxe extends SmartPhone{
    PhoneIngredientFactory ingredientFactory;

    public IflasDeluxe(PhoneIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * Create phone by default proporties and corresponding factory
     */
    @Override
    void CreatePhone() {
        cpuRam = new CpuRam("2.2GHz,6GB ",ingredientFactory.AttachCpuRam());
        display = new Display("5.3 inches " , ingredientFactory.AttachDisplay());
        battery = new Battery("20h,2800mAh " , ingredientFactory.AttachBattery());
        storage = new Storage("MicroSD support,32 GB " , ingredientFactory.AttachStorage());
        camera = new Camera("12Mp front,5mp rear " , ingredientFactory.AttachCamera());
        phoneCase = new Case("149x73x7.7 mm waterproof,aluminum " , ingredientFactory.EnclosePhoneCase());
    }


}
