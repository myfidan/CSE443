public class Ora extends ArmoredSuit {

    Ora(){
        description = " Ora ";
    }

    /**
     * Override cost method
     * Ora cost 1500
     * @return 1500
     */
    @Override
    public double cost() {
        return 1500;
    }

    /**
     * Override weight method
     * Ora weight 30
     * @return 30
     */
    @Override
    public double weight() {
        return 30;
    }
}
