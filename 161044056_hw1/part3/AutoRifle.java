public class AutoRifle extends SuitDecorator {

    public AutoRifle(ArmoredSuit suit) {
        armoredSuit = suit;
    }

    /**
     * Autorifle cost = 30
     * @return 30 + the rest suit cost
     */
    @Override
    public double cost() {
        return 30 + armoredSuit.cost();
    }

    /**
     * Autorifle weight = 1.5
     * @return 1.5 + the rest suit weight
     */
    @Override
    public double weight() {
        return 1.5 + armoredSuit.weight();
    }

    @Override
    public String getDescription() {
        return armoredSuit.getDescription() + " AutoRifle ";
    }

}
