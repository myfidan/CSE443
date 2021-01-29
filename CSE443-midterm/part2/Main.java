public class Main {

    public static void main(String[] args) {
	    TurboPayment turboPayment = new ModernPaymentAdapter(new ModernPaymentExample());
        turboPayment.payInTurbo("123",12,"956","hello");
    }
}
