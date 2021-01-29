/**
 * return corresponding phone parts proporties according to EU factory table
 */
public class EUIngredientFactory implements PhoneIngredientFactory {
    @Override
    public String AttachCpuRam() {
        return "4 cores";
    }

    @Override
    public String AttachDisplay() {
        return "24 bit";
    }

    @Override
    public String AttachBattery() {
        return "Lithum-Ion";
    }

    @Override
    public String AttachStorage() {
        return "Max 64 GB";
    }

    @Override
    public String AttachCamera() {
        return "Opt. zoom x3";
    }

    @Override
    public String EnclosePhoneCase() {
        return "Waterproof up to 1m";
    }
}
