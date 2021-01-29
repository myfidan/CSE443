public abstract class ArmoredSuit {

    protected String description;

    /**
     * Abstract cost method for calculating total suit cost
     * @return double cost
     */
    public abstract double cost();

    /**
     * Abstract weight method for calculating total suit weight
     * @return
     */
    public abstract double weight();

    public String getDescription() {
        return description;
    }
}
