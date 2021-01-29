public class Tor extends ArmoredSuit {

    Tor(){
        description = " Tor ";
    }

    /**
     * Override cost method
     * Tor cost 5000
     * @return 5000
     */
    @Override
    public double cost() {
        return 5000;
    }

    /**
     * Override weight method
     * Tor weight 50
     * @return 50
     */
    @Override
    public double weight() {
        return 50;
    }
}
