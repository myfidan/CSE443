public class Main {

    public static void main(String[] args) {

        PhoneStore turkeyStore = new TurkeyPhoneStore();
        PhoneStore globalStore = new GlobalPhoneStore();
        PhoneStore euStore = new EUPhoneStore();

        System.out.println("Turkey-IflasDeluxe");
        SmartPhone smartPhone = turkeyStore.orderPhone("IflasDeluxe");
        System.out.println(smartPhone);

        System.out.println("\nGlobal-IflasDeluxe");
        smartPhone = globalStore.orderPhone("IflasDeluxe");
        System.out.println(smartPhone);

        System.out.println("\nEU-IflasDeluxe");
        smartPhone = euStore.orderPhone("IflasDeluxe");
        System.out.println(smartPhone);

        System.out.println("\nTurkey-MaximumEffort");
        smartPhone = turkeyStore.orderPhone("MaximumEffort");
        System.out.println(smartPhone);

        System.out.println("\nGlobal-MaximumEffort");
        smartPhone = globalStore.orderPhone("MaximumEffort");
        System.out.println(smartPhone);

        System.out.println("\nEU-MaximumEffort");
        smartPhone = euStore.orderPhone("MaximumEffort");
        System.out.println(smartPhone);

        System.out.println("\nTurkey-AmanIflas");
        smartPhone = turkeyStore.orderPhone("AmanIflas");
        System.out.println(smartPhone);

        System.out.println("\nGlobal-AmanIflas");
        smartPhone = globalStore.orderPhone("AmanIflas");
        System.out.println(smartPhone);

        System.out.println("\nEU-AmanIflas");
        smartPhone = euStore.orderPhone("AmanIflas");
        System.out.println(smartPhone);
    }
}
