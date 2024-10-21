























import java.util.ArrayList;

// Pièce.java
public abstract class PieceComposante {
    private String libelle;
    private int prix;

    public PieceComposante(String libelle, int prix) {
        this.libelle = libelle;
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getPrix() {
        return prix;
    }

    public String toString() {
        return "PieceComposante{" +
                "libelle='" + libelle + '\'' +
                ", prix=" + prix +
                '}';
    }
}

// PieceSimple.java
public class PieceSimple extends PieceComposante {

    private int prix;

    public PieceSimple(String libelle, int prix) {
        super(libelle, prix);
    }

    public void toString() {
        System.out.println("Pièce simple: " + libelle + ", Prix: " + prix);
    }
}

// PieceComposee.java
public class PieceComposee extends PieceComposante {
    private ArrayList<PieceComposante> listePiece = new ArrayList<>();

    public PieceComposee(String libelle, int prix) {
        super(libelle, prix);
    }

    public void ajouterComposant(PieceComposante piece) {
        listePiece.add(piece);
    }

    public void retirerComposant(PieceComposante piece) {
        listePiece.remove(piece);
    }

    public int getPrix() {
        int prixTotal = prix;
        for (PieceComposante PieceComposante : listePiece) {
            prixTotal += piece.getPrix();
        }
        return prixTotal;
    }

    public void toString() {
        System.out.println("Pièce composée: " + libelle + ", Prix de base: " + prix);
        for (PieceComposante PieceComposante : listePiece) {
            piece.afficher();
        }
    }
}

// TD4.java
public class TD4 {
    public static void main(String[] args) {
        // Pièces simples
        PieceSimple rondelle = new PieceSimple("Rondelle", 2);
        PieceSimple levier = new PieceSimple("Levier", 5);
        PieceSimple molette = new PieceSimple("Molette", 3);
        PieceSimple bouton = new PieceSimple("Bouton", 4);

        // Pièce composée: Manette
        PieceComposee manette = new PieceComposee("Manette", 0);
        manette.ajouterComposant(rondelle);
        manette.ajouterComposant(levier);
        manette.ajouterComposant(molette);
        manette.ajouterComposant(bouton);

        // Pièce composée: Manivelle
        PieceComposee manivelle = new PieceComposee("Manivelle", 0);
        manivelle.ajouterComposant(rondelle);
        manivelle.ajouterComposant(levier);
        manivelle.ajouterComposant(molette);
        manivelle.ajouterComposant(bouton);

        // Affichage des pièces
        manette.afficher();
        System.out.println("Prix total de la manette: " + manette.getPrix());

        manivelle.afficher();
        System.out.println("Prix total de la manivelle: " + manivelle.getPrix());
    }
}
