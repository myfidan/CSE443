public class EUPhoneStore extends PhoneStore {

    /**
     * Create phone in Eu factory according to value of string
     * if String IflasDeluxe create a IflasDeluxe model phone in Eu factory
     * and so on
     * @param type type of phone
     * @return Smartphone
     */
    @Override
    protected SmartPhone createPhone(String type) {
        SmartPhone phone = null;
        PhoneIngredientFactory ingredientFactory = new EUIngredientFactory();

        if(type.equals("IflasDeluxe")){
            phone = new IflasDeluxe(ingredientFactory);
            phone.CreatePhone();
        }
        else if(type.equals("AmanIflas")){
            phone = new AmanIflas(ingredientFactory);
            phone.CreatePhone();
        }
        else if(type.equals("MaximumEffort")){
            phone = new MaximumEffort(ingredientFactory);
            phone.CreatePhone();
        }
        return phone;
    }
}
