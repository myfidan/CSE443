import java.util.Iterator;

/**
 * This is a Iterator for traverse array Anticlockwise
 */
public class AntiClockwiseIterator implements Iterator<Integer> {
    private int[][] arr;
    private int x_index=0;
    private int y_index=0;

    /**
     * In constructer it rearrange array for iteration it at Anticlockwise
     * @param arr2 our array
     */
    public AntiClockwiseIterator(int[][] arr2) {
        arr = new int[arr2[0].length][arr2.length];
        int x=0;
        int y=0;

        int topRow = 0,botRow =arr[0].length-1,leftColm = 0, rightColm = arr.length-1;
        int printWay = 0;
        while(topRow <= botRow && leftColm <= rightColm){

            if(printWay == 1){
                for(int i= leftColm; i<=rightColm; i++){
                    arr[x][y++] = arr2[botRow][i];
                    if(y == arr[0].length){
                        x++;
                        y = 0;
                    }
                }
                botRow--;
                printWay = 3;
            }
            else if(printWay == 0){
                for(int i= topRow; i<=botRow; i++){
                    arr[x][y++] = arr2[i][leftColm];
                    if(y == arr[0].length){
                        x++;
                        y = 0;
                    }
                }
                leftColm++;
                printWay = 1;
            }
            else if(printWay == 2){
                for(int i=rightColm; i>= leftColm; i--){
                    arr[x][y++] = arr2[topRow][i];
                    if(y == arr[0].length){
                        x++;
                        y = 0;
                    }
                }
                topRow++;
                printWay = 0;
            }
            else if(printWay ==3){
                for(int i=botRow; i >=topRow; i--){
                    arr[x][y++] = arr2[i][rightColm];
                    if(y == arr[0].length){
                        x++;
                        y = 0;
                    }
                }
                rightColm--;
                printWay=2;
            }
        }
    }

    /**
     * HasNext method same as the other iterators hasNext method
     * it just change traverse operation completed or not
     * @return if still there is elements that is not traversed it will return true,other wise false
     */
    @Override
    public boolean hasNext() {
        if(x_index == arr.length-1 && y_index == arr[x_index].length){
            return false;
        }
        return true;
    }

    /**
     *
     * @return return next element and change iterator to next position
     */
    @Override
    public Integer next() {
        if(y_index == arr[0].length){
            x_index++;
            y_index = 0;
        }
        return arr[x_index][y_index++];
    }
}
