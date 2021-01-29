/**
 * Adapter for using modern payment pay method in TurboPayment payInTurbo method
 */
public class ModernPaymentAdapter implements TurboPayment{
    private ModernPayment modernPayment;

    public ModernPaymentAdapter(ModernPayment modernPayment){
        this.modernPayment = modernPayment;
    }

    @Override
    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo) {
        return modernPayment.pay(turboCardNo,turboAmount,destinationTurboOfCourse,installmentsButInTurbo);
    }
}
