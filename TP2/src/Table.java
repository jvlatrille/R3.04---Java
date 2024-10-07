public class Table {
    private String _numeroTable;
    private Client _monClient;

    public Table(String T){
        setTable(T);
    }

    public void setTable(String _numeroTable) {
        this._numeroTable = _numeroTable;
    }

    public void setMonClient(Client _monClient) {
        this._monClient = _monClient;
    }
}
