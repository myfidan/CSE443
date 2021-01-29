public class Main {

    public static void main(String[] args) {
        ITable table = new Proxy(new DataBaseTable());
        table.getNumberOfColumns();
        table.getNumberOfRows();
        table.getElementAt(1,1);
        table.setElementAt(1,1,null);
    }
}
