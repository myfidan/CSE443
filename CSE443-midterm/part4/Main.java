import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //DFT dft = new DFT(args[0], "DFToutputFile"); In this case it will not print execution time to screen
	    DFT dft = new DFT(args[0], "DFToutputFile",true); // For this execution time will be printed
        dft.TemplateTransform();

        DCT dct = new DCT(args[0], "DCToutputFile");
        dct.TemplateTransform();
    }
}
