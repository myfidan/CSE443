import java.util.ArrayList;

public class DCT extends Transform {

    /**
     * Construct input file and output file
     * @param readFile input file
     * @param writeFile output file
     */
    public DCT(String readFile,String writeFile) {
        readFilename = readFile;
        writeFilename = writeFile;
    }

    /**
     * Override calculateTransform method
     * This transform by using DCT
     * @param arr input file elements
     * @return transformed numbers
     */
    @Override
    public ArrayList<Object> calculateTransform(ArrayList<Integer> arr) {

        ArrayList<Object> Nums = new ArrayList<>();
        for(int i=0; i< arr.size(); i++){
            double sum = 0;
            double val = 1.0;
            if (i == 0) val = Math.sqrt(0.5);
            for(int j=0; j<arr.size(); j++){
                sum += arr.get(j)*val*Math.cos(Math.PI/arr.size() * (j+0.5) * i);
            }

            Nums.add(Math.round(sum*Math.sqrt(2.0/arr.size())*10000.0)/10000.0);


        }

        return Nums;
    }
}
