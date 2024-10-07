public class Client {
    private String _nom;
    private String _telephone;
    private Table _maTable;

    public Client(String nom, String tel){
        this.setNom(nom);
        this.setTelephone(tel);
    };

    public void setNom(String _nom) {
        this._nom = _nom;
    }

    public String getNom() {
        return _nom;
    }

    public void setTelephone(String telephone) {
        this._telephone = telephone;
    }

    public String getTelephone() {
        return _telephone;
    }

    public void setMaTable(Table maTable) {
        this._maTable = maTable;
    }

    public Table getMaTable() {
        return _maTable;
    }

    public void delierMaTable() {
        if (_maTable != null) {
            this._maTable.setMonClient(null);
            this.setMaTable(null);
        }
    }

    public void lierMaTable(Table laTable) {
        if (laTable != null && laTable.get_monClient() != null) {
            laTable.delierMonClient();
        }
        if (this.getMaTable() != null) {
            this.delierMaTable();
        }
        this.setMaTable(laTable);
    }

    public String toString() {
        String message  = "_nom (" + this.getNom() + "), _telephone (" + this.getTelephone() + ")";;
        if (_maTable != null){
            message +=  ", _maTable (" + this.getMaTable().get_numeroTable() + ")";
        }
        return message;
    }
}
