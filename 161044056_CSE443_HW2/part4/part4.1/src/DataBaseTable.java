public class DataBaseTable implements ITable{


    @Override
    public Object getElementAt(int row, int column) {
        System.out.println("Database Table getElementAt called");
        return null;
    }

    @Override
    public void setElementAt(int row, int column, Object o) {
        System.out.println("DataBase Table setElementAt called");
    }

    @Override
    public int getNumberOfRows() {
        System.out.println("DataBase Table getNumberOfRows called");
        return 0;
    }

    @Override
    public int getNumberOfColumns() {
        System.out.println("DataBase Table getNumberOfColumns called");
        return 0;
    }
}
