
abstract class PieceComposante {
    private String libelle;
    private int prix;

    public PieceComposante(String libelle, int prix) {
        this.libelle = libelle;
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Libelle : " + getLibelle() + " Prix : " + getPrix();
    }
}
