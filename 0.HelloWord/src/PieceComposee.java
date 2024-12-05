import java.util.ArrayList;

public class PieceComposee extends PieceComposante {
    private ArrayList<PieceComposante> listePiece = new ArrayList<>();

    public PieceComposee(String libelle, int prix) {
        super(libelle, prix);
    }

    public int getPrix() {
        int res = super.getPrix();
        for(PieceComposante item : this.getListePiece()){
            res += item.getPrix();
        }
        return res;
    }

    public ArrayList<PieceComposante> getListePiece() {
        return listePiece;
    }

    public void setListePiece(ArrayList<PieceComposante> listePiece) {
        this.listePiece = listePiece;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Pièce composée: " + getLibelle() + ", Prix total: " + getPrix() + "\n");
        for (PieceComposante composant : listePiece) {
            result.append(composant.toString()).append("\n");
        }
        return result.toString();
    }

    public boolean ajouterPiece(PieceComposante piece) {
        return listePiece.add(piece);
    }

    public boolean retirerPiece(PieceComposante piece) {
        return listePiece.remove(piece);
    }

    public boolean existePiece(PieceComposante piece) {
        return listePiece.contains(piece);
    }
}
