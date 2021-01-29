public class Laser extends SuitDecorator {

    public Laser(ArmoredSuit suit) {
        armoredSuit = suit;
    }

    /**
     * Laser cost = 200
     * @return 200 + the rest suit cost
     */
    @Override
    public double cost() {
        return 200 + armoredSuit.cost();
    }

    /**
     * Laser weight = 5.5
     * @return 5.5 + the rest suit weight
     */
    @Override
    public double weight() {
        return 5.5 + armoredSuit.weight();
    }

    @Override
    public String getDescription() {
        return armoredSuit.getDescription() + " Laser ";
    }
}
