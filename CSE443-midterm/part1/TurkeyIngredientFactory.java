/**
 * return corresponding phone parts proporties according to Turkey factory table
 */
public class TurkeyIngredientFactory implements PhoneIngredientFactory {
    @Override
    public String AttachCpuRam() {
        return "8 cores";
    }

    @Override
    public String AttachDisplay() {
        return "32 bit";
    }

    @Override
    public String AttachBattery() {
        return "Lithum-Boron";
    }

    @Override
    public String AttachStorage() {
        return "Max 128 GB";
    }

    @Override
    public String AttachCamera() {
        return "Opt. zoom x4";
    }

    @Override
    public String EnclosePhoneCase() {
        return "Waterproof up to 2m";
    }
}
