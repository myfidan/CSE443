public abstract class PhoneStore {
    protected abstract SmartPhone createPhone(String type);

    /**
     * Create a phone according to value of type
     * @param type phone model
     * @return new phone
     */
    public SmartPhone orderPhone(String type){
        return createPhone(type);
    }
}
