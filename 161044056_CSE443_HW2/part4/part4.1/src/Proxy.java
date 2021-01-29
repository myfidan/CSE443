/**
 * A proxy class for synchronize capability in DataBaseTable
 */
public class Proxy implements ITable {
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
    public synchronized Object getElementAt(int row, int column) {

        return dataBaseTable.getElementAt(row,column);
    }

    /**
     * This method synchronized
     * @param row database row num
     * @param column database colm num
     * @param o object
     */
    @Override
    public synchronized void setElementAt(int row, int column, Object o) {
        dataBaseTable.setElementAt(row,column,o);
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
