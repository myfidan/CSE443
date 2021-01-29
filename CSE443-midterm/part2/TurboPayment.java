/**
 * Turbo payment interface just has PayInTurbo method
 */
public interface TurboPayment {
    int payInTurbo(String turboCardNo,float turboAmount,String destinationTurboOfCourse, String installmentsButInTurbo);
}
