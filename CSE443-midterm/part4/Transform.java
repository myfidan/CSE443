import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Muhammed Yasir Fidan
 */
public abstract class Transform {
    /**
     * My input and output file names
     */
    protected String readFilename;
    protected String writeFilename;

    /**
     * This is my template method
     * @throws IOException if input or output file does not exist it will throw IOException
     */
    public final void TemplateTransform() throws IOException {
        ArrayList<Integer> numbers = readNumbersFromFile();
        ArrayList<Object> transformNums = calculateTransform(numbers);
        writeOutputToFile(transformNums);

        if(printExecutionTime()){
            Date date = new Date();
            System.out.println(date.toString());
        }
    }

    /**
     * Read from file part same for both DFT and DCT so I implement this method
     * in Transform class.
     * It just read file integers and return them as an arraylist
     * @return list of read elements
     * @throws FileNotFoundException if file does not exits, it will throw fileNotFoundException
     */
    public ArrayList<Integer> readNumbersFromFile() throws FileNotFoundException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        File file = new File(readFilename);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextInt())
        {
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }

    /**
     * Write elements to the file part is same for both DFT and DCT
     * So I implement it in super(Transform) class
     * @param transformNums results of transform calculations
     * @throws IOException if output file does not exist, it will throw an exception
     */
    public void writeOutputToFile(ArrayList<Object> transformNums) throws IOException {
        FileWriter file = new FileWriter(writeFilename);

        for(int i=0; i<transformNums.size(); i++){
            file.write(transformNums.get(i)+"   ");
        }

        file.close();

    }

    /**
     * This Transform calculate part different in both DFT and DCT
     * So I just declare it as an abstract class and sup classes will implement it
     * @param arr input file elements
     * @return It returns Arraylist<Object> because Dft return complex numbers but DCT return real numbers
     * So with this I can return both of them
     */
    public abstract ArrayList<Object> calculateTransform(ArrayList<Integer> arr);

    /**
     * Hook for print execution time on screen, It default false
     * @return false
     */
    public boolean printExecutionTime(){
        return false;
    }
}
