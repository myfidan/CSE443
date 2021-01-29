public class Dec extends ArmoredSuit{

    Dec(){
        description = " Dec ";
    }

    /**
     * Override cost method
     * Dec cost 500
     * @return 500
     */
    @Override
    public double cost() {
        return 500;
    }

    /**
     * Override weight method
     * Dec weight 25
     * @return 25
     */
    @Override
    public double weight() {
        return 25;
    }
}
