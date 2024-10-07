
public class Client {
    private String _nom;
    private String _telephone;
    private Table _maTable;

    public Client(String nom, String tel){
        setNom(nom);
        setTelephone(tel);
    };

    public void setNom(String _nom) {
        this._nom = _nom;
    }

    public String getNom() {
        return _nom;
    }

    public void setTelephone(String _telephone) {
        this._telephone = _telephone;
    }

    public String getTelephone() {
        return _telephone;
    }

    public void setMaTable(Table _maTable) {
        this._maTable = _maTable;
    }

    public Table getMaTable() {
        return _maTable;
    }
}
