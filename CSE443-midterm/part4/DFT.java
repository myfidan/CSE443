import java.util.ArrayList;

public class DFT extends Transform{
    /**
     * If true print execution time
     * default False
     */
    private boolean printExecutionTime;

    /**
     * Costructer without printExecutionTime
     * In this case DFT not print execution time to the screen
     * @param readFile input file
     * @param writeFile output file
     */
    public DFT(String readFile, String writeFile) {
        readFilename = readFile;
        writeFilename = writeFile;
        printExecutionTime = false;
    }

    /**
     *
     * @param readFile input file
     * @param writeFile output file
     * @param printExecutionTime If true print execution time to screen
     */
    public DFT(String readFile, String writeFile,boolean printExecutionTime) {
        readFilename = readFile;
        writeFilename = writeFile;
        this.printExecutionTime = printExecutionTime;
    }

    /**
     * Override calculateTransform method
     * Transform by using DFT
     * @param arr input file elements
     * @return transformed values
     */
    @Override
    public ArrayList<Object> calculateTransform(ArrayList<Integer> arr) {

        ArrayList<Object> complexNums = new ArrayList<>();

        for(int i=0; i<arr.size(); i++){
            double real = 0;
            double img = 0;
            for(int j=0; j<arr.size(); j++){
                real += arr.get(j) * Math.cos((2 * i * j * Math.PI) / arr.size());
                img += arr.get(j) * Math.sin((2 * i * j * Math.PI) / arr.size());
            }

            complexNums.add(new ComplexNum(real,-img));
        }

        return complexNums;
    }

    /**
     * For print execution time to the screen
     * @return printExecutionTime
     */
    @Override
    public boolean printExecutionTime() {
        return printExecutionTime;
    }
}
