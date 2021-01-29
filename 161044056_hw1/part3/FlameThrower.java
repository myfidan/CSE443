public class FlameThrower extends SuitDecorator {

    public FlameThrower(ArmoredSuit suit) {
        armoredSuit = suit;
    }

    /**
     * FlameThrower cost = 50
     * @return 50 + The rest suit cost
     */
    @Override
    public double cost() {
        return 50 + armoredSuit.cost();
    }

    /**
     * FlameThrower weight = 2
     * @return 2 + The rest suit weight
     */
    @Override
    public double weight() {
        return 2 + armoredSuit.weight();
    }

    @Override
    public String getDescription() {
        return armoredSuit.getDescription() + " FlameThrower ";
    }


}
