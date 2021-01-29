/**
 * I create this class for showing my program execution
 * it implements modernpayment pay method
 */
public class ModernPaymentExample implements ModernPayment{

    @Override
    public int pay(String cardNo, float amount, String destination, String installments) {
        System.out.println("I am in pay method of ModernPayment");
        System.out.println("cardNo: "+cardNo);
        System.out.println("amount: "+amount);
        System.out.println("destination: "+destination);
        System.out.println("installments: "+installments);
        return 1;
    }
}
