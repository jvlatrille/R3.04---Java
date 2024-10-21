public class PieceSimple extends PieceComposante {

    private int prix;

    public PieceSimple(String libelle, int prix) {
        super(libelle, prix);
    }

    public int getPrix() {
        return super.getPrix();
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Pièce simple: " + getLibelle() + ", Prix: " + getPrix();
    }
}
