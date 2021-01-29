import java.text.DecimalFormat;

/**
 * This class for representing complex numbers in DFT
 */
public class ComplexNum {
    double real_part;
    double imag_part;

    public ComplexNum(double real_part, double imag_part) {
        this.real_part = real_part;
        this.imag_part = imag_part;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.0000");


        if(imag_part == 0){
            return ""+df.format(real_part);
        }
        else{
            if(imag_part<0){
                return ""+df.format(real_part)+df.format(imag_part)+"i";
            }
            else{
                return df.format(real_part)+"+"+df.format(imag_part)+"i";
            }
        }

    }
}
