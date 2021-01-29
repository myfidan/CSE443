/**
 * return corresponding phone parts proporties according to Global factory table
 */
public class GlobalIngredientFactory implements PhoneIngredientFactory {
    @Override
    public String AttachCpuRam() {
        return "2 cores";
    }

    @Override
    public String AttachDisplay() {
        return "24 bit";
    }

    @Override
    public String AttachBattery() {
        return "Lithum-Cobalt";
    }

    @Override
    public String AttachStorage() {
        return "Max 32 GB";
    }

    @Override
    public String AttachCamera() {
        return "Opt. zoom x2";
    }

    @Override
    public String EnclosePhoneCase() {
        return "Waterproof up to 50cm";
    }
}
