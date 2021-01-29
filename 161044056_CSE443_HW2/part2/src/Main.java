import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Gokturk gokturk = new Gokturk(arr);

        Iterator<Integer> iter = gokturk.createIterator(IteratorType.Clockwise);
        Iterator<Integer> iter2 = gokturk.createIterator(IteratorType.AntiClockwise);

        System.out.print("Clockwise traverse: ");
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.print("\nAnti-clockwise traverse: ");
        while (iter2.hasNext()){
            System.out.print(iter2.next()+" ");
        }
    }
}
