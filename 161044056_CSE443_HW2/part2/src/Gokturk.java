import java.util.Iterator;

/**
 * Out Gokturk Satellite it take an array and traverse this array according to type of iterator
 */
public class Gokturk implements Satellite{
    private int[][] arr;

    public Gokturk(int[][] arr) {
        this.arr = arr;
    }

    @Override
    public Iterator<Integer> createIterator(IteratorType iterType) {
        if(iterType == IteratorType.Clockwise){
            return new ClockwiseIterator(arr);
        }
        else if(iterType == IteratorType.AntiClockwise){
            return new AntiClockwiseIterator(arr);
        }
        return null;
    }
}
