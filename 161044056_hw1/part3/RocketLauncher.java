public class RocketLauncher extends SuitDecorator {

    public RocketLauncher(ArmoredSuit suit) {
        armoredSuit = suit;
    }

    /**
     * RocketLauncher cost = 150
     * @return 150 + the rest suit cost
     */
    @Override
    public double cost() {
        return 150 + armoredSuit.cost();
    }

    /**
     * RocketLauncher weight = 7.5
     * @return 7.5 + the rest suit weight
     */
    @Override
    public double weight() {
        return 7.5 + armoredSuit.weight();
    }

    @Override
    public String getDescription() {
        return armoredSuit.getDescription() + " RocketLauncher ";
    }

}
