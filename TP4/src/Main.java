public class Main {
    public static void main(String[] args) {
        // Pièces simples
        PieceSimple rondelle = new PieceSimple("Rondelle", 2);
        PieceSimple levier = new PieceSimple("Levier", 5);
        PieceSimple molette = new PieceSimple("Molette", 3);
        PieceSimple bouton = new PieceSimple("Bouton", 4);

        // Pièce composée: Manette
        PieceComposee manette = new PieceComposee("Manette", 0);
        manette.ajouterPiece(rondelle);
        manette.ajouterPiece(levier);
        manette.ajouterPiece(molette);
        manette.ajouterPiece(bouton);

        // Pièce composée: Manivelle
        PieceComposee manivelle = new PieceComposee("Manivelle", 0);
        manivelle.ajouterPiece(rondelle);
        manivelle.ajouterPiece(levier);
        manivelle.ajouterPiece(molette);
        manivelle.ajouterPiece(bouton);

        // Affichage des pièces
        System.out.println(manette);
        System.out.println("Prix total de la manette: " + manette.getPrix());

        System.out.println(manivelle);
        System.out.println("Prix total de la manivelle: " + manivelle.getPrix());
    }
}
