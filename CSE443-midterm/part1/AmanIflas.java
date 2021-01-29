public class AmanIflas extends SmartPhone{
    PhoneIngredientFactory ingredientFactory;

    public AmanIflas(PhoneIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * Create phone by default proporties and corresponding factory
     */
    @Override
    void CreatePhone() {
        cpuRam = new CpuRam("2.2GHz,4GB " , ingredientFactory.AttachCpuRam());
        display = new Display("4.5 inches" , ingredientFactory.AttachDisplay());
        battery = new Battery("16h,2000mAh " , ingredientFactory.AttachBattery());
        storage = new Storage("MicroSD support,16 GB " , ingredientFactory.AttachStorage());
        camera = new Camera("8Mp front,5mp rear " , ingredientFactory.AttachCamera());
        phoneCase = new Case("143x69x7.3 mm waterproof,plastic " , ingredientFactory.EnclosePhoneCase());
    }
}
