/**
 * A proxy class for synchronize capability in DataBaseTable
 */
public class Proxy extends Thread implements ITable {
    private DataBaseTable dataBaseTable;

    Proxy(DataBaseTable dataBaseTable){
        this.dataBaseTable = dataBaseTable;
    }

    /**
     *This method synchronized
     * @param row database row num
     * @param column database colm num
     * @return database element
     */
    @Override
    public Object getElementAt(int row, int column) {
        this.setPriority(10);
        synchronized (this){
            return dataBaseTable.getElementAt(row,column);
        }
    }

    /**
     * This method synchronized
     * @param row database row num
     * @param column database colm num
     * @param o object
     */
    @Override
    public void setElementAt(int row, int column, Object o) {
        this.setPriority(1);
        synchronized (this){
            dataBaseTable.setElementAt(row,column,o);
        }
    }

    /**
     *
     * @return return number of rows
     */
    @Override
    public int getNumberOfRows() {
        return dataBaseTable.getNumberOfRows();
    }

    /**
     *
     * @return return number of columns
     */
    @Override
    public int getNumberOfColumns() {
        return dataBaseTable.getNumberOfColumns();
    }
}
