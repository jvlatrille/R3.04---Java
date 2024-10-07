public class Table {
    private String _numeroTable;
    private Client _monClient;

    public Table(String T){
        this.setTable(T);
    }

    public void setTable(String numeroTable) {
        this._numeroTable = numeroTable;
    }

    public void setMonClient(Client monClient) {
        this._monClient = monClient;
    }

    public Client get_monClient() {
        return _monClient;
    }

    public String get_numeroTable() {
        return _numeroTable;
    }

    public String toString() {
        String message  = "_numeroTable (" + this.get_numeroTable() + ")";
        if (_monClient != null){
            message +=  ", _monClient (" + this.get_monClient().getNom() + ")";
        }
        return message;
    }

    public void delierMonClient(){
        if (_monClient != null) {
            this._monClient.setMaTable(null);
            this.setMonClient(null);
        }
    }

    public void lierMonClient(Client leClient){
        if (this.get_monClient() != null) {
            this.delierMonClient();
        }
        leClient.delierMaTable();
        this.setMonClient(leClient);
        leClient.setMaTable(this);
    }

}
